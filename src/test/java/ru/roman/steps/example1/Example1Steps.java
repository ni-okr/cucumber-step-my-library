package ru.roman.steps.example1;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Test;

public class Example1Steps {
//    Scenario: Some title for a single test scenario
//    Given username and password
//    When enter valid data
//    Then registration is successful
//
//    Scenario: Another scenario with a different title
//    Given username and password
//    When enter invalid data
//    Then registration is unsuccessful

    @Given("username and password")
    public void setup() {
        System.out.println("Given username and password - метод отработал");
    }

    @When("enter valid data")
    public void enterValidData() {
        System.out.println("enter valid data - метод отработал");
    }

    @Then("registration is successful")
    public void successful() {
        System.out.println("registration is successful - метод отработал");
    }

//    When enter invalid data
//    Then registration is unsuccessful


    @When("enter invalid data")
    public void enterInvalidData() {
        System.out.println("enter invalid data - метод отработал");
    }

    @Then("registration is unsuccessful")
    public void unsuccessful() {
        System.out.println("registration is unsuccessful - метод отработал");
    }

//    Дано находAndмся на странAndце регAndстрацAndAnd
//    Когда вводAndм данные
//    Тогда регAndстрацAndя успешна

    @Given("находAndмся на странAndце регAndстрацAndAnd")
    public void pageRegistration() {
        System.out.println("находAndмся на странAndце регAndстрацAndAnd");
    }

    @When("вводAndм данные")
    public void enterDate() {
        System.out.println("вводAndм данные");
    }

    @Then("^регAndстрацAndя успешна$")
    public void sucsess() {
        System.out.println("регAndстрацAndя успешна");
    }

    @When("I enter my password")
    public void enterMyPassword() {
        System.out.println("I enter my password - аннотацAndя And");
    }

    @Then("home page should not be missing")
    public void missing() {
        System.out.println("home page should not be missing - аннотацAndя But");
    }

//    Когда вводAndм Andмя пользователя user2

    @When("вводим Andмя пользователя user2")
    void name() {
    }
}
