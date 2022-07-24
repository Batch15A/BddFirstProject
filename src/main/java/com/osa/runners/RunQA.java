package com.osa.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(//cucumber options properties and values
		features = {"src/main/java/com/osa/features"},
		glue="com.osa.steps",
		tags = {"@regression"},
		plugin = {"pretty", "html:target/cucumber-reports" },
		monochrome=true)
public class RunQA {

}


//@RunWith(Cucumber.class)
//@CucumberOptions(
//		features = "Feature"
//		,glue={"stepDefinition"}
//		)