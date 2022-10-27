
Feature:
  User Story:
  As a user, I should be able to login

  Accounts are: HR, Marketing, Helpdesk

  Background: For the scenarios in the feature file, user is expected to be on login page
    Given user is on the login page

  @login
  Scenario Outline: login with valid credentials
    When user enters username "<username>"
    And user enters password "<password>"
    And user clicks the login button
    Then user should launch to the home page

    Examples:
      | username                       | password |
      | hr1@cybertekschool.com         | UserUser |
      | hr2@cybertekschool.com         | UserUser |
      | hr3@cybertekschool.com         | UserUser |
      | marketing1@cybertekschool.com  | UserUser |
      | marketing2@cybertekschool.com  | UserUser |
      | marketing3@cybertekschool.com  | UserUser |
      | helpdesk1@cybertekschool.com   | UserUser |
      | helpdesk2@cybertekschool.com   | UserUser |
      | helpdesk3@cybertekschool.com   | UserUser |



