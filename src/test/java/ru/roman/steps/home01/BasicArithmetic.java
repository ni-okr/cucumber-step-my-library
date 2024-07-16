package ru.roman.steps.home01;

import io.cucumber.java.en.And;
import org.junit.jupiter.api.Assertions;
import ru.roman.method.Calculator;

public class BasicArithmetic {
    int sum;
    Calculator calc = new Calculator();

    @And("a calculator I just turned on")
    public void setup() {
        System.out.println("я включил калькулятор");
    }

    @And("I add {int} and {int}")
    public void calculate(int a, int b) {
        System.out.println("два числа: " + a + " + " + b);
        sum = calc.sum(a, b);
    }

    @And("the result is {int}")
    public void res(int c) {
        Assertions.assertEquals(c, sum);
    }
}
