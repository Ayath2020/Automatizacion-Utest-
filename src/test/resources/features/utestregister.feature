#autor: Ayath Giraldo
  @stories
  Feature: Register Web Utest
    As a user, I want to go at Utest web page and register like a new user
  @Scenario1
  Scenario: Succesfull Register
    Given I want to register on Utest Web Page
    When I Put my dates to create my account
    Then  I validate the welcome page for new users

