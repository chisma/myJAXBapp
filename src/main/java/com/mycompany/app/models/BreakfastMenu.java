package com.mycompany.app.models;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

//import com.fasterxml.jackson.annotation.JsonProperty;
@XmlRootElement
public class BreakfastMenu {
	
	 //@XmlElement(name="food")
	 //@JsonIgnoreProperties(ignoreUnknown=true)
	 //@JacksonXmlElementWrapper(useWrapping = false)
	//@JsonProperty("food")
	//@JacksonXmlProperty(localName = "food")
	//@JacksonXmlProperty(isAttribute = true)
	//@JacksonXmlElementWrapper(useWrapping=false, localName = "food")
	private List<Food> food = null;

	//@JsonProperty("food")
	// @XmlElement(name="food")
	 //@JsonIgnoreProperties(ignoreUnknown=true)
	 //@JacksonXmlElementWrapper(useWrapping = false)
	//@JacksonXmlProperty(localName = "food")
	//@JacksonXmlElementWrapper(useWrapping=false, localName = "food")
	//@JacksonXmlProperty(isAttribute = true)
	public List<Food> getFood() {
		return food;
	}

	//@JsonProperty("food")
	 //@XmlElement(name="food")
	//@JacksonXmlProperty(localName = "food")
	public void setFood(List<Food> food) {
		this.food = food;
	}
	
	

}
