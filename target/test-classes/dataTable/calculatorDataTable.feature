# language: ru
Функция: Калькулятор

  # черточки в таблице надо ставить именно в таком виде. Например, 3 параметра - значит 4 черточки.

  Структура сценария: Складываю числа <num1> и <num2>
    Дано инициализация класса калькулятора
    Когда складываю <num1> с <num2>
    Тогда результат равен <total>

    Примеры:
      | num1 | num2 | total |
      | -2   | 3    | 1     |
      | 10   | 15   | 25    |
      | 99   | -99  | 0     |
      | -1   | -10  | -11   |

  Структура сценария: Incorrect examples of adding two numbers <num1> + <num2>
    Дано инициализация класса калькулятора
    Когда складываю <num1> с <num2>
    Тогда результат не равен <total>

    Примеры:
      | num1 | num2 | total |
      | -2   | 3    | 10    |
      | 10   | 15   | 250   |
      | 99   | -99  | 1200  |
      | -1   | -10  | -110  |