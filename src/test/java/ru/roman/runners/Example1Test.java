package ru.roman.runners;

import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;

import static io.cucumber.junit.platform.engine.Constants.PLUGIN_PROPERTY_NAME;


@Suite
@SelectClasspathResource("example1")
// @SelectClasspathResource("example1/example2.feature")
@ConfigurationParameter(key = PLUGIN_PROPERTY_NAME, value = "pretty")
public class Example1Test {
    /*
    @Suite - JUnit5 аннотация для использования с Cucumber

    @SelectClasspathResource("userfeature") - смотрит папку с этим именем в resources, запускает в feature, которые там находятся.
    @SelectPackages("ru.javatutor.somefeature") - дополнительно можно указать пакеты в resource. Если находит feature, то дополнительно запустит

    @ConfigurationParameter(key = PLUGIN_PROPERTY_NAME, value = "pretty") - красивая печать

    @ConfigurationParameter(key = GLUE_PROPERTY_NAME, value = "ru.javatutor.steps") - можно вручную указать пакет, где лежат шаги
    Это нужно, чтобы шаги из других feature не вмешивались, например, After / Before из других папок.

    */
    
    /*

    Команды:

    Given − It describes the pre-requisite for the test to be executed.
    Example − GIVEN I am a Facebook user

    When − It defines the trigger point for any test scenario execution.
    Example − WHEN I enter "<username>"

    Then − Then holds the expected result for the test to be executed.
    Example − THEN login should be successful.

    And − It provides the logical AND condition between any two statements. AND can be used in conjunction with GIVEN, WHEN and THEN statement.
    Example − WHEN I enter my "<username>" AND I enter my "<password>"

    But − It signifies logical OR condition between any two statements. OR can be used in conjunction with GIVEN, WHEN and THEN statement.
    Example − THEN login should be successful. BUT home page should not be missing.
     
    */

    /*
    >>> ДЗ.  Реализуйте сценарий.
    Имя и пароль пока не указывайте, они будут добавлены в следующем задании.
    Сейчас сформируйте запуск следующего сценария.

    GIVEN I am a VK user
    WHEN I enter my username
    AND I enter my password
    THEN login should be successful
    BUT home page should not be missing
    
     */
}
