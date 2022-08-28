Feature: Twitter Login
In order to verify search as a user i want to Login Twitter

Scenario Outline: Twitter Login

Given user visit twitter home page
When user type valid "<phone no>" and click next
When user type valid "<password>" and click login
Then user able to login twitter account

Examples: 
|phone no|password|
|1234|1234|