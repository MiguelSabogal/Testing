package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(strict=true, plugin= {
		"pretty"}, features="src/test/resources/feature_files/login.feature", glue="classpath:steps_definition")
public class RunCucumberTest {

}
