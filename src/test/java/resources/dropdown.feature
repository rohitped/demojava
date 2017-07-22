Feature: DropDown

Background: 
When user selects "firefox" browser
And  launches "https://the-internet.herokuapp.com/"
Then verify "https://the-internet.herokuapp.com/" is present in url

@dd
Scenario: select by index
Then click on "Dropdown"
Then select value by "index" with "1"

@dd
Scenario: select by value
Then click on "Dropdown"
Then select value by "value" with "2"

@dd
Scenario: select by text
Then click on "Dropdown"
Then select value by "text" with "Option 1"