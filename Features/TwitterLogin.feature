
Feature: Twitter Login
In order to verify search
as a user
i want to Twitter Login
Scenario Outline: Twitter login

Given user visit Twitter homepage

When user type valid  "<email>" and click next

When user type valid "<password>" password and click signin

Then user will be able to login successfully


Examples:
|email|password|
|saiyedafatema@yahoo.com|1234|