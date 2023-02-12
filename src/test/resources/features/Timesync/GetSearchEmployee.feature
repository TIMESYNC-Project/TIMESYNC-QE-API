Feature: Get Search
  Scenario: Get Search employee
    Given Get search employee with valid token
    When Send request get search
    Then Should return status code 200