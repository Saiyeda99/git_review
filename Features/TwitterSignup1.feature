
Feature: Twitter Signup
In order to verify search
as a user
i want to Twitter sign up

Scenario Outline: Twitter Signup

Given users visit Twitter homepage

When user clicks signup with phone number or email

When user types "<name>", and click use email instead 

When user type "<email>" and select date of birth: month, date, year

When user clicks next and click next and click sign up

Then user will be able to signup Twitter successfully
Examples: 
|name|email|
|Poly ahmed |Polyahmed@yahoo.com |
