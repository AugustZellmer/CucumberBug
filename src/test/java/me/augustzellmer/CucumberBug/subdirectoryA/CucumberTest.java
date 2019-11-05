package me.augustzellmer.CucumberBug.subdirectoryA;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/features/Feature.feature",
		strict = true,
		glue = { "me.augustzellmer.CucumberBug.subdirectoryA" })
public class CucumberTest {
	// test runner for cucumber
}
