Feature: Post Attendances Timesync API
  @Timesync @PositiveCase
  Scenario: Post Attendances employee
    Given Post Attendances with valid token
    When Send request post attendances
    Then Should return status code 201