package ru.roman.steps.example1;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.ru.Дано;
import io.cucumber.java.ru.И;

public class AndSteps {
    @Дано("шаг 1")
    public void setup() {
        System.out.println("шаг 1 - метод отработал");
    }

    @И("шаг 2")
    public void enterValidData() {
        System.out.println("шаг 2 - метод отработал");
    }

    @И("шаг 3")
    public void successful() {
        System.out.println("шаг 3 - метод отработал");
    }
}
