Feature: Country Multi Scenario

  Background:   # before senaryo
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login succesfully
    And Navigate to country page

    @SmokeTest @Regression
    Scenario: Create country
      When create a country
      Then Succes message should be displayed

      Scenario: Create a country 2
        When create a country name as "berUsalk1" code as "berasa112"
        Then Succes message should be displayed