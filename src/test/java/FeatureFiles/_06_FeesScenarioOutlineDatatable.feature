#Senaryo :
#  Daha önceki Fee Functionality Senaryosunu
#  name, code, intCode ve priority için 5 farklı kombinasyon için çalıştırınız.

Feature: Fees multiple values functionality

  Background:

    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login succesfully

  @SmokeTest @Regression
  Scenario Outline: Fee Functionality
    And Click on the element in LeftNav
      | setup         |
      | parameters    |
      | fees |

    And Click on the element in Dialog
      | addButton |

    And User sending the keys in Dialog Content
      | nameInput | <name> |
      | codeInput | <code>     |
      | integrationCode | <intCode> |
      | priorityCode | <priority>    |

    And Click on the element in Dialog
      | toggleBar |
      | saveInput |

    Then Succes message should be displayed

    And User delete item from Dialog Content
      | <name> |

    Then Succes message should be displayed
    Examples:
      | name  | code | intCode | priority |
      | berFssee1  | 3737  | payPal | 000037 |
      | sdass  | 3738 | crypto | 000038 |
      | naaaasme  | 3739 | cash | 000039 |
      | naaaaddsme  | 3740 | cheque | 000040 |
      | nadasdasdddme  | 3741 | applePay | 000041 |

