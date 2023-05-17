Feature: Manufacture Vehicles using Template Method pattern

  Scenario: Manufacture a Car
    Given a car manufacturer
    When I manufacture a car
    Then the car should have 4 wheels
    And the car should have a steering wheel

  Scenario: Manufacture a Motorcycle
    Given a motorcycle manufacturer
    When I manufacture a motorcycle
    Then the motorcycle should have 2 wheels
    And the motorcycle should not have a steering wheel
