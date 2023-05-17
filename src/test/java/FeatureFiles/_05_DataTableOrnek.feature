Feature: DataTable Ornek

  @SmokeTest @Regression
  Scenario: Users List
    When Write username "berkay"
    And Write username and Password "berkay" and "1234"
    And Write username as DataTable
      | besdkray  |
      | mesdhmet |
      | aydse   |
      | kadsya   |

    And Write username and password as DataTable
      | bersadkay  | 1234 |
      | mehdmet | 2324 |
      | aysasde   | 4545 |
      | kaydsaaa   | 4554 |