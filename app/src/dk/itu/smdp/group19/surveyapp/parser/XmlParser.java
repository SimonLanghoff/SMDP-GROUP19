package dk.itu.smdp.group19.surveyapp.parser;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.SAXException;

import android.util.Log;
import dk.itu.smdp.group19.surveyapp.parser.elements.Survey;

public class XmlParser {
	private final String TAG = "XmlParser";
	File xmlFile;
	InputStream xmlFileStream;
	SAXParserFactory factory;
	SAXParser parser;
	XmlHandler handler;
	
	public XmlParser(InputStream xmlFileStream) {
		this.xmlFileStream = xmlFileStream;
	}
	
//	public XmlParser(String xmlFileDir) {
//		xmlFile = new File(xmlFileDir);
//		
//		if(!xmlFile.exists() || !xmlFile.isFile()) {
//			Log.d(TAG, "File does not exist or is not a file!");
//		}
//	}
	
	public Survey parse() {
		try {
			factory = SAXParserFactory.newInstance();
			handler = new XmlHandler();
			
			parser = factory.newSAXParser();
			parser.parse(xmlFileStream, handler);
			
			return handler.getSurvey();
		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		} catch (SAXException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return null;
	}
}
