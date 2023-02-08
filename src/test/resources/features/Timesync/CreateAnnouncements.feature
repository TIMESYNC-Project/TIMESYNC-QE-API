Feature: Announcements Admin
  @Timesync @PositiveCase
  Scenario: Admin add announcements to employee
    Given Post admin create announcements for employee
    When Send request create announcements from employee
    Then Should return status code 201
    And Validate json schema create announce from employee