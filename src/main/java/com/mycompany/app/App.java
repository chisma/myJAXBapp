package com.mycompany.app;

import java.io.File;
import java.io.StringReader;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.PropertyException;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.stream.StreamSource;

import org.apache.commons.io.FilenameUtils;

import com.mycompany.app.models.MenuXML;
import com.mycompany.app.models.BreakfastMenu;
import com.mycompany.app.models.Food;
import com.mycompany.app.models.MenuXML;



public class App {

	public static void main(String[] args)throws PropertyException, JAXBException {

		//if(args.length==2){

		Scanner keyboard = new Scanner(System.in);
		//System.out.println("Enter the file path");
		//String fileName = keyboard.nextLine();
		System.out.println("Enter the sort type as 'asc' OR 'desc:");
		String sortType = keyboard.nextLine();
		//String fileName = args[0];
		//String sortType = args[1];						
		//}
		String filePath = new String("C:\\Users\\User\\workspaceSE\\PricerApp\\lib\\menu.json");
		File f = new File(filePath);
		String ext1 = FilenameUtils.getExtension(filePath);
		System.out.println(ext1);

		//JAXBContext jc = JAXBContextFactory.createContext("com.core.mymodel", null);
	
		JAXBContext jc1 = JAXBContext.newInstance(MenuXML.class);

		Unmarshaller jaxbUnmarshaller= jc1.createUnmarshaller();
		StreamSource json = new StreamSource( new StringReader(filePath));
		MenuXML menuJSON = jaxbUnmarshaller.unmarshal(json, MenuXML.class) .getValue();

		//TODO: Determine mimetype of file
		
		switch(ext1){
		
		case "json":
		
			
			jaxbUnmarshaller.setProperty("eclipselink.media-type", "application/json");
			//unmarshaller .setProperty(UnmarshallerProperties.JSON_INCLUDE_ROOT, true);
			 
					 
/*
			MenuJson menuJSON = new MenuJson();
			menuJSON = (MenuJson) Parser.fromJsonToDataObject(filePath, MenuJson.class);*/
			BreakfastMenu bm = menuJSON.getBreakfastMenu();
			List<Food> foods = bm.getFood(); 
			printNames(sortType, foods);

		case "xml":

			
			jaxbUnmarshaller.setProperty("eclipselink.media-type", "application/xml");
			BreakfastMenu bmXML = menuJSON.getBreakfastMenu();
			List<Food> foodsXML = bmXML.getFood(); 
			printNames(sortType, foodsXML);
			
		default:
			
			System.out.println("Invalid mimetype");
		}
			
			
		}
	
		
		//menu = (MenuJson) Parser.fromJsonToDataObject(fileName, MenuJson.class);
		//menu = (MenuJson) Parser.fromXMLToDataObject(jsonFilePath, MenuJson.class);
		//menu = (MenuJson) Parser.fromXMLToDataObject(jsonFilePath, MenuJson.class);
		//Document menu = Parser.fromXMLToDataObject(jsonFilePath, MenuJson.class);
		//Document menu = Parser.fromXMLToDataObject(jsonFilePath);
		//menu.getDocumentElement()

	private static void printNames(String sortType, List<Food> foods) {
		switch (sortType) {
		case "asc":
			ascending(foods);
			break;
		case "desc":
			descending(foods);
			break;
		default:
			System.out.println("Valid sort type: asc or desc");
		}
	}

	private static void ascending(List<Food> foods) {
		List<String> names = foods.stream().map(Food::getName).collect(Collectors.toList());
		Collections.sort(names, (n, n2) -> n.compareTo(n2));
		names.forEach(System.out::println);
	}

	private static void descending(List<Food> foods) {
		List<String> names = foods.stream().map(Food::getName).collect(Collectors.toList());
		Collections.sort(names, (n, n2) -> n.compareTo(n2));
		Collections.reverse(names);
		names.forEach(System.out::println);
	}

}

