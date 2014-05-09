package dk.itu.smdp.group19.SurveyDSL.tests;

import dk.itu.smdp.group19.SurveyDSLInjectorProvider;
import javax.inject.Inject;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.Resource.Diagnostic;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.junit4.util.ParseHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import surveymodel.Answer;
import surveymodel.ChoiceAnswer;
import surveymodel.DescriptionPage;
import surveymodel.FreetextAnswer;
import surveymodel.FreetextQuestion;
import surveymodel.MultiChoiceQuestion;
import surveymodel.Page;
import surveymodel.Question;
import surveymodel.QuestionPage;
import surveymodel.ResultPage;
import surveymodel.SingleChoiceQuestion;
import surveymodel.Survey;
import surveymodel.SurveymodelPackage;

@InjectWith(SurveyDSLInjectorProvider.class)
@RunWith(XtextRunner.class)
@SuppressWarnings("all")
public class ParserTest {
  @Inject
  private ParseHelper<Survey> parser;
  
  @Before
  public void testSetup() {
    SurveymodelPackage.eINSTANCE.eClass();
  }
  
  public boolean isErrorFree(final ResourceSet it) {
    EList<Resource> _resources = it.getResources();
    final Function1<Resource,Boolean> _function = new Function1<Resource,Boolean>() {
      public Boolean apply(final Resource it) {
        EList<Diagnostic> _errors = it.getErrors();
        boolean _isEmpty = _errors.isEmpty();
        return Boolean.valueOf(_isEmpty);
      }
    };
    return IterableExtensions.<Resource>forall(_resources, _function);
  }
  
