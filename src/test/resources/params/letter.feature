Feature: Get letter by index

  Scenario: First example
    Given initialization of Letter class
    When enter param as cat and as 0
    Then return result as c

  Scenario: Second example
    Given initialization of Letter class
    When enter param as cat and as 1
    Then return result as a

  Scenario: Third example
    Given initialization of Letter class
    When enter param as DOG and as 2
    Then return result as G

  Scenario: Incorrect example
    Given initialization of Letter class
    When enter param as DOG and as 0
    Then result should not be W