@SignIn
Feature: User Authentication
  Only registerd user can sign in
  Background:
    Given User is on automationpractice sign in page

  @NonRegistered
  Scenario Outline: Sign In as non-registered user
    When '<user>' enters his?her '<email>' and '<password>'
    Then s?he cannot signed in
    Examples:
      | user    | email             | password |
      | Syahrul | noturaun@test.com | passwd   |

  @Registered
  Scenario Outline: Sign In as registered user
    When '<user>' enters his?her '<email>' and '<password>'
    Then s?he can signed in
    Examples:
      | user | email         | password |
      | Jono | test@mail.com | password |