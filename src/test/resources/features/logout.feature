@wip
Feature: As a user I should be able to log out
  AC1- The user can log out and ends up on the login page.
  AC2- The user can not go to the home page again by clicking the step back button after successfully logging out.
  AC3- The user must be logged out if the user closes the open tab (all tabs if there are multiple open tabs)


  Background: for the scenarios in the feature file, user is expected to be on the login page.
    Given user is on the login page

  Scenario Outline: user ends up on the login page after logging out
    When user enters username "<username>"
    And user enters password "<password>"
    And user clicks the login button
    And user should launch to the home page
    And user clicks logout button
    Then user should end up on the login page

    Examples:
      | username                       | password |
      | hr32@cybertekschool.com        | UserUser |
      | helpdesk32@cybertekschool.com  | UserUser |
      | marketing32@cybertekschool.com | UserUser |

  Scenario Outline: The user can not go to the home page again by clicking the step back button after successfully logging out.
    When user enters username "<username>"
    And user enters password "<password>"
    And user clicks the login button
    And user should launch to the home page
    And user clicks step back button
    Then user should not see home page

    Examples:
      | username                       | password |
      | hr35@cybertekschool.com        | UserUser |
      | helpdesk35@cybertekschool.com  | UserUser |
      | marketing35@cybertekschool.com | UserUser |

  Scenario Outline: The user must be logged out if the user closes the open browser
    When user enters username "<username>"
    And user enters password "<password>"
    And user clicks the login button
    And user should launch to the home page
    And user closes the open browser
    Then user should end up on the login page

    Examples:
      | username                       | password |
      | hr30@cybertekschool.com        | UserUser |
      | helpdesk30@cybertekschool.com  | UserUser |
      | marketing30@cybertekschool.com | UserUser |



