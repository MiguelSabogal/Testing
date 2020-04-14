package voice.prove.concept.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features"
        ,glue = "voice.prove.concept.step_definitions"
        ,tags = "@successful_login"
        ,monochrome = true
        ,snippets = CucumberOptions.SnippetType.CAMELCASE
        ,plugin = {"pretty", "json:target/report.json", "de.monochromata.cucumber.report.PrettyReports:target/pretty-cucumber"}
        ,strict = true
)

public class VoiceRunner {
}
