Feature: [Automate Amazon Order details] Home page
In order to check my order details  
As a register user 
I want to specify the feature of order details page


Background: 
Given a register user exists
And user is on A login page
When user enters username
And user enters pasword
And user clicks on login button
Then user naviagtes to order page

Scenario: Verify Previous Order Details
When user clicks on order links
Then user checks previous order details

Scenario: Verify Open Order Details
When user clicks on open order link
Then user verify the open order details

Scenario: Verify Cancelled Order Details
When user clicks on canclelled order link
Then user verify the cancelled order details



