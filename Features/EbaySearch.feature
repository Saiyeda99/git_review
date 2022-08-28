
Feature: EbaySearch
Scenario Outline: EbaySearch
Given user visit ebay home page
When user type "<productname>" and click searchicon
Then user should be able to see expected product

Examples: 
| productname |
| SLR digital carema |
