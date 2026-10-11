package com.enum1;



public enum Traffic {

	

	RED("stop"),GREEN("go"), YELLOW("wait");

	

	

	private String color;

	

	 Traffic(String color) {

		this.color=color;

	}

	 

	 

	public String getColor() {

		return this.color;

	}

	





}

