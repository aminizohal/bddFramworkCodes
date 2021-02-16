Feature: Verify all Items are Present in Desktops tab

Background: 

Given User is on Retail website
When User click on Desktops tab
And User click on Show all desktops

@Desktop
Scenario: Items are present in Desktop page


Then User should see all items are present in Desktop page


 @SuccessTest
Scenario Outline: Multiple items present on show all desktops


And User click ADD TO CART option on '<ItemName>' item
And User select quantity '<1>'
And User click add to cart button
Then User should see a message 'Success: you have added HP LP 3065 to your shopping cart!'

Examples:

|ItemName|Quantity|
|HP LP3065|1|
