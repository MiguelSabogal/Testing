@login
Feature: Login an user in Twitter platform
  I want to use Twitter

  @tag1
  Scenario: Login success with a register user
    Given I want to open Twitter in a browser
    When I want to put <user> and <password>
    Then I ingress to the twitter platform