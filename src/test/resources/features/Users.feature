@UsersFeature
Feature: Users feature
  As a user, I want to be able to choose my status

  Background: common steps
  Given user is on the dashboard page
  And user clicks on the Users tab

  @status
  Scenario: Choosing the status
    When user clicks on the status input box
    Then user chooses the "ACTIVE" status
