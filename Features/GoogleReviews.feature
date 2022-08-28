
Feature: Nexttechitc Google reviews
In order to verify search
as a user
i want to review Nextttechits
Scenario Outline: Nexttechitc Google reviews

Given user go to google home page

When user type "<Google search>" in the google search field 

When user click search option 

When user scroll down and 

When user click write a review to write a review

When user type "<review >"

When user click start icon and click post 

Then user able to post a review
Examples: 
|Google search|review|
| Nexttechitc|Best IT School |