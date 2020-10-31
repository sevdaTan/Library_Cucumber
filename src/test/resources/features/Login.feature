
  Feature: Login
#    As a user I want to be able to login as a librarian

    @login
    Scenario: Login as a librarian
      Given user is on login page
      When the user logs in as a librarian
      Then user should see dashboard page




