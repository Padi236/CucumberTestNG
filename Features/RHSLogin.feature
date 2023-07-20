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

Feature: Riddhi Housing Society Login Feature

  @tag2
  Scenario Outline: RHSLogin Data Driven
    Given Enter Url Enter the url "https://tronsoftech.in/projects/riddhi/index.php"
    When Input username as "<uname>" and password as "<password>"
    Then Verify the "<status>" in step

    Examples: 
      | uname  | password | status  |
      | Riddhi | 100 | success |
      | Riddhi | riddhi | fail |
      
