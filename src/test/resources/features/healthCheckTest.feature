Feature: API than responds the status code 201 and create

  @smokeTest @healtCheck
  Scenario:  Validate status code http 201 and response Created
    Given the api is "healthCheck"
    When execute the get request
    Then should visualize status code 201
    And should visualize correct response

  @smokeTest
  Scenario: Validate status code http 200 in REST Assured getBookingIds
    Given the api is "getBookingIds"
    When execute the get request
    Then should visualize status code 200
    And should visualize response not empty

  @smokeTest
  Scenario: Validate status code http 200 in create token
    Given the api is "createToken"
    When execute the POST request
    Then should visualize status code 200
    #And should visualize correct response

  @prueba
   Scenario: Validate status code http 200 in create booking
     Given the api POST is "createBooking"
     When execute the POST request
     Then should visualize status code 200
     And should visualize correct response