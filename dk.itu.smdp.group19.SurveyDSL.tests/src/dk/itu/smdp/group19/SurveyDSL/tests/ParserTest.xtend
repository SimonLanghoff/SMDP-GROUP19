package dk.itu.smdp.group19.SurveyDSL.tests

import dk.itu.smdp.group19.SurveyDSLInjectorProvider
import javax.inject.Inject
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.util.ParseHelper
import static org.junit.Assert.*
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import surveymodel.ChoiceAnswer
import surveymodel.DescriptionPage
import surveymodel.FreetextAnswer
import surveymodel.FreetextQuestion
import surveymodel.MultiChoiceQuestion
import surveymodel.QuestionPage
import surveymodel.SingleChoiceQuestion
import surveymodel.Survey
import surveymodel.SurveymodelPackage
import surveymodel.ResultPage

@InjectWith(SurveyDSLInjectorProvider)
@RunWith(XtextRunner)
class ParserTest {
	@Inject
	ParseHelper<Survey> parser
	
	@Before
	def void testSetup() {
		SurveymodelPackage.eINSTANCE.eClass()
	}
	
	
	def isErrorFree(ResourceSet it) {
		return it.resources.forall[errors.empty]
	}
	
	@Test
	def void testExampleSurvey() {
		var it = new ResourceSetImpl
		val survey = parser.parse(
						"start survey \"Mobile Survey\" 
							pages:
								description page \"Introduction\" : \"Welcome to this survey about Mobile Phones\"
								end page
								question page \"Brand Familiarity\" : \"This page is about various smartphone brands\"
									questions:
										multi choice question \"Please specify which smartphone brands you know of\"
											answers:
												answer choice KnowHTC : \"HTC\"
												answer choice KnowApple : \"Apple\"
												answer choice KnowSamsung : \"Samsung\"
												answer text KnowBrandOther : \"Other\"
										end question		
										single choice question \"Please select which smartphone brand you like the most\"
											answers:
												answer choice LikeHTC : \"HTC\"
												answer choice LikeApple : \"Apple\"
												answer choice LikeSamsung : \"Samsung\"
												answer text LikeBrandOther : \"Other\"
										end question
								end page
								question page \"Smartphone Possesion\" : \"This page is about Smartphone possession\"
									questions:
										single choice question \"Do you own a smartphone?\"
											answers:
												answer choice possesionYes : \"Yes\"
												answer choice possesionNo  : \"No\"
										end question
										single choice question \"What is the brand of your smartphone?\"
											requires: possesionYes and not possesionNo
											answers:
												answer choice ownsHTC : \"HTC\"
												answer choice ownsApple : \"Apple\"
												answer choice ownsSamsung : \"Samsung\"
												answer text ownsOther : \"Other\"
										end question
								end page
								question page  \"Feedback\" : \"On this page you can provide us with very important feedback\"
									questions:
										optional free text question \"Please give us some very important feedback about this survey\"		
											answers:
												answer text answerFeedback : \"Please write very important feedback here\"
									end question
								end page
								result page \"Thank you!\" : \"Thank you for participating in this survey, we like you!\"
								end page
							end survey", it)
		
		assertTrue(isErrorFree)
		assertTrue(survey.pages.size == 5)
		assertTrue(survey.pages.get(0) instanceof DescriptionPage)
		assertTrue(survey.pages.get(1) instanceof QuestionPage)
		assertTrue(survey.pages.get(2) instanceof QuestionPage)
		assertTrue(survey.pages.get(3) instanceof QuestionPage)
		assertTrue(survey.pages.get(4) instanceof ResultPage)
		assertTrue((survey.pages.get(3) as QuestionPage).questions.get(0).optional)
	}
	
	@Test
	def void testFreetext() {
		var it = new ResourceSetImpl
		val survey = parser.parse(
						"start survey \"title\"
							pages:
								question page \"page\" : \"description\"
									questions:
										free text question \"question\"
											answers: answer text answerA : \"\"
										end question
								end page
						end survey", it)
		
		assertTrue(isErrorFree)
		assertTrue(survey.pages.size == 1)
		assertTrue(survey.pages.get(0) instanceof QuestionPage)
		assertTrue((survey.pages.get(0) as QuestionPage).questions.get(0) instanceof FreetextQuestion)
		assertTrue(((survey.pages.get(0) as QuestionPage).questions.get(0) as FreetextQuestion).answers instanceof FreetextAnswer)
	}
	
	@Test
	def void testSinglechoice() {
		var it = new ResourceSetImpl
		val survey = parser.parse(
						"start survey \"title\"
							pages:
								question page \"page\" : \"description\"
									questions:
										single choice question \"question\"
											answers:
												answer choice answerA : \"\"
												answer choice answerB : \"\"
												answer text answerC : \"\"
										end question
								end page
						end survey", it)
		
		assertTrue(isErrorFree)
		assertTrue(survey.pages.size == 1)
		assertTrue(survey.pages.get(0) instanceof QuestionPage)
		assertTrue((survey.pages.get(0) as QuestionPage).questions.get(0) instanceof SingleChoiceQuestion)
		assertTrue(((survey.pages.get(0) as QuestionPage).questions.get(0) as SingleChoiceQuestion).answers.forall[it instanceof ChoiceAnswer || it instanceof FreetextAnswer])
	}
	
	@Test
	def void testMultichoice() {
		var it = new ResourceSetImpl
		val survey = parser.parse(
						"start survey \"title\"
							pages:
								question page \"page\" : \"description\"
									questions:
										multi choice question \"question\"
											answers:
												answer choice answerA : \"\"
												answer choice answerB : \"\"
												answer text answerC : \"\"
										end question
								end page
						end survey", it)
		
		assertTrue(isErrorFree)
		assertTrue(survey.pages.size == 1)
		assertTrue(survey.pages.get(0) instanceof QuestionPage)
		assertTrue((survey.pages.get(0) as QuestionPage).questions.get(0) instanceof MultiChoiceQuestion)
		assertTrue(((survey.pages.get(0) as QuestionPage).questions.get(0) as MultiChoiceQuestion).answers.forall[it instanceof ChoiceAnswer || it instanceof FreetextAnswer])
	}
	
	@Test
	def void testNegative() {
		var it = new ResourceSetImpl
		val survey = parser.parse(
						"start survey \"title\"
							pages:
								question page \"page\" : \"description\"
									questions:
										multi choice question \"question\"
											answers:
												answer choice answerA : \"\"
												answer choice answerB : \"\"
												answer choice answerC : \"\"
										end question
								end page
						end stuff", it)
		
		assertFalse(isErrorFree)
		assertFalse(survey.pages.size != 1)
		assertFalse(survey.pages.get(0) instanceof DescriptionPage)
		assertFalse((survey.pages.get(0) as QuestionPage).questions.get(0) instanceof SingleChoiceQuestion)
		assertFalse(((survey.pages.get(0) as QuestionPage).questions.get(0) as MultiChoiceQuestion).answers.exists[it instanceof FreetextAnswer])
	}
}