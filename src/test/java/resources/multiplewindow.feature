Feature: Multiple windows

Background: 
When user selects "firefox" browser
And  launches "https://the-internet.herokuapp.com/"
Then verify "https://the-internet.herokuapp.com/" is present in url

@mw
Scenario: Switch to another window
Then click on "Multiple Windows"
Then verify "windows" is present in url
And click on click here link
Then switch to another window
Then verify "windows/new" is present in url
Then switch to another window
Then verify "windows" is present in url

