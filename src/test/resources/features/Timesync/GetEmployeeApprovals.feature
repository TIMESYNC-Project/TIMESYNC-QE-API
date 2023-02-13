Feature: Get Employee Approvals
  @Timesync @PositiveCase
  Scenario: Get Employee Approvals with valid token
    Given Get Employee Approvals with valid token
    When Send request get Employee Approvals
    Then Should return status code 200
    And Response body message "success show employee approval record"
    And Validate JSON schema get Employee Approvals