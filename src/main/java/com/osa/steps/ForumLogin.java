package com.osa.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

public class ForumLogin {
	@Given("^I am on OSA forum page$")
	public void i_am_on_OSA_forum_page() {
		System.out.println("WOW, our cucumber method is working");
	}
	@And("^I enter username$")
	public void i_enter_username() {
		System.out.println(" We are entering our username");
	}
}
