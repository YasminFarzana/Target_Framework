Feature:login
  Background:
    Given customer at Target Homepage
    And customer click on Sign in link in the corner of this page

  Scenario: customer able to login successfully in this account
    And customer click on sign in button
    And customer enter their valid email address
    And customer enter their create password
    When customer click on Sign in with password
    And customer click maybe later button
    Then customer should be able to successfully login