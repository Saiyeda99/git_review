
Feature: Twitter Signup
In order to verify search
as a user
i want to Twitter sign up

Scenario Outline: Twitter Signup
Given user visits Twitter homepage

When user click signup with phone number or email

When user type "<name>", "<phone number>" and select date of birth: month, date, year

When user click next and click next and click sign up

Then user will be able to signup Twitter
Examples: 
|name|phone number|
|Poly ahmed |6465464493 |
