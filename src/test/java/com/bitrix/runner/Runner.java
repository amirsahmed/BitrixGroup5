package com.bitrix.runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        plugin = "html:target/BitrixReport.html",
        glue ="com/bitrix/stepsDefinitions",
        features ="src/test/resources/features",
        dryRun = false,
        tags = "@bitrix"

)




public class Runner {





}
