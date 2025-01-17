package ru.roman.lessons;

import io.cucumber.java.ru.Когда;
import io.cucumber.java.ru.Тогда;
import ru.roman.runners.CalcTest;
import ru.roman.runners.ValidationTest;
import ru.roman.steps.params.ParametrsSteps;
import ru.roman.steps.params.UpperCaseSteps;

public class LessonParams {
    /*
    Параметры могут быть 2-х тAndпов: Regular / Cucumber expressions
     */

     /*
    Parameter Type	Description

    {int}	Matches integers, for example 71 or -19. Converts to a 32-bit signed integer if the platform supports it.
    {float}	Matches floats, for example 3.6, .8 or -9.2. Converts to a 32 bit float if the platform supports it.

    {word}	Matches words without whitespace, for example banana (but not banana split).
    {string}	Matches single-quoted or double-quoted strings, for example "banana split" or 'banana split' (but not banana split). Only the text between the quotes will be extracted. The quotes themselves are discarded. Empty pairs of quotes are valid and will be matched and passed to step code as empty strings.

    {bigdecimal}	Matches the same as {float}, but converts to a BigDecimal if the platform supports it.
    {double}	Matches the same as {float}, but converts to a 64 bit float if the platform supports it.
    {biginteger}	Matches the same as {int}, but converts to a BigInteger if the platform supports it.
    {byte}	Matches the same as {int}, but converts to an 8 bit signed integer if the platform supports it.
    {short}	Matches the same as {int}, but converts to a 16 bit signed integer if the platform supports it.
    {long}	Matches the same as {int}, but converts to a 64 bit signed integer if the platform supports it.
     */

     /*
     {word} - без пробелов
     {string} - с пробелами
     */

    ParametrsSteps parametrsSteps;

    // === пример передачи параметров и создание шагов
    UpperCaseSteps upperCaseSteps;

    /*

    Структура сценария - Примеры

    <...> позволяют подставлять данные из таблицы

    */
    CalcTest calcTest; // см. feature-файл и шаги
    ValidationTest validationTest;


}
