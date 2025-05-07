Feature: Testing Login Functionality
  @Regression
  Scenario: Testing Login Functionality with valid credentials
    Given User passed URL
    When passed Credentials
    And click Submit Button
    Then User should see Login Page

    @Regression
  Scenario Outline: Testing Login Functionality with valid credentials
    Given User passed URL
    When passed "<user>" and "<password>" Credentials
    And click Submit Button
    Then User should see Login Page
    Examples:
      | user    | password |
      | sirich8 | ss       |


