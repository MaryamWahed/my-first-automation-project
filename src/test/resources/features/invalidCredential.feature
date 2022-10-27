
Feature: User should be not able to login with invalid credentials

  Background: For the scenarios in the feature file, user is expected to be on login page
    Given user is on the pro-crm login page

  @wip
  Scenario Outline: login with invalid credentials
    When user enters invalid username "<username>"
    And user enters invalid password "<password>"
    And user enters the login button
    Then user should not be able to login

    Examples:
      | username                  | password   |
      | abc@cyberteckschool.com   | usersusers |
      | 972974                    | abc        |
