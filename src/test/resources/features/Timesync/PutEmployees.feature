Feature: Put Employees
  Scenario: Put employees with valid token employee
    Given Put employee with valid token
    When Send request put employee
    Then Should return status code 200


  Scenario: Put employees with invalid token employee
    Given Put employee with invalid token
    When Send request put employee
    Then Should return status code 401