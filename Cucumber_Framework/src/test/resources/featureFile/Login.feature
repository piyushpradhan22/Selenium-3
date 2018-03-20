Feature: Login to newtours
Keywords Summary : This test will verify login related scenarios to http://newtours.demoaut.com
Scenario: Login with valid credentials
Given User navigated to newtours
When user enter Username as automation22@gmail.com and Password password
And user click on login button
Then login should be successful


Scenario: Login with invalid credentials
Given User navigated to newtours
When user enter Username as xyz@gmail.com and Password password
And user click on login button
Then login should be unsuccessful