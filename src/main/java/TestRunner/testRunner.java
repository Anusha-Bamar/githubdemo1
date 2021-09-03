package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src//main//java//features//BasicContactExamples.feature",//path of features file
glue= {"stepDefinitions"},//path of step definitions file
monochrome=true,// console output is readable
plugin={"pretty","html:target/HtmlReport/reports.html","json:target/JSONReport/reports.json","junit:target/JunitReport/reports.xml"},
dryRun=false)
public class testRunner {

}
