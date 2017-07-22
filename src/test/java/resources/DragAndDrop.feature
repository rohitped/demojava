Feature: DragAndDrop

Background:
When user selects "firefox" browser
And  launches "https://the-internet.herokuapp.com/"
Then verify "https://the-internet.herokuapp.com/" is present in url

Scenario: to verif drag n drop
Then drag A box to B box
Then verify postion of boxes