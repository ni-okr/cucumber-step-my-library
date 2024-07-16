package ru.roman.steps.example1;

import io.cucumber.java.en.And;

public class AndSteps {
    @And("шаг 1")
    public void setup() {
        System.out.println("шаг 1 - метод отработал");
    }

    @And("шаг 2")
    public void enterValidData() {
        System.out.println("шаг 2 - метод отработал");
    }

    @And("шаг 3")
    public void successful() {
        System.out.println("шаг 3 - метод отработал");
    }
}
