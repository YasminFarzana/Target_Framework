Feature: signup


  @login @regression @smoke @Test
  Scenario: customer should be able to successfully signup with valid credentials
    Given customer at Target Homepage
    And customer click on Sign in link in the corner of this page
    And customer click on create an account button
    And customer enter their valid email address
    And customer enter their firstname
    And customer enter their lastname
    And customer enter their mobile number
    And customer enter their create password
    And customer click in Keep me sign in check box
    When customer click on create account
    Then customer should be able to successfully signup
