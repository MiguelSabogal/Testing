#Author: d.cardenas@globant.com
@login
Feature: Tests related to Login into the Twitter web app

  @successful_login
  Scenario Outline: Title of your scenario outline
    Given I want to navigate to twitter main page
    When I want to log into Twitter with username <username> and password <password>
    Then I validate the successful login into Twitter


    Examples: 
      | username  | password |
      | "dcardenasg93@gmail.com" | "TestPassword1234" |
