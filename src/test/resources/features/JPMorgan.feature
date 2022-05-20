Feature: Search for jp morgon and validate the logo

  Scenario: validate J.P.Morgon logo in home page
    Given user is on Google search page
    When the search phrase 'J.P.Morgon' is entered
    And click the first result returned by google
    Then verify the J.P.Morgon logo is shown

