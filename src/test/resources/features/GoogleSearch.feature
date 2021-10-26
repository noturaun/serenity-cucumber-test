Feature: Search by keyword
  Scenario: Search for terms by a single keyword
    Given Aun is on Google search page
    When he enters "Panda" as keyword
    Then he should redirected to the result page for the "Panda" or "panda"
