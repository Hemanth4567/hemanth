package Report;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin= {"html:src/test/java/Report/output/cucumber-html-report",
		         "json:src/test/java/Report/output/jason.json",
		         "junit:src/test/java/Report/output/xml.xml"})
public class runner {

}
