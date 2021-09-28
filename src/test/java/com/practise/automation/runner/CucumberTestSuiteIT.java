package com.practise.automation.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions(
        features = "classpath:features",
        glue = "com.practise.automation"
)
public class CucumberTestSuiteIT extends AbstractTestNGCucumberTests {

    @DataProvider(parallel = true)
    public Object[][] tests() {
        return super.scenarios();
    }
}
