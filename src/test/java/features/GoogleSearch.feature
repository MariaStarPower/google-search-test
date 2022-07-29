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
Feature: Google Search
  I want to search for something on Google and see it in the results

  Scenario Outline: Searching for something using Google search
    Given I am on the main Google page
    When I type <something> in the search box
    And Hit search
    Then I can see <something> in the results

    Examples: 
      | something |
      | selenium  |
      | cucumber  |
      | java      |