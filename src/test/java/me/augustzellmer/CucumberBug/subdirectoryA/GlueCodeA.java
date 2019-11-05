package me.augustzellmer.CucumberBug.subdirectoryA;

import io.cucumber.java.en.Given;

public class GlueCodeA {

	/* In this example, I had intended to call this piece of glue code. But there's a typo. */
	@Given("stepp def")
	public void a_step_def(){
		// do Foo things
	}
}
