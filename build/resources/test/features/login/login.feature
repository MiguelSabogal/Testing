@login_feature
  Feature: Login Feature for Voice

    @successful_login
    Scenario: successful login into voice
      Given that I navigate to voice main page
      When i logged into voice with username 'testuser11' and passsword 'b1password11'
      Then i should be directed to voice home page