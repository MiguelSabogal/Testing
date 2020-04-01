package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		strict=true
		,plugin= {"pretty"}
		,features="src/test/resources/feature_files/login"
		,tags = "@successful_login"		
		,glue="classpath:steps_definition"
		,monochrome = true
		)
public class RunCucumberTest {

}
