Feature: Get Approvals employee
  Scenario: Get Approvals employee with valid token
    Given Get approvals with valid token
    When Send request get approvals
    Then Should return status code 200
    And Response body message "success show all employee approval record"
    And Validate JSON schema get approvals

  Scenario: Get Approvals employee with invalid token
    Given Get approvals with invalid token
    When Send request get approvals
    Then Should return status code 401
    And Response body message "invalid or expired jwt"