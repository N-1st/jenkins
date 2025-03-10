@LoginTest
Feature: check the login  functionality
Scenario: user login in with valid credentials.
Given User is an herokuapp page
When User enters "tomsmith" and "SuperSecretPassword!" and clicklogin
Then Message displayed Login Successfully

