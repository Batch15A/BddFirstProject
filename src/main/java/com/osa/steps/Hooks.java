package com.osa.steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	@Before
	public void runBeforeHook() {
		System.out.println("=======Running from before hook=========");
	}
	@After
	public void runAfterHook() {
		System.out.println("=======Running from after hook=========");
	}
	@Before("@simple")
	public void runBeforeSpe() {
		System.out.println("Before one scenario+++++++++++");
	}
	@After("@simple")
	public void runAfterSpe() {
		System.out.println("After one scenario---------");
	}
}
