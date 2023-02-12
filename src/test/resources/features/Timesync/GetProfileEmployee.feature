Feature: Get Employee Profile
  Scenario: Get Employee profile with valid token employee
    Given Get employee profile with valid token
    When Send request get profile employee
    Then Should return status code 200
    And Validate JSON schema get employee profile


