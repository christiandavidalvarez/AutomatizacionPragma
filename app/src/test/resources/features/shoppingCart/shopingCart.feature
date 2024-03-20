Feature: Shopping cart operations

@addToCart
  Scenario Outline: Add to cart a item
    Given Sergey is Searching a product in <page_section> 
    When he add to first item in cart
    Then he see this item in cart
    Examples:
        | page_section |
        | phones_page |
        | laptop_page |
        | monitors_page |
    

  @removeItem
  Scenario: Remove to item in cart
    Given Sergey have products in the shopping cart
    When he remove a product in cart
    Then that product that removed

  @shop
  Scenario: Shoping a item in shoping cart
    Given Sergey have products in the shopping cart
    When he confirm products in the shopping cart
    Then he is notified that he has made the purchase