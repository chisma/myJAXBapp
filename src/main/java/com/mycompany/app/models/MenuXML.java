package com.mycompany.app.models;

import javax.xml.bind.annotation.XmlRootElement;

import com.sun.xml.internal.txw2.annotation.XmlElement;

@XmlRootElement
//@JacksonXmlRootElement(localName = "breakfast_menu")
public class MenuXML{

	
	private BreakfastMenu breakfastMenu;


	//@JsonPropertyDescription("breakfast_menu")
	//@JsonProperty("breakfast_menu")
	//@JacksonXmlElementWrapper(useWrapping = false)
	//@JacksonXmlProperty(localName = "breakfast_menu")
	//@JacksonXmlRootElement(localName = "breakfast_menu")
	public BreakfastMenu getBreakfastMenu() {
		return breakfastMenu;
	}

	//@JsonProperty("breakfast_menu")	
	//@JacksonXmlElementWrapper(useWrapping = false)
	//@JacksonXmlProperty(localName = "breakfast_menu")
	public void setBreakfastMenu(BreakfastMenu breakfastMenu) {
		this.breakfastMenu = breakfastMenu;
	}

	public void sortMenuByName(){	
		
	}
	
	public void sortMenuByReverseOrder(){
		
		
	}
	
}
