/*
 * generated by Xtext
 */
package dk.itu.smdp.group19.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IGenerator
import org.eclipse.xtext.generator.IFileSystemAccess
import surveymodel.Survey
import surveymodel.Page
import surveymodel.Question
import surveymodel.DescriptionPage
import surveymodel.QuestionPage
import surveymodel.SingleChoiceQuestion
import surveymodel.MultiChoiceQuestion
import surveymodel.FreetextQuestion

/**
 * Generates code from your model files on save.
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#TutorialCodeGeneration
 */
class SurveyDSLGenerator implements IGenerator {
	def static compileToXml(Survey it) {
		'''
			<Survey name="«it.title»">
				<pages>
					«FOR page : pages»
						<"«page.eClass.name»" name="«page.title»" description="«page.text»">
						«IF page.eClass instanceof QuestionPage» 
						// If statement does not evaluate to true!!!
							«val questionPage = page as QuestionPage»
							«FOR question : questionPage.questions»
								«IF question.eClass instanceof SingleChoiceQuestion»
									«val singleQuestion = question as SingleChoiceQuestion»
									«FOR answer : singleQuestion.answers»
										<"«question.eClass»" name="«singleQuestion.answers»"
									«ENDFOR»
								«ENDIF»
								«IF question.eClass instanceof MultiChoiceQuestion»
									«val multiQuestion = question as MultiChoiceQuestion»
									«FOR answer : multiQuestion.answers»
										<"«question.eClass»" name="«multiQuestion.answers»"
									«ENDFOR»
								«ENDIF»
								«IF question.eClass instanceof FreetextQuestion»
									«val freeQuestion = question as FreetextQuestion»
									<"«question.eClass»" name="«freeQuestion.answers»"
								«ENDIF»
							«ENDFOR» 
						«ENDIF»
					«ENDFOR»
				</pages>
			</Survey>
		'''
		
		
		
	}
	
	
	override void doGenerate(Resource resource, IFileSystemAccess fsa) {
		for(e: resource.allContents.toIterable.filter(Survey)) {
			fsa.generateFile("surveys/" + e.title.toString() + ".xml",
      			e.compileToXml)
		}
	}
}
