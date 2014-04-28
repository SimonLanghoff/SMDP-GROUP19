package dk.itu.smdp.group19.surveyapp.parser;

import java.util.ArrayList;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import dk.itu.smdp.group19.surveyapp.parser.elements.*;

public class XmlHandler extends DefaultHandler {
	private final String TAG = "XmlHandler";
	
	private Survey survey;
	private QuestionPage currentPage;
	private Question currentQuestion;
	private Dependency currentDependency;
	
	private int questionId = 0;
//	private int answerId = 0; 
	
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
			String pageDescription = attributes.getValue(ElementNames.ATTRIBUTE_TEXT);
			
			Page page = new Page(pageName, pageDescription);
			survey.addPage(page);
		}
		else if(qName.equals(ElementNames.QUESTION_PAGE)) {
			String pageName = attributes.getValue(ElementNames.ATTRIBUTE_NAME);
			String pageDescription = attributes.getValue(ElementNames.ATTRIBUTE_TEXT);
			
			QuestionPage page = new QuestionPage(pageName, pageDescription);
			currentPage = page;
			survey.addPage(page);
		}
		else if(qName.equals(ElementNames.SINGLE_CHOICE_QUESTION)) {
			String questionName = attributes.getValue(ElementNames.ATTRIBUTE_NAME);
			boolean optional = attributes.getValue(ElementNames.ATTRIBUTE_OPTIONAL).equalsIgnoreCase("true");

			Question question = new Question(++questionId, questionName, QuestionType.SINGLE, optional);
			currentQuestion = question;
			currentPage.addQuestion(question);
			AnswerCollector.addQuestion(question);
		}
		else if(qName.equals(ElementNames.MULTI_CHOICE_QUESTION)) {
			String questionName = attributes.getValue(ElementNames.ATTRIBUTE_NAME);
			boolean optional = attributes.getValue(ElementNames.ATTRIBUTE_OPTIONAL).equalsIgnoreCase("true");
			
			Question question = new Question(++questionId, questionName, QuestionType.MULTI, optional);
			currentQuestion = question;
			currentPage.addQuestion(question);
			AnswerCollector.addQuestion(question);
		}
		else if(qName.equals(ElementNames.FREETEXT_QUESTION)) {
			String questionName = attributes.getValue(ElementNames.ATTRIBUTE_NAME);
			boolean optional = attributes.getValue(ElementNames.ATTRIBUTE_OPTIONAL).equalsIgnoreCase("true");
			
			Question question = new Question(++questionId, questionName, QuestionType.FREETEXT, optional);
			currentQuestion = question;
			currentPage.addQuestion(question);
			AnswerCollector.addQuestion(question);
		}
		else if(qName.equals(ElementNames.CHOICE_ANSWER)) {
			String answerId = attributes.getValue(ElementNames.ATTRIBUTE_NAME);
			String answerText = attributes.getValue(ElementNames.ATTRIBUTE_TEXT);
			
			Answer answer = new Answer(answerId, currentQuestion.getId(), answerText, AnswerType.CHOICE);
			currentQuestion.addAnswer(answer);
		}
		else if(qName.equals(ElementNames.FREETEXT_ANSWER)) {
			String answerId = attributes.getValue(ElementNames.ATTRIBUTE_NAME);
			String answerText = attributes.getValue(ElementNames.ATTRIBUTE_TEXT);
			
			Answer answer = new Answer(answerId, currentQuestion.getId(), answerText, AnswerType.FREETEXT);
			currentQuestion.addAnswer(answer);
		}
		else if(qName.equals(ElementNames.REQUIRES)) {
			currentDependency = null;
		}
		else if(qName.equals(ElementNames.AND)) {
			linkDependencies(new And());
		}
		else if(qName.equals(ElementNames.OR)) {
			linkDependencies(new Or());
		}
		else if(qName.equals(ElementNames.NOT)) {
			linkDependencies(new Not());
		}
		else if(qName.equals(ElementNames.ANSWER_REF)) {
			linkDependencies(new AnswerRef(attributes.getValue(ElementNames.ATTRIBUTE_NAME)));
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
		
		if(qName.equals(ElementNames.REQUIRES)) {
			// dependency parsing for this question is done, add it to the question
			currentQuestion.setRequires(currentDependency);
		}
		else if(qName.equals(ElementNames.AND) || qName.equals(ElementNames.OR) 
				|| qName.equals(ElementNames.NOT) || qName.equals(ElementNames.ANSWER_REF)) {
			// a dependency has ended, go upwards in the dependency tree 
			Dependency parent = currentDependency.getParent();
			if(parent != null)
				currentDependency = parent;
		}
	}

	@Override
	public void endDocument() throws SAXException {
		super.endDocument();
//		Log.d(TAG, "endDocument");
	}
	
	/**
	 * Set a new dependency as a child of the current dependency, and vice-versa.
	 * @param newDependency
	 */
	private void linkDependencies(Dependency newDependency) {
		// set the enclosing dependency to the parent of this dependency
		newDependency.setParent(currentDependency);
		
		// add this dependency to the children of the enclosing dependency
		if(currentDependency != null) {
			if(currentDependency instanceof Expression) {
				Expression e = (Expression) currentDependency;
				
				if(e.getLhs() == null)
					e.setLhs(newDependency);
				else if(e.getRhs() == null)
					e.setRhs(newDependency);
			}
			else if(currentDependency instanceof Not)
				((Not) currentDependency).setDependency(newDependency);
		}
		
		// set the current dependency to this dependency
		currentDependency = newDependency;
	}
}
