Feature: New account Validation
  @CNU
  Scenario: Create a new Account
    Given user opens the new user account page
    When  user enters valid input
    And user enter valid verification code
    Then user is able to successfully create new account
