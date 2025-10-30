Feature: Store login
This feature deals with the login

#@TC1
#Scenario: Login with correct username and password.

#When I navigate to login page
#And I entered "mercury" and "mercury"
#And I clicked on signin button
#Then Successfully logged in

#@TC2
#Scenario: Login with correct username and incorrect password.

#Given I navigate to login page

#And I entered "mercury" and "allah hu akbar"

#And I clicked signin button

#Then Its navigated to the error msg



#Scenario: using DataTable

#	Given I navigate to login page
#	When I entered following details
#	| userName | passWord |
#	| mercury | mercury |
#	| allah | akbar |
#	And I clicked signin button
#	Then Its navigated to the home page

#===========================================================

Scenario Outline: Login with correct username and correct password
 
Given I navigate to Browser
Then I navigate to "https://demo.guru99.com/test/newtours/index.php"
 
When I insert "<userName>" and "<passWord>"
 
And I clicked the signin button
 
# Then Its navigates the UI "<expected Result>"
Then Its navigated to the "<expected Result>"
 
 
Examples:
 
| userName | passWord | expected Result |
 
| mercury | mercury | Login Successfully |
 
| honey | madhu | Enter data Correctly |
 
| mamatha | 2004 | Enter data Correctly |





















