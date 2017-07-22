Feature: ChallengingDOM

Background:
When user selects "firefox" browser
And  launches "https://the-internet.herokuapp.com/"
Then verify "https://the-internet.herokuapp.com/" is present in url

@cd
Scenario: to verify baz buttons is working
Then click on "Challenging DOM"
Then verify "challenging_dom" is present in url
Then click on baz link
Then verify "challenging_dom" is present in url 


@cd
Scenario: to verify foo buttons is working
Then click on "Challenging DOM"
Then verify "challenging_dom" is present in url
Then click on foo link
Then verify "challenging_dom" is present in url 


@cd
Scenario: to verify edit buttons is working
Then click on "Challenging DOM"
Then verify "challenging_dom" is present in url
Then click on edit link
Then verify "challenging_dom#edit" is present in url

@cd
Scenario: to verify delete buttons is working
Then click on "Challenging DOM"
Then verify "challenging_dom" is present in url
Then click on delete link
Then verify "challenging_dom#delete" is present in url

@cd
Scenario: to verify delete buttons is working
Then click on "Challenging DOM"
Then verify "challenging_dom" is present in url
Then click on delete link
Then verify "challenging_dom#dele" is present in url


