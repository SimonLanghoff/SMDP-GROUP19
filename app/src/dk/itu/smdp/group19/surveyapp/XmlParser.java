package dk.itu.smdp.group19.surveyapp;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import android.util.Log;

public class XmlParser {
	private final String TAG = "XmlParser";
	SAXParserFactory factory;
	SAXParser parser;
	DefaultHandler handler;
	
	public XmlParser(String xmlFileDir) {
		File file = new File(xmlFileDir);
		if(file.exists() && file.isFile()) {
			Log.d(TAG, "File found.");
			
			factory = SAXParserFactory.newInstance();
			handler = createHandler();
			
			try {
				parser = factory.newSAXParser();
				parser.parse(xmlFileDir, handler);
			} catch (ParserConfigurationException e) {
				e.printStackTrace();
			} catch (SAXException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} else {
			Log.d(TAG, "File not found.");
		}
	}

	private DefaultHandler createHandler() {
		DefaultHandler dh = new DefaultHandler() {
			@Override
			public void startDocument() throws SAXException {
				Log.d(TAG, "startDocument");
			}

			@Override
			public void startElement(String uri, String localName,String qName, Attributes attributes) throws SAXException {
				Log.d(TAG, "startElement");
			}

			@Override
			public void characters(char[] ch, int start, int length) throws SAXException {
				Log.d(TAG, "characters");
			}

			@Override
			public void endElement(String uri, String localName, String qName) throws SAXException {
				Log.d(TAG, "endElement");
			}

			@Override
			public void endDocument() throws SAXException {
				Log.i(TAG, "endDocument");
			}
		};
		
		return dh;
	}
}
