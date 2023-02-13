Feature: Get Presences
  @Timesync @PositiveCase
  Scenario: Get presences employee
    Given Get presences employee with valid token
    When Send request get presences employee
    Then Should return status code 200
    And Response body message "success show presence data today"
    And Validate JSON schema get presences