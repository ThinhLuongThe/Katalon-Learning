@tag
Feature: Register a form

  @tag1
  Scenario: Input only required fields
    Given User is on Registration Page
    When User inputs Username
    And User inputs Email
    And User inputs Password
    And User inputs Confirm Password
    And User selects Gender
    And User clicks TOC
    And User clicks Signup button
    Then Confirmation text appears
    #And Username field is empty
