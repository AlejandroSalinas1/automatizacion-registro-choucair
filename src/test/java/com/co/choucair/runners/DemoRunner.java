package com.co.choucair.runners;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;


@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/RegistroUsuario.feature",
        tags = "",
        glue = "com.co.choucair.stepdefinitions",
        plugin = {"pretty", "json:target/cucumber-reports/cucumber.json"},
        snippets = CucumberOptions.SnippetType.CAMELCASE)
public class DemoRunner {
}
