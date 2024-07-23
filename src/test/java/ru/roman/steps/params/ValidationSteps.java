package ru.roman.steps.params;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class ValidationSteps {
    /*
    Given I send a request to the URL to get user details
    Then the response will return status <statusCode> and id <id> and email "<employee_email>" and first name "<employee_firstname>" and last name "<employee_lastname>"

     */
    
    @And("I send a request to the URL to get user details")
    public void init(){
        System.out.println("первый шаг");
    }
    
    @And("the response will return status {int} and id {int} and email {string} and first name {string} and last name {string}")
    public void output(int statusCode, int id, String employeeEmail, String employeeFirstName, String employeeLastName){
        System.out.println(statusCode);
        System.out.println(id);
        System.out.println(employeeEmail);
        System.out.println(employeeFirstName);
        System.out.println(employeeLastName);
    }
}
