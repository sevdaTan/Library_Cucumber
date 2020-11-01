@UsersFeature @smoke
Feature: Users feature
  As a user, I want to be able to choose my status

  Background: common steps
  Given user is on the dashboard page
  And user clicks on the Users tab

#    US1_AC3
  @status
  Scenario: Choosing the status
    When user clicks on the status input box
    Then user chooses the "ACTIVE" status

#     US1_AC2
    @userGroup
    Scenario: user is able to choose group on users page
      When user clicks on User Group
      Then user chooses "Librarian" option

#     US1_AC5
  @userRecordingNumber
  Scenario: Showing user record
    When user clicks on  Show "100" record
    Then user is able to see the chosen amount of record on the box