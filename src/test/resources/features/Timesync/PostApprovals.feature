Feature: Post employee approvals
  @Timesync @PositiveCase
  Scenario: Post employee approvals with valid JSON
    Given Post employee with valid token and json
    When Send request post employee approvals
    Then Should return status code 201
    And Validate JSON schema post approvals