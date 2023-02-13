Feature: Get Employee Record Timesync API
  @Timesync @PositiveCase
  Scenario: Get Record Employee
    Given Get Record with valid token employee
    When Send request get record
    Then Should return status code 200
    And Response body message "success show employee attendance record"
    And Validate JSON schema get record

  @Timesync @PositiveCase
  Scenario: Get Record Employee with invalid token
    Given Get Record with invalid token
    When Send request get record
    Then Should return status code 401
    And Response body message "invalid or expired jwt"
