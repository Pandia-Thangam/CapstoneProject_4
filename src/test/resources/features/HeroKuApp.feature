Feature: Validate loan personalized rate feature for Zopa

  Scenario: Validating the loan form page
    Given I launch the HeroKuApp
    When I access the AB Testing page
    Then I validate the AB Testing header
    When I navigate back to Home page and access "Dropdown"
    And I select "Option 1" value from Dropdown
    Then I see "Option 1" is selected
    When I navigate back to Home page and access "Frames"
    Then I validated the expected links are present