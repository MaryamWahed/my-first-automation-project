@wip
Feature: User should be not able to login with invalid credentials


  Scenario Outline: login with invalid credentials
    When user enters username "<username>"
    And user enters password "<password>"
    And user clicks the login button
    Then user should launch to the home page

    Examples:
      | username                  | password   |
      | abc@cyberteckschool.com   | usersusers |
      | 972974                    | abc        |
      | hr@cydeo.com              | Useruser   |
      | uashdh                    | UserUser   |
      | lkiahsgd@cybetekschoolcom | UserUSer   |