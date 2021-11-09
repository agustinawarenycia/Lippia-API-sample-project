Feature: Workspace
  COMO usuario de Clockify
  QUIERO ver las configuraciones de mi Worckspace
  PARA llevar un buen control de mis horas de trabajo y el de mis empleados


  @Sucess @workspace
  Scenario Outline: Consulta Workspace resultado exitoso
    Given Mi cuenta creada en clockify y mi X-Api-Key generada
    When I perform a '<operation>' to '<entity>' endpoint with the '<jsonName>' and ''
    And se obtuvo el status code <status>
    Then Obtengo los datos de mi Workspace
    @Workspace
    Examples:
      | operation | entity    | jsonName     | status |
      | GET       | WORKSPACE | workspace/rq | 200    |


  @Success @project
  Scenario Outline: Consulta Projects resultado exitoso
    Given Mi cuenta creada en clockify y mi X-Api-Key geneada
    When I perform a '<operation>' to '<entity>' endpoint with the '<jsonName>' and ''
    And se obtuvo el status code <status>
    Then Obtengo los datos de mi Proyecto
    @Workspace
    Examples:
      | operation | entity         | jsonName         | status |
      | GET       | SEARCH_PROJECTS | searchProject/rq | 200    |

  @Sucess @consultahs

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

  @Succes @agregohs

  Scenario Outline: Agrego horas al proyecto
    Given Mi cuenta creada en clockify y mi X-Api-Key generada
    When I perform a 'GET' to 'WORKSPACE' endpoint with the 'workspace/rq' and ''
    And busco el workspace <nombreWorkspace>
    And send project name to search <nombreProjecto>
    When I perform a 'GET' to 'SEARCH_PROJECT' endpoint with the 'searchProjectByName/rq' and ''
    And save project ID
    And add <nameDescription>
    When I perform a '<operation>' to '<entity>' endpoint with the '<jsonName>' and ''
    And save new time entry ID
    And get status code <status>
    And my user ID
    When I perform a 'GET' to 'WORKSPACE_TIMES_ENTRY' endpoint with the 'time/rq' and ''
    Then validate time entry ID
    @Workspace
    Examples:
      | operation | entity              | jsonName   | status | nameDescription  | nombreWorkspace          | nombreProjecto |
      | POST      | WORKSPACE_ADD_TIMES | addTime/rq | 201    | time_integrador6 | INTEGRADOR_API_WORKSPACE | project        |


  @Sucess @editohs
  Scenario Outline: Edito las horas en mi project
    Given Mi cuenta creada en clockify y mi X-Api-Key generada
    When I perform a 'GET' to 'WORKSPACE' endpoint with the 'workspace/rq' and ''
    And busco el workspace <nombreWorkspace>
    And send project name to search <nombreProjecto>
    And my user ID
    When I perform a 'GET' to 'SEARCH_PROJECT' endpoint with the 'searchProjectByName/rq' and ''
    And save project ID
    When I perform a 'GET' to 'WORKSPACE_TIMES_ENTRY' endpoint with the 'time/rq' and ''
    And search with <descripcion>
    And new time entry description <NuevaDescripcion>
    When I perform a '<operation>' to '<entity>' endpoint with the '<jsonName>' and ''
    And get status code <status>
    Then confirm time entry change <NuevaDescripcion>
    @Workspace
    Examples:
      | operation | entity               | jsonName    | status | descripcion      | nombreWorkspace          | nombreProjecto | NuevaDescripcion |
      | PUT       | WORKSPACE_EDIT_TIMES | editTime/rq | 200    | time_integrador2 | INTEGRADOR_API_WORKSPACE | project        | time_integrador9 |



  @Sucess @eliminohs
  Scenario Outline: Elimino las horas en mi project
    Given Mi cuenta creada en clockify y mi X-Api-Key generada
    When I perform a 'GET' to 'WORKSPACE' endpoint with the 'workspace/rq' and ''
    And busco el workspace <nombreWorkspace>
    And send project name to search <nombreProjecto>
    And my user ID
    When I perform a 'GET' to 'SEARCH_PROJECT' endpoint with the 'searchProjectByName/rq' and ''
    And save project ID
    When I perform a 'GET' to 'WORKSPACE_TIMES_ENTRY' endpoint with the 'time/rq' and ''
    And select random time entry
    When I perform a '<operation>' to '<entity>' endpoint with the '<jsonName>' and ''
    And get status code <status>
    When I perform a 'GET' to 'WORKSPACE_TIMES_ENTRY' endpoint with the 'time/rq' and ''
    Then confirm time entry delete
    @Workspace
    Examples:
      | operation | entity                 | jsonName      | status | nombreWorkspace          | nombreProjecto |
      | DELETE    | WORKSPACE_DELETE_TIMES | deleteTime/rq | 204    | INTEGRADOR_API_WORKSPACE | project        |