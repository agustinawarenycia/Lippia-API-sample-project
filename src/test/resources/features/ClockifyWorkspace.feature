Feature: Workspace
  COMO usuario de Clockify
  QUIERO ver las configuraciones de mi Worckspace
  PARA llevar un buen control de mis horas de trabajo y el de mis empleados


  #Pasos
  #1) Crear Feature y steps
  #2) Hacer el modelado -> src/main/java/api/model
  #3) Crear el servicio -> src/main/java/services/WorkspaceSinParametroService.java
  #4) Agregar el servicio en las configuraciones -> src/main/java/api/config/EntityConfiguration.java
  #5) Creat el json -> rq_sin_parametros.json
  #6) Controlar la ruta del jsn y el entity en los Examples
  #7) Ejecutar la prueba -> mvn -P Local "-Dcucumber.tags=@WorkspaceSinParametro" test

  @Success
  Scenario Outline: Consulta Workspace resultado exitoso sin Parametros
    #Given Mi cuenta creada en clockify y mi X-Api-Key geneada --> va directo al JSN
    When I perform a '<operation>' to '<entity>' endpoint with the '<jsonName>' and ''
    #una ves que se ejecuta este step ^ accedemos a la respuesta con APIManager.getLastResponse().getResponse()
    #Ejemplo en src/test/java/ar/validator/WorkspaceValidator.java
    And se obtuvo el status code <status>
    Then Obtengo los datos de mi Workspace
    @WorkspaceSinParametro
    Examples:
      | operation | entity                  | jsonName                    | status |
      | GET       | WORKSPACE_SIN_PARAMETRO | workspace/rq_sin_parametros | 200    |

  @Success
  Scenario Outline: Consulta Workspace resultado exitoso
    Given Mi cuenta creada en clockify y mi X-Api-Key geneada
    When I perform a '<operation>' to '<entity>' endpoint with the '<jsonName>' and ''
    And se obtuvo el status code <status>
    Then Obtengo los datos de mi Workspace
    @Workspace
    Examples:
      | operation | entity    | jsonName     | status |
      | GET       | WORKSPACE | workspace/rq | 200    |

  @Success
  Scenario Outline: Consulta Workspace resultado erroneo
    Given X-Api-Key invalido
    When I perform a '<operation>' to '<entity>' endpoint with the '<jsonName>' and ''
    And se obtuvo el status code <status>
    Then se obtuvo el response esperado en <entity> con el <jsonNameResponse>
    @Workspace
    Examples:
      | operation | entity          | jsonName     | status | jsonNameResponse |
      | GET       | WORKSPACE_ERROR | workspace/rq | 401    | workspace/401    |

