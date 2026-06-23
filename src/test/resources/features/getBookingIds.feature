Feature: Validate GetBookingIds API

  @first
  Scenario: Validate status code http 200
    Given the api is "getBookingIds"
    When execute the get request
    Then should visualize status code 200