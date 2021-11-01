Feature: Projects
  COMO usuario de Clockify
  QUIERO crear proyectos en mi Worckspace
  PARA llevar un buen control de mis horas de trabajo y el de mis empleados

  @Success
  Scenario Outline: Crear project en Workspace resultado exitoso
    Given Mi cuenta creada en clockify y mi X-Api-Key geneada
    And un id workspace valido
    And un nombre de proyecto <name>
    When I perform a '<operation>' to '<entity>' endpoint with the '<jsonName>' and ''
    And se obtuvo el status code <status>
    Then Obtengo los datos de mi Proyecto <name>
    @Project
    Examples:
      | operation | entity  | name      | jsonName    | status |
      | POST      | PROJECT | Academy15 | projects/rq | 201    |

  @Success
  Scenario Outline: Crear project en Workspace - Proyecto repetido
    Given Mi cuenta creada en clockify y mi X-Api-Key geneada
    And un id workspace valido
    And un nombre de proyecto <name>
    When I perform a '<operation>' to '<entity>' endpoint with the '<jsonName>' and ''
    And se obtuvo el status code <status>
    Then se obtuvo el response esperado en <entity> con el <jsonNameResponse> y sus parametros <projectName>
    @Project
    Examples:
      | operation | entity        | jsonName    | status | jsonNameResponse          | name      | projectName    |
      | POST      | PROJECT_ERROR | projects/rq | 400    | project/projectDuplicated | Academy15 | name:Academy15 |

  Scenario Outline: Crear project en Workspace resultado exitoso
    Given Mi cuenta creada en clockify y mi X-Api-Key geneada
    And un id workspace valido
    And un nombre de proyecto Academi46
    When I perform a 'POST' to 'PROJECT' endpoint with the 'projects/rq' and ''
    And guardo el id del proyecto
    And un nombre de proyecto <name>
    When I perform a '<operation>' to '<entity>' endpoint with the '<jsonName>' and ''
    And se obtuvo el status code <status>
    #Then Obtengo los datos de mi Proyecto <name>
    @ProjectModificar
    Examples:
      | operation | entity            | name      | jsonName       | status |
      | PUT       | PROJECT_MODIFICAR | Academy47 | projectsMod/rq | 200    |