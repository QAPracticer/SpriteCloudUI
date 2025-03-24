Feature: Saucedemo website Testcases

Scenario: Login to SauceDemo webpage with User details
  Given Login to SauceDemo URL "https://www.saucedemo.com/"
  And Enter user details "standard_user" and "secret_sauce"
  When Click on Login button
  Then Navigate to Shopping Page
  And Add two Cart
 # And Shop items to Cart
  #And Click on Cart and Choose Checkout Button
  #And Enter Customer information <Firstname> and <Lastname> and <Postcode>
  #And Validate the total price at Checkout Overview page
  #And Finish the order
