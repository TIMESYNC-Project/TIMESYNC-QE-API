Feature: Put Attendances
  Scenario: Put Attendances with valid token and json
    Given Put attendances with valid token and json
    When Send request put attendances
    Then Should return status code 200
