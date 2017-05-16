package com.mycompany.app;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import com.parser.app.models.MenuJson;
import com.parser.app.models.MenuXML;

public final class Parser {

	/*private static ObjectMapper reader = new ObjectMapper();
	//private static XmlMapper xmlReader = new XmlMapper();
	private static ObjectMapper xmlMapper = new XmlMapper();
	private static File file;
*/
	// private static String jsonFilePath;
	/*
	 * private static FileInputStream jsonFile; private static JsonReader
	 * reader; private static JsonObject obj;
	 */

	public Parser() {
		
		
	}	

	/*public static MenuJson fromJsonToDataObject(String filename, Class<MenuJson> klass)
			throws JsonGenerationException, JsonParseException, IOException {
		File f = new File(filename);
		
		return reader.readValue(f, MenuJson.class);
	}
	
	//private static XmlMapper xmlReader = new XmlMapper();	

	public static MenuXML fromXMLToDataObject(String filename, Class<MenuXML> klass) throws JsonParseException, JsonMappingException, IOException, ParserConfigurationException, SAXException {
		
	//DocumentBuilder dBuilder = DocumentBuilderFactory.newInstance()
               // .newDocumentBuilder();

//Document doc = dBuilder.parse(new File(filename));
		return xmlMapper.readValue(new File(filename), MenuXML.class);
		}
*/





}
