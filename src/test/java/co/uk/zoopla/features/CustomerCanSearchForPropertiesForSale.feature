Feature: Search


  Scenario Outline: User can search for a properties
    Given I navigate to Zoopla homepage
    When I enter location as "<Location>"
    And I select mininum bed as "<MinBed>"
    And I select maximum bed as "<MaxBed>"
    And I select minimum price as "<MinPrice>"
    And I select maximum price as "<MaxPrice>"
    And I choose "<Property>" as the property type
    And I click on Search button
    Then search result page is displayed
    And I can click on any of the results


    Examples: Search Test Data
      | Location              | MinBed | MaxBed | MinPrice | MaxPrice | Property   |
      | London                | 3      | 5      | £300,000 | £500,000 | Houses     |
#      | London                | 3      | 3      | £300,000 | £500,000 | Flats      |
#      | London                | 3      | 3      | £300,000 | £500,000 | Farms/land |
#      | M45 6TF               | 3      | 3      | £300,000 | £500,000 | Houses     |
#      | Manchester Piccadilly | 3      | 3      | £300,000 | £500,000 | Houses     |
