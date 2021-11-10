@Math
Feature: Basic Mathematical Operation
  Scenario Outline: Addition
    Given '<user>' starts with <a>
    When s?he adds <b>
    Then s?he should have <total>

    Examples:
      | user | a  | b  | total |
      | Jono | 49 | 30 | 79    |
      | Ana  | 5  | 9  | 14    |
