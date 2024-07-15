package ru.roman;

import ru.roman.lessons.LessonParams;
import ru.roman.runners.Example1Test;
import ru.roman.steps.params.ParametrsSteps;

public class LessonCucumber {
     /*
    Для описания сценариев тестов предназначен файл с расширением .feature.
    Такие файлы помещаются в resources.

    В feature-файлах указывается названием, сценарии и шаги сценариев.
    Шаги сценариев имеют названия, которые будут указаны в Java-классах при аннотации методов.

    Для запуска feature-файлов создается класс запуска с нужными аннотациями.
    Какие именно feature-файлы запускать указывается в аннотациях @SelectClasspathResource, @SelectPackages

    feature-файлы на ресурсе cucumber.io имеют вид имен:
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
