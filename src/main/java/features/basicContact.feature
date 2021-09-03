Feature: Submit basic form

Scenario: Submit basic contact form 
	Given User is on homepage of myContactForm
	Then enter the details of user
	| John | john@gmail.com |
	Then enter the message in the textbox
	And after giving details submit the form