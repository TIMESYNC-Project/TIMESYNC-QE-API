Feature: Get Employee Inbox
  Scenario: Get Employee Inbox with valid token employee
    Given Get employee Inbox with valid token
    When Send request get employee Inbox
    Then Should return status code 200
    And Response body message "success show employee inbox message"
    And Validate JSON schema get employee Inbox