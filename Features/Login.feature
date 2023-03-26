Feature: Login Featiure

@smkoe
Scenario: Login scenarion
 Given User launch Chrome Browser
 When  User open URL"https://admin-demo.nopcommerce.com/login"
 And   User Enter Email as "admin@yourstore.com" and password as"admin"
 And   Click on Login
 Then  Page title should be "nopCommerce administration"
 And   close browser

