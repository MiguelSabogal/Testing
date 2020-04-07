@login
Feature: Twitter user can login in the Twitter platform

@success
  Scenario Outline: Login success 
    Given A user put the "user" and "password"
    When The user do click in a login button
    Then It should load the main menu
    
        Examples:
      | user       | password     |
      | user123    | pass123      |
      
@error
  Scenario Outline: Login error 
    Given A user put the "user" and "password"
    When The user do click in a login button
    Then It should load the error message
    
        Examples:
      | user       | password     |
      | user123    | pass123      |