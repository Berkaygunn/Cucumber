Feature: DataTable Ornek

  Scenario: Users List
    When Write username "ismet"
    And Write username and Password "ismet" and "1234"
    And Write username as DataTable
      | besdkray  |
      | mesdhmet |
      | aydşe   |
      | kadsya   |

    And Write username and password as DataTable
      | bersadkay  | 1234 |
      | mehdmet | 2324 |
      | ayşasde   | 4545 |
      | kaydsaaa   | 4554 |