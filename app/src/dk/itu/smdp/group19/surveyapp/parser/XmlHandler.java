package dk.itu.smdp.group19.surveyapp.parser;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import dk.itu.smdp.group19.surveyapp.parser.elements.Answer;
import dk.itu.smdp.group19.surveyapp.parser.elements.AnswerType;
import dk.itu.smdp.group19.surveyapp.parser.elements.ElementNames;
import dk.itu.smdp.group19.surveyapp.parser.elements.Page;
import dk.itu.smdp.group19.surveyapp.parser.elements.Question;
import dk.itu.smdp.group19.surveyapp.parser.elements.QuestionPage;
import dk.itu.smdp.group19.surveyapp.parser.elements.QuestionType;
import dk.itu.smdp.group19.surveyapp.parser.elements.Survey;

public class XmlHandler extends DefaultHandler {
	private final String TAG = "XmlHandler";
	
	private Survey survey;
	private QuestionPage currentPage;
	private Question currentQuestion;
	
	private int questionId = 0;
	private int answerId = 0; 
	
	public Survey getSurvey() {
		return survey;
	}
	
	@Override
	public void startDocument() throws SAXException {
//		Log.d(TAG, "startDocument");
		survey = new Survey();
	}

	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
		super.startElement(uri, localName, qName, attributes);
		
		if(qName.equals(ElementNames.SURVEY)) {
			String surveyTitle = attributes.getValue(ElementNames.ATTRIBUTE_NAME);
			
			survey.setTitle(surveyTitle);
		}
		else if(qName.equals(ElementNames.DESCRIPTION_PAGE)) {
			String pageName = attributes.getValue(ElementNames.ATTRIBUTE_NAME);
			String pageDescription = attributes.getValue(ElementNames.ATTRIBUTE_DESCRIPTION);
			
			Page page = new Page(pageName, pageDescription);
			survey.addPage(page);
		}
		else if(qName.equals(ElementNames.QUESTION_PAGE)) {
			String pageName = attributes.getValue(ElementNames.ATTRIBUTE_NAME);
			String pageDescription = attributes.getValue(ElementNames.ATTRIBUTE_DESCRIPTION);
			
			QuestionPage page = new QuestionPage(pageName, pageDescription);
			currentPage = page;
			survey.addPage(page);
		}
		else if(qName.equals(ElementNames.SINGLE_CHOICE_QUESTION)) {
			String questionName = attributes.getValue(ElementNames.ATTRIBUTE_NAME);
			
			Question question = new Question(++questionId, questionName, QuestionType.SINGLE);
			currentQuestion = question;
			currentPage.addQuestion(question);
		}
		else if(qName.equals(ElementNames.MULTI_CHOICE_QUESTION)) {
			String questionName = attributes.getValue(ElementNames.ATTRIBUTE_NAME);
			
			Question question = new Question(++questionId, questionName, QuestionType.MULTI);
			currentQuestion = question;
			currentPage.addQuestion(question);
		}
		else if(qName.equals(ElementNames.FREETEXT_QUESTION)) {
			String questionName = attributes.getValue(ElementNames.ATTRIBUTE_NAME);
			
			Question question = new Question(++questionId, questionName, QuestionType.FREETEXT);
			currentQuestion = question;
			currentPage.addQuestion(question);
		}
		else if(qName.equals(ElementNames.CHOICE_ANSWER)) {
			String answerName = attributes.getValue(ElementNames.ATTRIBUTE_NAME);
			
			Answer answer = new Answer(++answerId, currentQuestion.getId(), answerName, AnswerType.CHOICE);
			currentQuestion.addAnswer(answer);
		}
		else if(qName.equals(ElementNames.FREETEXT_ANSWER)) {
			String answerName = attributes.getValue(ElementNames.ATTRIBUTE_NAME);
			
			Answer answer = new Answer(++answerId, currentQuestion.getId(), answerName, AnswerType.FREETEXT);
			currentQuestion.addAnswer(answer);
		}
	}

	@Override
	public void characters(char[] ch, int start, int length) throws SAXException {
		super.characters(ch, start, length);
//		String s = new String(ch, start, length);
//		if(s.trim().length() > 0) {
//			Log.d(TAG, "Element text: " + s);
//		}
	}

	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException {
		super.endElement(uri, localName, qName);
//		Log.d(TAG, "endElement");
	}

	@Override
	public void endDocument() throws SAXException {
		super.endDocument();
//		Log.d(TAG, "endDocument");
	}

}
