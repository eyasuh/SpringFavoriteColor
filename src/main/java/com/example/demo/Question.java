package com.example.demo;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Question {
	@NotNull
	@Size(min = 2, max = 20)
	private String name;
	@NotNull
	@Size(min = 2, max = 20)
	private String quest;
	@NotNull
	@Size(min = 2, max = 20)
	private String color;

	//getters and setters

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getQuest() {
		return quest;
	}

	public void setQuest(String quest) {
		this.quest = quest;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
}
