@tag
Feature: Login to system

  @tag1
  Scenario Outline: Input valid account
    Given User is on Login Page
    When User inputs <username> and <password>
    And User clicks Login button
    Then The Dashboard displays

    Examples: 
      | username | password |
      | Soul2    | Abdc123  |
      | Soul1    | Abdc123  |

