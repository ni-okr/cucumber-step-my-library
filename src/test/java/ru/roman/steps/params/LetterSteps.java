package ru.roman.steps.params;

import io.cucumber.java.en.And;
import org.junit.jupiter.api.Assertions;
import ru.roman.method.Letter;

public class LetterSteps {
    /*
    Given initialization of Letter class
    When enter param as cat and as 0
    Then return result as c
     */
    
    private Letter letter;
    private String result;
    
    @And("initialization of Letter class")
    public void initial(){
        letter = new Letter();
    }
    
    @And("enter param as {word} and as {int}")
    public void input(String str, int index){
        result = letter.getLetterByIndex(str, index);
    }
    
    @And("return result as {word}")
    public void output(String expected){
        Assertions.assertEquals(expected, result);
    }
    
    @And("result should not be {word}")
    public void negative_output(String expected){
        Assertions.assertNotEquals(expected, result);
    }
}
