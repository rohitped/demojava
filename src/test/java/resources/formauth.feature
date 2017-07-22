Feature: To verify form authentication functionality


Background: 
When user selects "firefox" browser
And  launches "https://the-internet.herokuapp.com/"
Then verify "https://the-internet.herokuapp.com/" is present in url

@fa
Scenario: Verify with correct credentials
Then click on "Form Authentication"
Then verify "login" is present in url
Then enter username as "tomsmith"
Then enter password as "SuperSecretPassword!"
Then click on login button
Then verify "secure" is present in url
Then click on logout button
Then verify "login" is present in url

@fa1
Scenario: Verify with incorrect credentials
Then click on "Form Authentication"
Then verify "login" is present in url
Then enter username as "tomsmith1"
Then enter password as "1212121212121212121212121SuperSePassword!"
Then click on login button
Then verify "login" is present in url
Then enter username as "tomsmith2"
Then enter password as "ScretPassword!"
Then click on login button
Then verify "login" is present in url
Then enter username as "tomsmith3"
Then enter password as "Susword!"
Then click on login button
Then verify "login" is present in url
Then enter username as "tomsmith4"
Then enter password as "SuperSecretPassword!"
Then click on login button
Then verify "login" is present in url
Then enter username as "tomsmith"
Then enter password as "SuperSecretPassword!"
Then click on login button
Then verify "secure" is present in url


Then click on logout button
Then verify "login" is present in url