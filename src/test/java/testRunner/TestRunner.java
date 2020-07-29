package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;


@RunWith(Cucumber.class)
@CucumberOptions(features={"SignIn","src/test/resources/featureFiles"},glue={"stepDefinitions"},
				plugin={"pretty","html:target/html-output/htmlReport.html"},
				monochrome = false, snippets = SnippetType.UNDERSCORE,
				tags="@Sanity and @Regression")


public class TestRunner {

}
