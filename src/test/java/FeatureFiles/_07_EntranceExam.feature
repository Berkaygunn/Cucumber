#Senaryo :
#  Exam Formunun Çalışmasını test ediniz
#  1 sınav girişi yapıp
#  sonrasında silmesini yapınız

Feature: Exam

  Background:

    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login succesfully


  @SmokeTest @Regression
  Scenario: Entrance exam Functionality
    And Click on the element in LeftNav
      | entranceExams  |
      | entranceSetup  |
      | entranceExams2 |

    And Click on the element in Dialog
      | addButton |

    And User sending the keys in Dialog Content
      | nameInput | Exam21 |

    And Click on the element in Dialog
      | period  |
      | period2 |
      | grade   |
      | grade2  |

    And Click on the element in Dialog
      | saveInput |

    Then Succes message should be displayed

    And Click on the element in Dialog
      | back |

    And User delete item from Dialog Content
      | Exam21 |

    Then Succes message should be displayed


