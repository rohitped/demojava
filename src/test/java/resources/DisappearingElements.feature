Feature: Disappearing Elements

Background: 
When user selects "firefox" browser
And  launches "https://the-internet.herokuapp.com/"
Then verify "https://the-internet.herokuapp.com/" is present in url

@de
Scenario: to verify all buttons
Then click on "Disappearing Elements"
Then verify "disappearing_elements" is present in url
Then click on Home link
Then verify "https://the-internet.herokuapp.com/" is present in url
Then click on "Disappearing Elements"
Then verify "disappearing_elements" is present in url
Then click on About link
Then verify "about" is present in url

# to ask how to go back from one link.

#Then click on ContactUS link
#Then verify "contact-us" is present in url
#Then click on PortFolio link
#Then verify "portfolio" is present in url
#Then click on Gallery link
#Then verify "gallery" is present in url