@login
Feature: Login an user in Twitter platform
  I want to use Twitter

  @tag1
  Scenario Outline: Login success with a register user
    Given I want to open Twitter in a browser
    When I want to write "user" "password"
    
    Examples:
      | user       | password     |
      | user123    | pass123      |
    