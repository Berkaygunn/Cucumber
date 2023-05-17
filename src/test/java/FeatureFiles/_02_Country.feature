

  Feature: Country Functionality

    @SmokeTest @Regression
    Scenario: Create Country

      Given Navigate to Campus
      When  Enter username and password and click login button
      Then  User should login succesfully
      And Navigate to country page
      When create a country
      Then Succes message should be displayed

