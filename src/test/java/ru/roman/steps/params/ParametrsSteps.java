package ru.roman.steps.params;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class ParametrsSteps {
    @When("вводим имя пользователя {word}")
    public void username(String s) {
        System.out.println("это распечаталось - " + s);
    }

    @And("I am a {word} user")
    public void user(String s) {
        System.out.println("VK распечаталось - " + s);
    }

    @And("I enter my username as {word}")
    public void enterUsername(String userName) {
        System.out.println("MyName распечаталось - " + userName);
    }

    @And("I enter my password as {int}")
    public void enterPasswordInt(int password) {
        System.out.println("12345 распечаталось - " + password);
    }

    @And("I enter my password as {string}")
    public void enterPasswordString(int password) {
        System.out.println("12345 распечаталось - " + password);
    }

    @And("login should be successful")
    public void successful() {
        System.out.println("successful распечаталось - ");
    }

    @And("I enter my key phrase as {string}")
    public void enterPhrase(String phrase) {
        System.out.println("I like apples распечаталось - " + phrase);
    }

    @And("I enter my username")
    public void enterUsername2(){
        System.out.println("MyName распечаталось - ");
    }

    //https://www.youtube.com/watch?v=bh7N9IvQg2Q - как залAndть проект в гAndтхаб

    @And("Login should fail")
    public void loginIsFail(){
        System.out.println("Не залогAndнAndлось");
    }

}
