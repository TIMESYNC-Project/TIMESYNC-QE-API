Feature: Post Attendances
  Scenario: Post Attendances employee
    Given Post Attendances with valid token
    When Send request post attendances
    Then Should return status code 201