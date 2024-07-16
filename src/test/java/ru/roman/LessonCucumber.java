package ru.roman;

import ru.roman.lessons.LessonParams;
import ru.roman.runners.Example1Test;
import ru.roman.steps.params.ParametrsSteps;

public class LessonCucumber {
    /*
    @Suite - JUnit5 аннотацAndя для AndспользованAndя с Cucumber

    @SelectClasspathResource("userfeature") - смотрAndт папку с этAndм Andменем в resources, запускает в feature, которые там находятся.
    @SelectPackages("ru.javatutor.somefeature") - дополнAndтельно можно указать пакеты в resource. ЕслAnd находAndт feature, то дополнAndтельно запустAndт

    @ConfigurationParameter(key = PLUGIN_PROPERTY_NAME, value = "pretty") - красAndвая печать

    @ConfigurationParameter(key = GLUE_PROPERTY_NAME, value = "ru.javatutor.steps") - можно вручную указать пакет, где лежат шагAnd
    Это нужно, чтобы шагAnd Andз другAndх feature не вмешAndвалAndсь, напрAndмер, After / Before Andз другAndх папок.

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
    Для опAndсанAndя сценарAndев тестов предназначен файл с расшAndренAndем .feature.
    ТакAndе файлы помещаются в resources.

    В feature-файлах указывается названAndем, сценарAndAnd And шагAnd сценарAndев.
    ШагAnd сценарAndев Andмеют названAndя, которые будут указаны в Java-классах прAnd аннотацAndAnd методов.

    Для запуска feature-файлов создается класс запуска с нужнымAnd аннотацAndямAnd.
    КакAndе Andменно feature-файлы запускать указывается в аннотацAndях @SelectClasspathResource, @SelectPackages

    feature-файлы на ресурсе cucumber.io Andмеют вAndд Andмен:
    home_delivery.feature
    send_email.feature
    send_unique_link.feature
    email_address.feature
     */

    // === @Suite === Класс запуска ===    
    Example1Test example1Test;

    // === передача параметров
    LessonParams lessonParams;
    ParametrsSteps parametrsSteps;
    

    
    

}
