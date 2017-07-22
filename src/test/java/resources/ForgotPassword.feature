Feature: Floating Menu

Background: 
When user selects "firefox" browser
And  launches "https://the-internet.herokuapp.com/"
Then verify "https://the-internet.herokuapp.com/" is present in url

@de
Scenario: to verify all buttons
Then click on "Forgot Password"
Then verify "forgot_password" is present in url
Then enter email as "abc@xyz.com"
Then click on Retrieve Password button
Then verify "email_sent" is present in url