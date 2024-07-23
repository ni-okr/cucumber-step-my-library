Feature: Validation of get method

      Scenario Outline: Send a valid Request to get user details
        Given I send a request to the URL to get user details
        Then the response will return status <statusCode> and id <id> and email "<employee_email>" and first name "<employee_firstname>" and last name "<employee_lastname>"

      Examples:
        | statusCode | id  | employee_email          | employee_firstname | employee_lastname |
        | 200        | 2   | janet.weaver@reqres.in  | Janet              | Weaver Gray       |
        | 201        | 3   | janet.weaver@reqres.in  | Janet2              | Weaver2          |


#    Упражнение на получение данных из таблицы.
#    Создайте Java-шаги для сценария и распечатайте значения из таблицы в консоль.
#
#    В этой задаче не потребуется создавать поля переменных класса (result и прочее) и не
#    требуется делать assert.
#    Здесь очень простая задача - только получить в Java-шагах данные таблицы и распечатать их в консоль.
