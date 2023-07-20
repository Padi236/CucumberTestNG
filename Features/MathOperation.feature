#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template

Feature: Math Operations
 
  @tag2
  Scenario Outline: Addition
    Given I am trying to do addition of two numbers
    When I check for the addition of <value1> and <value2> is equal to <result>
    Then I verify the <status> in step

    Examples: 
      | value1  | value2 | result | status  |
      | 10 | 5 | 15 | success |
      | 10 | 5 | 20 | fail |
