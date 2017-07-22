Feature: Floating Menu

Background: 
When user selects "firefox" browser
And  launches "https://the-internet.herokuapp.com/"
Then verify "https://the-internet.herokuapp.com/" is present in url

@de
Scenario: to verify all buttons
Then click on "Floating Menu"
Then verify "floating_menu" is present in url
Then click on Home button
Then verify "floating_menu#home" is present in url
Then click on News button
Then verify "floating_menu#news" is present in url
Then click on Contact button
Then verify "floating_menu#contact" is present in url
Then click on About button
Then verify "floating_menu#about" is present in url