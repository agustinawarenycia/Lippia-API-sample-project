Feature: Workspace
  COMO usuario de Clockify
  QUIERO ver las configuraciones de mi Worckspace
  PARA llevar un buen control de mis horas de trabajo y el de mis empleados

 # Lippia
  #1. Consultar las horas registradas en el proyecto elegido en ítem anterior. -Listo
  # 2. Agregar horas al proyecto elegido. -Listo
 # 3. Editar la hora registrada en el ítem 2
 # 4. Consultar las horas registradas en el proyecto elegido.
 # 5. Eliminar hora registrada en el ítem 2
  @Success @Wor
  Scenario Outline: Consulta Workspace resultado exitoso
    Given Mi cuenta creada en clockify y mi X-Api-Key geneada
    When I perform a '<operation>' to '<entity>' endpoint with the '<jsonName>' and ''
    And se obtuvo el status code <status>
    Then Obtengo los datos de mi Workspace
    @Workspace
    Examples:
      | operation | entity    | jsonName     | status |
      | GET       | WORKSPACE | workspace/rq | 200    |

  @Sucess @Probar
  Scenario Outline: Consulta las horas registradas del projecto
    Given Mi cuenta creada en clockify y mi X-Api-Key geneada
    When I perform a '<operation>' to '<entity>' endpoint with the '<jsonName>' and ''
    And get status code <status>
    Then I get my times entry
    @Workspace
    Examples:
      | operation | entity                | jsonName | status |
      | GET       | WORKSPACE_TIMES_ENTRY | time/rq  | 200    |

  @Succes @Probar2

  Scenario Outline: Agrego horas al proyecto
    Given Mi cuenta creada en clockify y mi X-Api-Key geneada
    When I perform a '<operation>' to '<entity>' endpoint with the '<jsonName>' and ''
    And get status code <status>
    Then I get my times entry
    #Agregar el validator para los time entry
    @Workspace
    Examples:
      | operation | entity              | jsonName   | status |
      | POST      | WORKSPACE_ADD_TIMES | addTime/rq | 201    |


  @Sucess @Probar3
  Scenario Outline: Edito las horas en mi project
    Given Mi cuenta creada en clockify y mi X-Api-Key geneada
    When I perform a '<operation>' to '<entity>' endpoint with the '<jsonName>' and ''
    And get status code <status>
    Then I get my times entry
    @Workspace
    Examples:
      | operation | entity               | jsonName    | status |
      | PUT       | WORKSPACE_EDIT_TIMES | editTime/rq | 200    |


  @Sucess @Probar4
  Scenario Outline: Elimino las horas en mi project
    Given Mi cuenta creada en clockify y mi X-Api-Key geneada con otro id
    When I perform a '<operation>' to '<entity>' endpoint with the '<jsonName>' and ''
    And get status code <status>
    Then I get my times entry
    @Workspace
    Examples:
      | operation | entity                 | jsonName      | status |
      | DELETE    | WORKSPACE_DELETE_TIMES | deleteTime/rq | 204    |