Feature: API than responds the status code 201 and create

  Scenario: Validate than the health check test api responds successfully
    When I have the api healthCheck
    Then i must visualize the correct response
    #Then I must visualize the status code 201

  Scenario: Validar response al realizar una petición exitosa
    Dado que tengo la api "API" con el recurso "/recurso" #Aquí se arma la url de la api
    Cuando yo ejecuto la petición #Aquí se ejecuta la petición y se guardan los valores de status code y response
    Entonces yo debería visualizar el status code 201 #Aquí se valida el status code
    Y el response correcto de la api "API" #Aquí se valida el response

  @first
  Scenario:  Validar código http 201 y response correcto al realizar una petición exitosa
    Given se tiene la api "https://restful-booker.herokuapp.com/ping"
    When ejecuto la petición
    Then debería visualizar el status code 202
    And debería visualizar el response exitoso