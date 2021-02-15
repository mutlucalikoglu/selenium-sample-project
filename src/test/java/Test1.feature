Feature: Digiturk Case Study

  Scenario: Bein Sports Connect Australia Subscription Test Case


    Given Navigate to bein sports
    And Click Subscribe button
    And Register to One Month Package
    Then Validate package price
    Given Fill Create Account form with a random email
    And Make Payment with Credit Card
    Then Expect for a total charge of
    Given Provide a test card data and confirm payment(Do not enter a real card data)
    Then Expect for a error text and finish test with success





