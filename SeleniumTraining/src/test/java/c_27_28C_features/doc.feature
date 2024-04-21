Feature: Automate Leaftaps Application 

#Background: user is logged in
	#Given Launch chrome browser and load url 
	#And enter username as demosalesmanager 
	#And enter password as crmsfa 
	#When click the login button
	#And click CRMSFA
	#Then close browser
@smoke	
Scenario Outline: TC001_Login and Logout 

	Given Launch chrome browser and load url 
	#And enter username as demosalesmanager
	#And enter password as crmsfa
	And enter username as <username>
	And enter password as <password>
	When click the login button 
	Then its navigated Homepage 
	And  click the logout button
	And close browser
	
	Examples:
	|username|password|
	|DemoSalesManager|crmsfa|
	|DemoCSR|crmsfa|
@smoke	
Scenario Outline:  TC002_Login and Logout for failure

	Given Launch chrome browser and load url 
	#And enter username as ssssss 
	And enter username as <username> 
	#And enter password as crmsfa 
	And enter password as <password>
	When click the login button 
	Then its navigate same Page
	But verify error msg
	And close browser
	
	Examples: 
	|username|password|
	|Mamun|crmsfa|
	|DemoCSR|crmsfa1|
	
@smoke
Scenario Outline: TC003_CreateLead

	#Given Launch chrome browser and load url 
	#And enter username as demosalesmanager 
	#And enter password as crmsfa 
	#And click the login button
	#And click CRMSFA
	Given Launch chrome browser and load url 
	And enter username as demosalesmanager 
	And enter password as crmsfa 
	And click the login button
	And click CRMSFA
	Given click leads link
	When click createLead	
	#And enter the company as ABC
	#And enter the firstname as Hema
	#And enter the lastname as Mali
	And enter the company as <companyname>
	And enter the firstname as <firstname>
	And enter the lastname as <lastname>
	And choose source as Website
	And click the create lead button
	Then its navigated ViewLeadPage 
	And verify the firstname
	And close browser
	
	
	Examples:
		|companyname|firstname|lastname|
		|ABC|Hema|Mali|
		|BBC|Raj|Kumar|
		|CBC|Gopi|Jkumar|
	
 @wip
Scenario: TC004_EditLead

	#Given Launch chrome browser and load url 
	#And enter username as demosalesmanager 
	#And enter password as crmsfa 
	#And click the login button
	#And click CRMSFA
	Given click leads link
	When click Find Leads
	And enter firstname
	And click Find Leads button
	And click first resulting lead
	Then navigated ViewLeadPage
	And verify title of the page
	And click on Edit
	Then navigated Edit Lead page
	And change the company name
	And click update
	And confirm changed name appears
	And close browser
@wip	
Scenario: TC005_DeleteLead

	#Given Launch chrome browser and load url 
	#And enter username as demosalesmanager 
	#And enter password as crmsfa 
	#And click the login button
	#And click CRMSFA
	Given click leads link
	When click Find Leads
	
	And click on phone
	And enter phone number 
	And click find leads button
	And capture lead ID of first resulting lead
	And click first resulting lead
	And click Delete
	Then navigated MyLeadsPage
	And click Find Leads
	And enter captured lead ID
	And click find leads button
	And verify error message
	And close browser


