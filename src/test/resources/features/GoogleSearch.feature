@Search
Feature: Search by keyword
  Scenario Outline: Search for terms by a single keyword
    Given '<user>' is on Google search page
    When he enters '<keyword>' as keyword
    Then he should redirected to the result page for the '<keyword>' or '<alt>'
    Examples:
      | user | keyword | alt    |
      | Aun  | Panda   | panda  |
      | Aun  | Almond  | almond |
