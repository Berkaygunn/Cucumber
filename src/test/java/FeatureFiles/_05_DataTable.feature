Feature: DataTable Functionality

  Background:
    Given Navigate to Campus
    When Enter username and password and click login button
    Then User should login succesfully

  @SmokeTest @Regression
  Scenario: Create Country
    And Click on the element in LeftNav
      | setup      |
      | parameters |
      | countries  |

    And Click on the element in Dialog
      | addButton |

    And User sending the keys in Dialog Content
      | nameInput | bedsrrUlk1 |
      | codeInput | b3434     |

    And Click on the element in Dialog
      | saveButton |

    Then Succes message should be displayed

    And User delete item from Dialog Content
      | bedsrrUlk1 |

    Then Succes message should be displayed

  @SmokeTest @Regression
  Scenario: Create Nationality

    And Click on the element in LeftNav
      | setup         |
      | parameters    |
      | nationalities |

    And Click on the element in Dialog
      | addButton |

    And User sending the keys in Dialog Content
      | nameInput | bherUl1 |

    And Click on the element in Dialog
      | saveInput |

    Then Succes message should be displayed

    And User delete item from Dialog Content
      | bherUl1 |

    Then Succes message should be displayed


     @SmokeTest @Regression
    Scenario: Fee Functionality
      And Click on the element in LeftNav
        | setup         |
        | parameters    |
        | fees |

      And Click on the element in Dialog
        | addButton |

      And User sending the keys in Dialog Content
        | nameInput | berrrssFee1 |
        | codeInput | b3434     |
        | integrationCode | 344 |
        | priorityCode | 345     |

      And Click on the element in Dialog
        | toggleBar |
        | saveInput |

      Then Succes message should be displayed

      And User delete item from Dialog Content
        | berrrssFee1 |

      Then Succes message should be displayed
