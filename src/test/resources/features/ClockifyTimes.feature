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

  Scenario Outline: Consulta Workspace resultado exitoso
    Given Mi cuenta creada en clockify y mi X-Api-Key generada
    When I perform a '<operation>' to '<entity>' endpoint with the '<jsonName>' and ''
    And se obtuvo el status code <status>
    Then Obtengo los datos de mi Workspace
    @Workspace
    Examples:
      | operation | entity    | jsonName     | status |
      | GET       | WORKSPACE | workspace/rq | 200    |


  @Success @Wor3
  Scenario Outline: Consulta Projects resultado exitoso
    Given Mi cuenta creada en clockify y mi X-Api-Key geneada
    When I perform a '<operation>' to '<entity>' endpoint with the '<jsonName>' and ''
    And se obtuvo el status code <status>
   # Then Obtengo los datos de mi Proyecto
    @Workspace
    Examples:
      | operation | entity         | jsonName         | status |
      | GET       | SEARCH_PROJECT | searchProject/rq | 200    |

  @Sucess @Probar
    #Ver como pasar por parametros el id del proyecto
    #workspaceID userID
  Scenario Outline: Consulta las horas registradas del projecto
    Given Mi cuenta creada en clockify y mi X-Api-Key generada
    When I perform a 'GET' to 'WORKSPACE' endpoint with the 'workspace/rq' and ''
    And busco el workspace <nombreWorkspace>
    And my user ID
    When I perform a '<operation>' to '<entity>' endpoint with the '<jsonName>' and ''
    And get status code <status>
    Then I get my times entry
    @Workspace
    Examples:
      | operation | entity                | jsonName | status | nombreWorkspace          |
      | GET       | WORKSPACE_TIMES_ENTRY | time/rq  | 200    | INTEGRADOR_API_WORKSPACE |

  @Succes @Probar2
  Scenario Outline: Agrego horas al proyecto
    Given Mi cuenta creada en clockify y mi X-Api-Key generada
    When I perform a 'GET' to 'WORKSPACE' endpoint with the 'workspace/rq' and ''
    And busco el workspace <nombreWorkspace>
    And send project name to search <nombreProjecto>
    When I perform a 'GET' to 'SEARCH_PROJECT' endpoint with the 'searchProject/rq' and ''
    #And search project with <nombreProjecto>
    When I perform a '<operation>' to '<entity>' endpoint with the '<jsonName>' and ''
    And add <name description>
    And get status code <status>
    #Then I get my times entry
    #Agregar el validator para los time entry
    @Workspace
    Examples:
      | operation | entity              | jsonName   | status | name description | nombreWorkspace          | nombreProjecto |
      | POST      | WORKSPACE_ADD_TIMES | addTime/rq | 201    | time_integrador1 | INTEGRADOR_API_WORKSPACE | project        |


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


#Desde el feature le mando la descripcion y desp comparo la descripcion y que me traiga su id, para desp eliminar
#En el mismo escenario creo el time entry y desp lo borro
#And obtengo el id
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