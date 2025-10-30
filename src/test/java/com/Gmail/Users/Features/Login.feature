Feature: Store login

This feature deals with the login

Scenario: Login with correct username and password.

#Background:
#Given I navigate to login page


#@TC1

#Scenario: Login with correct username and correct password


#Given I navigate to login page

#And I entered username and password

#And I clicked signin button

#Then Itas navigated to the HomePage


#@TC2

#Scenario: Login with correct username and invalid password


#Given I navigate to login page

#And I entered username and password

#But Invalid pwd

#And I clicked signin button

#Then Itas navigated to the error msg


Given I navigate to login page
#And I entered username and password
When I entered "admin1" and "password"
And I clicked signin button
Then I navigated to the Homepage.

