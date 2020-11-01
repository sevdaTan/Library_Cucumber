@BooksFeature
Feature: Books feature
  As a user, I should be able to select the type of the book from Book Categories

  Background: common steps
    Given user is on the dashboard page
    And user clicks on the Books tab

  @bookType
  Scenario: Choosing the book type
    When user clicks on the book categories input box
    Then user chooses the book type as "Short Story"

