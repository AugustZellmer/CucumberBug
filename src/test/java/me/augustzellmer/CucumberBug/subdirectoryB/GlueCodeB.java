package me.augustzellmer.CucumberBug.subdirectoryB;

import io.cucumber.java.en.Given;

public class GlueCodeB {

	/* This piece of glue code is not in scope, according to the annotation. */
	@Given("step def") // made a typo
	public void a_step_def(){
		// do Bar things
	}
}
