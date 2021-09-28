package com.practise.automation.steps;

import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefs {

    private Scenario scenario;

    @Before
    public void before(Scenario scenario) {
        this.scenario = scenario;
    }

    @Given("step A")
    public void stepA() {
        scenario.log("Step A");
    }

    @When("step B")
    public void stepB() {
        scenario.log("Step B");
    }

    @Then("step C")
    public void stepC() {
        scenario.log("Step C");
    }
}
