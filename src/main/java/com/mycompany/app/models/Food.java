package com.mycompany.app.models;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement

public class Food {
	

	//@JsonProperty("name")
	private String name;
	//@JsonProperty("price")
	private String price;
	//@JsonProperty("description")
	private String description;
	//@JsonProperty("calories")
	private String calories;

	//@JsonProperty("name")
	public String getName() {
		return name;
	}

	//@JsonProperty("name")
	public void setName(String name) {
		this.name = name;
	}

	//@JsonProperty("price")
	public String getPrice() {
		return price;
	}

	//@JsonProperty("price")
	public void setPrice(String price) {
		this.price = price;
	}

	//@JsonProperty("description")
	public String getDescription() {
		return description;
	}

	//@JsonProperty("description")
	public void setDescription(String description) {
		this.description = description;
	}

	//@JsonProperty("calories")
	public String getCalories() {
		return calories;
	}

	//@JsonProperty("calories")
	public void setCalories(String calories) {
		this.calories = calories;
	}

}
