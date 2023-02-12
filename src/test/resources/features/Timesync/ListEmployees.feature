Feature: Testing List all Employees Timessync API
  @Timesync @PositiveCase
  Scenario: Get list employees
    Given GET list all employees by admin
    When Send request get list employees
    Then Should return status code 200
    And Validate json schema all list employees

  @Timesync @PositiveCase
  Scenario: Get single employee
    Given GET employee with valid id 19
    When Send request get single user
    Then Should return status code 200
    And Validate json schema single employee