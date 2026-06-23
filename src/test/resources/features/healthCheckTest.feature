Feature: API than responds the status code 201 and create

  @first
  Scenario:  Validate status code http 201 and response Created
    Given the api is "healthCheck"
    When execute the get request
    Then should visualize status code 201
    And should visualize correct response

  @first
  Scenario: Validate status code http 200
    Given the api is "getBookingIds"
    When execute the get request
    Then should visualize status code 200
    And should visualize response not empty