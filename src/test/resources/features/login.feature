@login
Feature:
  User Story:
  As a user, I should be able to login

  Accounts are: HR, Marketing, Helpdesk

  Background: For the scenarios in the feature file, user is expected to be on login page
    Given user is on the login page


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
      | hr4@cybertekschool.com         | UserUser |
      | hr5@cybertekschool.com         | UserUser |
      | hr6@cybertekschool.com         | UserUser |
      | hr7@cybertekschool.com         | UserUser |
      | hr8@cybertekschool.com         | UserUser |
      | hr9@cybertekschool.com         | UserUser |
      | hr10@cybertekschool.com        | UserUser |
      | marketing1@cybertekschool.com  | UserUser |
      | marketing2@cybertekschool.com  | UserUser |
      | marketing3@cybertekschool.com  | UserUser |
      | marketing4@cybertekschool.com  | UserUser |
      | marketing5@cybertekschool.com  | UserUser |
      | marketing6@cybertekschool.com  | UserUser |
      | marketing7@cybertekschool.com  | UserUser |
      | marketing8@cybertekschool.com  | UserUser |
      | marketing9@cybertekschool.com  | UserUser |
      | marketing10@cybertekschool.com | UserUser |
      | helpdesk1@cybertekschool.com   | UserUser |
      | helpdesk2@cybertekschool.com   | UserUser |
      | helpdesk3@cybertekschool.com   | UserUser |
      | helpdesk4@cybertekschool.com   | UserUser |
      | helpdesk5@cybertekschool.com   | UserUser |
      | helpdesk6@cybertekschool.com   | UserUser |
      | helpdesk7@cybertekschool.com   | UserUser |
      | helpdesk8@cybertekschool.com   | UserUser |
      | helpdesk9@cybertekschool.com   | UserUser |
      | helpdesk10@cybertekschool.com  | UserUser |


