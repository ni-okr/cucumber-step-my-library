# language: ru
Функция: Data table

  Сценарий: первый сценарий
    * I am a VK user
    * I enter my username as MyName
    * I enter my password as 12345
    * login should be successful
    * home page should not be missing

  Сценарий: второй сценарий
    * I am a ВК user
    * I enter my username as Юзернейм
    * I enter my password as 111000
    * login should be successful
    * home page should not be missing

  Сценарий: третий сценарий
    * I am a ВК user
    * I enter my key phrase as "I like apples"
    * login should be successful
    * home page should not be missing
