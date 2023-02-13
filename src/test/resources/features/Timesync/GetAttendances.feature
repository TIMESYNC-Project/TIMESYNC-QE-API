Feature: Get Attendances
  @Timesync
  Scenario: Get attendances with valid param
    Given Get attendances employee with valid token date from "2023-02-09" and date to "2023-02-10"
    When Send request get attendances with param employee
    Then Should return status code 200
    And Response body message "success show employee attendance record"
    And Validate JSON schema get attendances

  @Timesync
  Scenario: Get attendances with valid token
    Given Get attendances employee with valid token
    When Send request get attendances with token employee
    Then Should return status code 200
    And Response body message "success show employee attendance record"
    And Validate JSON schema get attendances