  @Test
  public void testExampleSurvey() {
    try {
      ResourceSetImpl _resourceSetImpl = new ResourceSetImpl();
      ResourceSetImpl it = _resourceSetImpl;
      final Survey survey = this.parser.parse(
        "start survey \"Mobile Survey\" \n\t\t\t\t\t\t\tpages:\n\t\t\t\t\t\t\t\tdescription page \"Introduction\" : \"Welcome to this survey about Mobile Phones\"\n\t\t\t\t\t\t\t\tend page\n\t\t\t\t\t\t\t\tquestion page \"Brand Familiarity\" : \"This page is about various smartphone brands\"\n\t\t\t\t\t\t\t\t\tquestions:\n\t\t\t\t\t\t\t\t\t\tmulti choice question \"Please specify which smartphone brands you know of\"\n\t\t\t\t\t\t\t\t\t\t\tanswers:\n\t\t\t\t\t\t\t\t\t\t\t\tanswer choice KnowHTC : \"HTC\"\n\t\t\t\t\t\t\t\t\t\t\t\tanswer choice KnowApple : \"Apple\"\n\t\t\t\t\t\t\t\t\t\t\t\tanswer choice KnowSamsung : \"Samsung\"\n\t\t\t\t\t\t\t\t\t\t\t\tanswer text KnowBrandOther : \"Other\"\n\t\t\t\t\t\t\t\t\t\tend question\t\t\n\t\t\t\t\t\t\t\t\t\tsingle choice question \"Please select which smartphone brand you like the most\"\n\t\t\t\t\t\t\t\t\t\t\tanswers:\n\t\t\t\t\t\t\t\t\t\t\t\tanswer choice LikeHTC : \"HTC\"\n\t\t\t\t\t\t\t\t\t\t\t\tanswer choice LikeApple : \"Apple\"\n\t\t\t\t\t\t\t\t\t\t\t\tanswer choice LikeSamsung : \"Samsung\"\n\t\t\t\t\t\t\t\t\t\t\t\tanswer text LikeBrandOther : \"Other\"\n\t\t\t\t\t\t\t\t\t\tend question\n\t\t\t\t\t\t\t\tend page\n\t\t\t\t\t\t\t\tquestion page \"Smartphone Possesion\" : \"This page is about Smartphone possession\"\n\t\t\t\t\t\t\t\t\tquestions:\n\t\t\t\t\t\t\t\t\t\tsingle choice question \"Do you own a smartphone?\"\n\t\t\t\t\t\t\t\t\t\t\tanswers:\n\t\t\t\t\t\t\t\t\t\t\t\tanswer choice possesionYes : \"Yes\"\n\t\t\t\t\t\t\t\t\t\t\t\tanswer choice possesionNo  : \"No\"\n\t\t\t\t\t\t\t\t\t\tend question\n\t\t\t\t\t\t\t\t\t\tsingle choice question \"What is the brand of your smartphone?\"\n\t\t\t\t\t\t\t\t\t\t\trequires: possesionYes and not possesionNo\n\t\t\t\t\t\t\t\t\t\t\tanswers:\n\t\t\t\t\t\t\t\t\t\t\t\tanswer choice ownsHTC : \"HTC\"\n\t\t\t\t\t\t\t\t\t\t\t\tanswer choice ownsApple : \"Apple\"\n\t\t\t\t\t\t\t\t\t\t\t\tanswer choice ownsSamsung : \"Samsung\"\n\t\t\t\t\t\t\t\t\t\t\t\tanswer text ownsOther : \"Other\"\n\t\t\t\t\t\t\t\t\t\tend question\n\t\t\t\t\t\t\t\tend page\n\t\t\t\t\t\t\t\tquestion page  \"Feedback\" : \"On this page you can provide us with very important feedback\"\n\t\t\t\t\t\t\t\t\tquestions:\n\t\t\t\t\t\t\t\t\t\toptional free text question \"Please give us some very important feedback about this survey\"\t\t\n\t\t\t\t\t\t\t\t\t\t\tanswers:\n\t\t\t\t\t\t\t\t\t\t\t\tanswer text answerFeedback : \"Please write very important feedback here\"\n\t\t\t\t\t\t\t\t\tend question\n\t\t\t\t\t\t\t\tend page\n\t\t\t\t\t\t\t\tresult page \"Thank you!\" : \"Thank you for participating in this survey, we like you!\"\n\t\t\t\t\t\t\t\tend page\n\t\t\t\t\t\t\tend survey", it);
      boolean _isErrorFree = this.isErrorFree(it);
      Assert.assertTrue(_isErrorFree);
      EList<Page> _pages = survey.getPages();
      int _size = _pages.size();
      boolean _equals = (_size == 5);
      Assert.assertTrue(_equals);
      EList<Page> _pages_1 = survey.getPages();
      Page _get = _pages_1.get(0);
      Assert.assertTrue((_get instanceof DescriptionPage));
      EList<Page> _pages_2 = survey.getPages();
      Page _get_1 = _pages_2.get(1);
      Assert.assertTrue((_get_1 instanceof QuestionPage));
      EList<Page> _pages_3 = survey.getPages();
      Page _get_2 = _pages_3.get(2);
      Assert.assertTrue((_get_2 instanceof QuestionPage));
      EList<Page> _pages_4 = survey.getPages();
      Page _get_3 = _pages_4.get(3);
      Assert.assertTrue((_get_3 instanceof QuestionPage));
      EList<Page> _pages_5 = survey.getPages();
      Page _get_4 = _pages_5.get(4);
      Assert.assertTrue((_get_4 instanceof ResultPage));
      EList<Page> _pages_6 = survey.getPages();
      Page _get_5 = _pages_6.get(3);
      EList<Question> _questions = ((QuestionPage) _get_5).getQuestions();
      Question _get_6 = _questions.get(0);
      boolean _isOptional = _get_6.isOptional();
      Assert.assertTrue(_isOptional);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testFreetext() {
    try {
      ResourceSetImpl _resourceSetImpl = new ResourceSetImpl();
      ResourceSetImpl it = _resourceSetImpl;
      final Survey survey = this.parser.parse(
        "start survey \"title\"\n\t\t\t\t\t\t\tpages:\n\t\t\t\t\t\t\t\tquestion page \"page\" : \"description\"\n\t\t\t\t\t\t\t\t\tquestions:\n\t\t\t\t\t\t\t\t\t\tfree text question \"question\"\n\t\t\t\t\t\t\t\t\t\t\tanswers: answer text answerA : \"\"\n\t\t\t\t\t\t\t\t\t\tend question\n\t\t\t\t\t\t\t\tend page\n\t\t\t\t\t\tend survey", it);
      boolean _isErrorFree = this.isErrorFree(it);
      Assert.assertTrue(_isErrorFree);
      EList<Page> _pages = survey.getPages();
      int _size = _pages.size();
      boolean _equals = (_size == 1);
      Assert.assertTrue(_equals);
      EList<Page> _pages_1 = survey.getPages();
      Page _get = _pages_1.get(0);
      Assert.assertTrue((_get instanceof QuestionPage));
      EList<Page> _pages_2 = survey.getPages();
      Page _get_1 = _pages_2.get(0);
      EList<Question> _questions = ((QuestionPage) _get_1).getQuestions();
      Question _get_2 = _questions.get(0);
      Assert.assertTrue((_get_2 instanceof FreetextQuestion));
      EList<Page> _pages_3 = survey.getPages();
      Page _get_3 = _pages_3.get(0);
      EList<Question> _questions_1 = ((QuestionPage) _get_3).getQuestions();
      Question _get_4 = _questions_1.get(0);
      FreetextAnswer _answers = ((FreetextQuestion) _get_4).getAnswers();
      Assert.assertTrue((_answers instanceof FreetextAnswer));
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testSinglechoice() {
    try {
      ResourceSetImpl _resourceSetImpl = new ResourceSetImpl();
      ResourceSetImpl it = _resourceSetImpl;
      final Survey survey = this.parser.parse(
        "start survey \"title\"\n\t\t\t\t\t\t\tpages:\n\t\t\t\t\t\t\t\tquestion page \"page\" : \"description\"\n\t\t\t\t\t\t\t\t\tquestions:\n\t\t\t\t\t\t\t\t\t\tsingle choice question \"question\"\n\t\t\t\t\t\t\t\t\t\t\tanswers:\n\t\t\t\t\t\t\t\t\t\t\t\tanswer choice answerA : \"\"\n\t\t\t\t\t\t\t\t\t\t\t\tanswer choice answerB : \"\"\n\t\t\t\t\t\t\t\t\t\t\t\tanswer text answerC : \"\"\n\t\t\t\t\t\t\t\t\t\tend question\n\t\t\t\t\t\t\t\tend page\n\t\t\t\t\t\tend survey", it);
      boolean _isErrorFree = this.isErrorFree(it);
      Assert.assertTrue(_isErrorFree);
      EList<Page> _pages = survey.getPages();
      int _size = _pages.size();
      boolean _equals = (_size == 1);
      Assert.assertTrue(_equals);
      EList<Page> _pages_1 = survey.getPages();
      Page _get = _pages_1.get(0);
      Assert.assertTrue((_get instanceof QuestionPage));
      EList<Page> _pages_2 = survey.getPages();
      Page _get_1 = _pages_2.get(0);
      EList<Question> _questions = ((QuestionPage) _get_1).getQuestions();
      Question _get_2 = _questions.get(0);
      Assert.assertTrue((_get_2 instanceof SingleChoiceQuestion));
      EList<Page> _pages_3 = survey.getPages();
      Page _get_3 = _pages_3.get(0);
      EList<Question> _questions_1 = ((QuestionPage) _get_3).getQuestions();
      Question _get_4 = _questions_1.get(0);
      EList<Answer> _answers = ((SingleChoiceQuestion) _get_4).getAnswers();
      final Function1<Answer,Boolean> _function = new Function1<Answer,Boolean>() {
        public Boolean apply(final Answer it) {
          boolean _or = false;
          if ((it instanceof ChoiceAnswer)) {
            _or = true;
          } else {
            _or = ((it instanceof ChoiceAnswer) || (it instanceof FreetextAnswer));
          }
          return Boolean.valueOf(_or);
        }
      };
      boolean _forall = IterableExtensions.<Answer>forall(_answers, _function);
      Assert.assertTrue(_forall);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testMultichoice() {
    try {
      ResourceSetImpl _resourceSetImpl = new ResourceSetImpl();
      ResourceSetImpl it = _resourceSetImpl;
      final Survey survey = this.parser.parse(
        "start survey \"title\"\n\t\t\t\t\t\t\tpages:\n\t\t\t\t\t\t\t\tquestion page \"page\" : \"description\"\n\t\t\t\t\t\t\t\t\tquestions:\n\t\t\t\t\t\t\t\t\t\tmulti choice question \"question\"\n\t\t\t\t\t\t\t\t\t\t\tanswers:\n\t\t\t\t\t\t\t\t\t\t\t\tanswer choice answerA : \"\"\n\t\t\t\t\t\t\t\t\t\t\t\tanswer choice answerB : \"\"\n\t\t\t\t\t\t\t\t\t\t\t\tanswer text answerC : \"\"\n\t\t\t\t\t\t\t\t\t\tend question\n\t\t\t\t\t\t\t\tend page\n\t\t\t\t\t\tend survey", it);
      boolean _isErrorFree = this.isErrorFree(it);
      Assert.assertTrue(_isErrorFree);
      EList<Page> _pages = survey.getPages();
      int _size = _pages.size();
      boolean _equals = (_size == 1);
      Assert.assertTrue(_equals);
      EList<Page> _pages_1 = survey.getPages();
      Page _get = _pages_1.get(0);
      Assert.assertTrue((_get instanceof QuestionPage));
      EList<Page> _pages_2 = survey.getPages();
      Page _get_1 = _pages_2.get(0);
      EList<Question> _questions = ((QuestionPage) _get_1).getQuestions();
      Question _get_2 = _questions.get(0);
      Assert.assertTrue((_get_2 instanceof MultiChoiceQuestion));
      EList<Page> _pages_3 = survey.getPages();
      Page _get_3 = _pages_3.get(0);
      EList<Question> _questions_1 = ((QuestionPage) _get_3).getQuestions();
      Question _get_4 = _questions_1.get(0);
      EList<Answer> _answers = ((MultiChoiceQuestion) _get_4).getAnswers();
      final Function1<Answer,Boolean> _function = new Function1<Answer,Boolean>() {
        public Boolean apply(final Answer it) {
          boolean _or = false;
          if ((it instanceof ChoiceAnswer)) {
            _or = true;
          } else {
            _or = ((it instanceof ChoiceAnswer) || (it instanceof FreetextAnswer));
          }
          return Boolean.valueOf(_or);
        }
      };
      boolean _forall = IterableExtensions.<Answer>forall(_answers, _function);
      Assert.assertTrue(_forall);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testNegative() {
    try {
      ResourceSetImpl _resourceSetImpl = new ResourceSetImpl();
      ResourceSetImpl it = _resourceSetImpl;
      final Survey survey = this.parser.parse(
        "start survey \"title\"\n\t\t\t\t\t\t\tpages:\n\t\t\t\t\t\t\t\tquestion page \"page\" : \"description\"\n\t\t\t\t\t\t\t\t\tquestions:\n\t\t\t\t\t\t\t\t\t\tmulti choice question \"question\"\n\t\t\t\t\t\t\t\t\t\t\tanswers:\n\t\t\t\t\t\t\t\t\t\t\t\tanswer choice answerA : \"\"\n\t\t\t\t\t\t\t\t\t\t\t\tanswer choice answerB : \"\"\n\t\t\t\t\t\t\t\t\t\t\t\tanswer choice answerC : \"\"\n\t\t\t\t\t\t\t\t\t\tend question\n\t\t\t\t\t\t\t\tend page\n\t\t\t\t\t\tend stuff", it);
      boolean _isErrorFree = this.isErrorFree(it);
      Assert.assertFalse(_isErrorFree);
      EList<Page> _pages = survey.getPages();
      int _size = _pages.size();
      boolean _notEquals = (_size != 1);
      Assert.assertFalse(_notEquals);
      EList<Page> _pages_1 = survey.getPages();
      Page _get = _pages_1.get(0);
      Assert.assertFalse((_get instanceof DescriptionPage));
      EList<Page> _pages_2 = survey.getPages();
      Page _get_1 = _pages_2.get(0);
      EList<Question> _questions = ((QuestionPage) _get_1).getQuestions();
      Question _get_2 = _questions.get(0);
      Assert.assertFalse((_get_2 instanceof SingleChoiceQuestion));
      EList<Page> _pages_3 = survey.getPages();
      Page _get_3 = _pages_3.get(0);
      EList<Question> _questions_1 = ((QuestionPage) _get_3).getQuestions();
      Question _get_4 = _questions_1.get(0);
      EList<Answer> _answers = ((MultiChoiceQuestion) _get_4).getAnswers();
      final Function1<Answer,Boolean> _function = new Function1<Answer,Boolean>() {
        public Boolean apply(final Answer it) {
          return Boolean.valueOf((it instanceof FreetextAnswer));
        }
      };
      boolean _exists = IterableExtensions.<Answer>exists(_answers, _function);
      Assert.assertFalse(_exists);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
