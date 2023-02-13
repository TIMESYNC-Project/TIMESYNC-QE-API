Feature: Get Attendances Location Timesync API
  @Timesync @PositiveCase
  Scenario: Get attendances location employee
    Given Get attendances location employee with valid token
    When Send request get attendances location employee
    Then Should return status code 200
    And Validate JSON schema get attendances location
