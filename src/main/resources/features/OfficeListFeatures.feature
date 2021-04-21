Feature: EPAM Offices listings

  Scenario Outline: Check the list of offices
    Given I am on EPAM Our Office page
    When I press on "<country>"
    Then the list of offices in "<country>" should be opened

    Examples: Countries
      | country |
      | Canada  |
      | Mexico  |