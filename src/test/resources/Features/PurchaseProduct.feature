@tag
Feature: Purchase A Product
  I want to use this template for my feature file

  @tag1
  Scenario: User Search Black Shoes & Purchase It
    Given User Should Enter The Product Name Nd Click Search
    And User Select The Particular Product
    When 	User Add A Product To Cart
    And User Navigate To The Cart Page nd Confirm The Product
    Then User Purchase The Product
   