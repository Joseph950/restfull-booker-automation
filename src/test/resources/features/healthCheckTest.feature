Feature: API than responds the status code 201 and create

  @first
  Scenario:  Validar código http 201 y response correcto al realizar una petición exitosa
    Given se tiene la api "healthCheck"
    When ejecuto la petición
    Then debería visualizar el status code 201
    And debería visualizar el response exitoso