Feature: Api example
  As an api user I want to execute request in order to get proper responses

  @Example @Success
  Scenario Outline: Example scenario for get user data
    When I perform a '<operation>' to '<entity>' endpoint with the '<jsonName>' and ''
    Then status code <statusCode> is obtained
    And expected response is obtained in '<entity>' with '<expectedResponse>'

    Examples:
      | jsonName    | statusCode | operation | entity   | expectedResponse   |
      | exampleJson | 200        | GET       | USER     | users              |
