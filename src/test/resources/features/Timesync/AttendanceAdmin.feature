Feature: Attendance Admin
  @Timesync @PositiveCase
  Scenario Outline: Admin can post create attendance employees
    Given POST attendance employees by admin with id <id>, attendance "<at>", date start "<ds>", date end "<de>"
    When Send request post attendance employees by admin
    Then Should return status code 200
    And Response body message post attendance employees should be: "success create attendance"
    And Validate json schema post attendance employees by admin
    Examples:
      | id | at           | ds         | de         |
      | 29 | On Leave     | 2023-02-15 | 2023-02-17 |
      | 30 | Sick Leave   | 2023-02-13 | 2023-02-14 |
      | 32 | On Leave     | 2023-02-20 | 2023-02-23 |
      | 36 | Annual Leave | 2023-03-01 | 2023-03-04 |

  @Timesync @NegativeCase
  Scenario Outline: Admin can't post attendances without id
    Given POST attendance employees by admin without id, attendance "<at>", date start "<ds>", date end "<de>"
    When Send request post attendance employees without id
    Then Should return status code 400
    And Response body message post attendance employees without id: "clock in session has ended"
    And Validate json schema post attendance employees without id
    Examples:
      | at         | ds         | de         |
      | Sick Leave | 2023-02-22 | 2023-02-23 |
      | On Leave   | 2023-02-15 | 2023-02-17 |
      | Sick Leave | 2023-02-13 | 2023-02-14 |

