Feature: checkout
  Scenario: customer add a item in the cart then they are able checkout
    Given customer at Target Homepage
    And customer type backpack in search edit box
    And customer click on search symbol
    And customer able to see list of backpack in search result page
    And customer click on pink backpack item
    And customer add the item to cart
    And Customer click on view cart
    And Customer click on procude to check out
    When Customer click on continue checkout
    Then customer successfully complete the payment


