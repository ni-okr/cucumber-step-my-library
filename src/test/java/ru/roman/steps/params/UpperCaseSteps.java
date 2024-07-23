package ru.roman.steps.params;

import io.cucumber.java.en.And;
import org.junit.jupiter.api.Assertions;
import ru.roman.method.UpperCase;

public class UpperCaseSteps {
    /* 
    переводим фичефайл в java-шаги
    1. копируем в шаги сценарий
    2. для каждого шага создаем public void-метод
    2.1. создаем аннотацию @And(), внутрь вставляем текст без ключевых слов типа "дано" 
    2.2. добавляем параметры в текст и в методы

    3. добавляем в поле класс с тестируемым методом  
    4. создаем объект этого класса (в методе "initObject")
    5. создаем результирующую переменную result, тоже как поле класса
    6. в методе "input" вызываем тестируемый метод и присваиваем его значение переменной result
    7. в методе "output" выполняем assert через вызов класса Assertions

    8. создаем раннер для этих шагов и фичефайла
    */

    private UpperCase upperСase; // задаем переменную класса, от которого вызываем метод
    private String result;

    @And("создаем объект класса Uppercase с методом перевода строк в верхний регистр")
    public void initObject() {
        upperСase = new UpperCase(); // создаем объект этого класса, что бы иметь возможность использовать его методы 
    }

    @And("я ввожу слово {word}")
    public void input(String s) {        
        result = upperСase.upCase(s);
    }

    @And("я получаю слово {word}")
    public void output(String expected) {
        Assertions.assertEquals(expected, result);
    }
    
    @And("я не получаю слово {word}")
    public void negativ_output(String expected){
    Assertions.assertNotEquals(expected, result);
    }
    
    
    /*
     Сценарий: первый сценарий
    Дано создаем объект класса Uppercase с методом перевода строк в верхний регистр
    Когда я ввожу слово cat
    Тогда я получаю слово CAT

    Сценарий: второй сценарий
    Дано создаем объект класса Uppercase с методом перевода строк в верхний регистр
    Когда я ввожу слово Dog
    Тогда я получаю слово DOG
    
    */


}
