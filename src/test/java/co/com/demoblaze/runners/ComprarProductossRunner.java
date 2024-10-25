package co.com.demoblaze.runners;


import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberSerenityRunner;
import org.junit.runner.RunWith;

@RunWith(CucumberSerenityRunner.class)
@CucumberOptions(
        features = "src/test/resources/features/comprarproductos.feature",
        glue = "co.com.demoblaze.stepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class ComprarProductossRunner {
}


