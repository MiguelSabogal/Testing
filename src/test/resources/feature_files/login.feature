@login
Feature: Twitter user can login in the Twitter platform

@success
  Scenario: Login success 
    Given A user put the "user" and "password"
    When The user do click in a login button
    Then It should load the main menu
    
@error
  Scenario: Login incorrect 
    Then It should load the login Error