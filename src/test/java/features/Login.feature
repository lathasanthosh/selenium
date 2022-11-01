Feature: Application Login

Scenario: Login with valid credentials
Given Open any Browser
And Navigate to Login page
When User enters 		Email as "lathakh02@gmail.com" and Password as "Lathakh@123" into the fields
And User clicks on Login button
Then Verify user is able to successfully login
