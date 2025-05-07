Feature: Google search functionality
  Scenario: Search in Google
    Given Browser open
    When User enter text in search box
    And Click Enter
    Then User should home page
