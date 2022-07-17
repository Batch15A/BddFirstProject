package com.osa.steps;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.osa.base.Browser;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ForumLogin {
	WebDriver dr;
	@Given("^I am on OSA forum page$")
	public void i_am_on_OSA_forum_page() {
		dr=Browser.openBrowser();
		dr.get("https://www.osaconsultingtech.com");
		dr.findElement(By.xpath("//*[text()='Forum']")).click();
	}
	@And("I enter username \"([^\"]*)\"$")
	public void i_enter_username(String username) {
		dr.findElement(By.id("username")).sendKeys(username);
	}

	@And("I enter password \"([^\"]*)\"$")
	public void i_enter_password(String password) {
		dr.findElement(By.name("password")).sendKeys(password);
	}
	@Given("I enter user login credentials")
	public void i_enter_user_login_credentials(DataTable dataTable) {
		 List<List<String>> table=dataTable.asLists();
		 dr.findElement(By.id("username")).sendKeys(table.get(0).get(0));
		 dr.findElement(By.name("password")).sendKeys(table.get(0).get(1));  
	}
	
	//login_button
	@When("I click on login button")
	public void i_click_on_login_button() {
	   dr.findElement(By.id("login_button")).click();
	}
	@Then("I verify that I am on student page")
	public void i_verify_that_I_am_on_student_page() {
	  String aspt=dr.getTitle(); 
	  String espt="Student Page";
	  if(aspt.equals(espt)) {
		  System.out.println("Pass");
	  }else {
		  System.out.println("Fail");
	  }
	  dr.close();
	}
	String afpt=null;
	@When("I retrive the page title")
	public void i_retrive_the_page_title() {
	    afpt=dr.getTitle();
	}
	@Then("I verify the page title")
	public void i_verify_the_page_title() {
	   String efpt= "OSA Consulting Tech - All the projects."; 
	   if(afpt.equals(efpt)) {
		   System.out.println("Pass");
	   }else {
		   System.out.println("Fail");
	   }
	   dr.close();
	}
}
