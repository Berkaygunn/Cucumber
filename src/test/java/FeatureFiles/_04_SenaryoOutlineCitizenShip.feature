#Senaryo
#CitizenShip sayfasına gidiniz.
#Create işlemini parameter yöntemi ile doğrulayınız.
#Daha sonra aynı bilgilerle tekrar Create yapılamadığını doğrulayınız. (negatif test)

Feature: Citizenship Functionality


  Background:   # before senaryo
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login succesfully
    And Navigate to Citizenship page

  @SmokeTest @Regression
  Scenario Outline: Citizenship create
    When User a Citizenship name as "<name>" short name as "<short>"
    Then Succes message should be displayed

    When User a Citizenship name as "<name>" short name as "<short>"
    Then Already exist message should be displayed

    When User delete the "<name>"
    Then Succes message should be displayed

    Examples:
      | name | short |
      | be111adassdUlk700 | be11das1ru70 |
      | be11Uddsaas1lk7110 | bed11r1u601 |
      | be11dasUdsl1k700| bedsa111r0002 |
