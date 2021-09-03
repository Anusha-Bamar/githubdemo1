Feature: Submit basic form

Scenario Outline: Submit basic contact form 
	Given User is on homepage of myContactForm
	Then enter the "<name>" and "<email>"
	Then enter the message in the textbox
	And after giving details submit the form
	Examples:
	| name | email |
	| Honey | honey@gmail.com |