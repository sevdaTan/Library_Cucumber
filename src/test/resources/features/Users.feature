Feature: Choosing Status
  As a user, I want to be able to choose my status



  @status
  Scenario: Choosing the status
    Given user is on the homepage
    Given user clicks on the Users tab
    When user clicks on the status input box
    Then user chooses the "ACTIVE" status
