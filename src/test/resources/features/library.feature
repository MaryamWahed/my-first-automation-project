Feature:Library login
  User Story:
  As a user, I should be able to login

  Accounts are: HR, Marketing, Helpdesk

  Background: For the scenarios in the feature file, user is expected to be on login page
    Given user is on the library login page

  Scenario: HR login
    When user enters HR username
    And user enters HR password
    Then user should launch to the home page


  Scenario: Marketing login
    When user enters Marketing username
    And user enters Marketing password
    Then user should launch to the home page

  Scenario: Helpdesk login
    When user enters Helpdesk username
    And user enters Helpdesk password
    Then user should launch to the home page




