#Author: RohitPednekar


Feature: To verify home page links are working
Background: 
When user selects "firefox" browser
And  launches "https://the-internet.herokuapp.com/"
#And  launches "https://naukri.com/"
Then verify "https://the-internet.herokuapp.com/" is present in url

@tag2
Scenario Outline: To verify home page links are working
Then click on <linkname>
Then verify <url> is present in url
#Then close application


Examples:
    | linkname  					 	| url 							|
    | "A/B Testing" 				| "abtest"   					|
    | "Broken Images" 			| "broken_images"   	|
		| "JavaScript Alerts"		| "javascripts_alerts"|
		| Checkboxes 						| checkboxes 				|
		| Context Menu 					| context_menu 			|
		| Challenging DOM				| challenging_dom 	|
		| Drag and drop					| drag_and_drop			|
        


@allLink    
Scenario: get all links present on homepage and verify linktext
Then get all links present on home page


