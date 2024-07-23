package ru.roman.steps.params;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class ParametrsSteps {
    @When("������ ��� ������������ {word}")
    public void username(String s) {
        System.out.println("��� ������������� - " + s);
    }

    @And("I am a {word} user")
    public void user(String s) {
        System.out.println("VK ������������� - " + s);
    }

    @And("I enter my username as {word}")
    public void enterUsername(String userName) {
        System.out.println("MyName ������������� - " + userName);
    }

    @And("I enter my password as {int}")
    public void enterPasswordInt(int password) {
        System.out.println("12345 ������������� - " + password);
    }

    @And("I enter my password as {string}")
    public void enterPasswordString(int password) {
        System.out.println("12345 ������������� - " + password);
    }

    @And("login should be successful")
    public void successful() {
        System.out.println("successful ������������� - ");
    }

    @And("I enter my key phrase as {string}")
    public void enterPhrase(String phrase) {
        System.out.println("I like apples ������������� - " + phrase);
    }

    @And("I enter my username")
    public void enterUsername2(){
        System.out.println("MyName ������������� - ");
    }

    //https://www.youtube.com/watch?v=bh7N9IvQg2Q - ��� ���And�� ������ � �And����

    @And("Login should fail")
    public void loginIsFail(){
        System.out.println("�� �����And�And����");
    }

}
