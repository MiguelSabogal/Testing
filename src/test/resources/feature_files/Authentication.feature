@login
Feature: Login an user in Twitter platform
  I want to use Twitter

  @tag1
  Scenario: Login success with a register user
    Given I want to open Twitter in a browser
	  When Write user "beto2602"
    And Write pass "mapaloru"
    When Click login button
    Then Twitter home page