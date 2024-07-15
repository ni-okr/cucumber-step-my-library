package ru.roman.steps.params;

import io.cucumber.java.ru.И;
import io.cucumber.java.ru.Когда;

public class ParametrsSteps {
    @Когда("вводим имя пользователя {word}")
    public void username(String s) {
        System.out.println("это распечаталось - " + s);
    }

    @И("I am a {word} user")
    public void user(String s) {
        System.out.println("VK распечаталось - " + s);
    }

    @И("I enter my username as {word}")
    public void enterUsername(String userName) {
        System.out.println("MyName распечаталось - " + userName);
    }

    @И("I enter my password as {int}")
    public void enterPassword(int password) {
        System.out.println("12345 распечаталось - " + password);
    }

    @И("login should be successful")
    public void successful() {
        System.out.println("successful распечаталось - ");
    }

    @И("I enter my key phrase as {string}")
    public void enterPhrase(String phrase) {
        System.out.println("I like apples распечаталось - " + phrase);
    }

    //https://www.youtube.com/watch?v=bh7N9IvQg2Q - как залить проект в гитхаб

}
