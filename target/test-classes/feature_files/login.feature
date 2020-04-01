@login
Feature: Login an user in Twitter platform
  I want to use Twitter

  @tag1
  Scenario: Login success with a register user
    Given I want to open "https://twitter.com/login" in a browser
    When I enter "@sebastiancalvo4" in the user field
    	And I enter "remolinosAnibal" in the password field
    	And I press the login button
    Then I see the index page
    
    