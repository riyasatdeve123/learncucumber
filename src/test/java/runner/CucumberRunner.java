package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(features= {"src/test/resources/features/login.feature"}, glue= {"steps"})
public class CucumberRunner extends AbstractTestNGCucumberTests {

}
