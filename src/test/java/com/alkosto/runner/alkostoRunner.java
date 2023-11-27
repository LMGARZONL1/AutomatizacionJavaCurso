package com.alkosto.runner;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/prueba.feature",
        glue = "src/test/java/com/alkosto/stepDefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)

public class pruebaRunner {
}
