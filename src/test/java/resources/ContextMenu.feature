Feature: ContextMenu

Background:
When user selects "firefox" browser
And  launches "https://the-internet.herokuapp.com/"
Then verify "https://the-internet.herokuapp.com/" is present in url

@cm
Scenario: to verify  buttons is working
Then click on "Context Menu"
Then verify "context_menu" is present in url
Then click on this open issue link
#Then switch to another window
Then verify "https://github.com/tourdedave/the-internet/issues/12" is present in url

@cm
Scenario: to verify  buttons is working
Then click on "Context Menu"
Then verify "context_menu" is present in url
Then click on Elemental Selenium link
Then switch to another window
Then verify "http://elementalselenium.com/" is present in url

