package ru.roman.steps.params;

import io.cucumber.java.en.And;
import org.junit.jupiter.api.Assertions;
import ru.roman.method.Calculator;

public class CalculatorSteps {
    /*
    Дано инициализация класса калькулятора
    Когда складываю <num1> с <num2>
    Тогда результат равен <total>
     */
    
    private Calculator calc;
    private int result;
    
    @And("инициализация класса калькулятора")
    public void init(){
        calc = new Calculator();
    }

    @And("складываю {int} с {int}")
    public void input(int a, int b){
        result = calc.sum(a, b);
    }

    @And("умножаю {int} на 10")
    public void input_multiplayer_10(int a){
        result = calc.multiplyBy10(a);
    }
    
    @And("результат равен {int}")
    public void output(int expected){
        Assertions.assertEquals(expected, result);
    }
    
    @And("результат не равен {int}")
    public void negative_output(int expected){
        Assertions.assertNotEquals(expected, result);
    }
}
