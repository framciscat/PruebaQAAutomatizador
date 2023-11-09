
@tag
Feature: Get data from the source code of 'Banco Central'

  @tag1
  Scenario: Positive test getting data from Banco Central web page
    Given The browser is open
    When I type the url of Banco Central web page
   	And I get data from h1 tags 
    And I get data from p tags
    And I get site title from main page
    Then I can see the currency values of main page
