package ar.steps;

import api.model.project.ProjectResponse;
import api.model.time_entry.timeEntryResponse;
import api.model.workspace.WorkspacesResponse;
import ar.validator.TimeValidator;
import com.crowdar.api.rest.APIManager;
import com.crowdar.core.PageSteps;
import com.google.protobuf.Api;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import services.BaseService;
import services.ProjectModificarService;


import static org.testng.Assert.assertEquals;

public class TimeEntrySteps extends PageSteps {

    @Given("Mi cuenta creada en clockify y mi X-Api-Key generada")
    public void miCuentaCreadaEnClockifyYMiXApiKeyGenerada() {
        BaseService.API_KEY.set("OTBhZWQ5NmQtOTNiMS00OTQzLTg0MGItNDhiN2FhM2I5YzM3");

    }

    @Given("Mi cuenta creada en clockify y mi X-Api-Key geneada")
    public void miCuentaCreadaEnClockifyYMiXApiKeyGeneada() {
        BaseService.API_KEY.set("OTBhZWQ5NmQtOTNiMS00OTQzLTg0MGItNDhiN2FhM2I5YzM3");
        BaseService.ID_TIME_ENTRY.set("617f6a70be50802cbbd33529");
        BaseService.DESCRIPTION_TIME_ENTRY.set("time_integrador");
        BaseService.ID_WORKSPACE.set("617f6a13e2c506460410f645");
        BaseService.USER_ID.set("615d83eddabcc04ed1eaa2d1");
        BaseService.PROJECT_ID.set("617f6a44be50802cbbd3345b");

    }

    @And("^get status code (.*)$")
    public void getStatusCodeStatus(int expStatusCode) {
        int actualStatusCode = APIManager.getLastResponse().getStatusCode();
        assertEquals(actualStatusCode, expStatusCode, "Status code are not equals.");
    }


    @Then("I get my times entry")
    public void iGetMyTimesEntry() {
        TimeValidator.validate();
    }


    @Given("Mi cuenta creada en clockify y mi X-Api-Key geneada con otro id")
    public void miCuentaCreadaEnClockifyYMiXApiKeyGeneadaConOtroId() {
        BaseService.API_KEY.set("OTBhZWQ5NmQtOTNiMS00OTQzLTg0MGItNDhiN2FhM2I5YzM3");
        BaseService.ID_TIME_ENTRY.set("618341da441e6c58a54770c6");
        BaseService.ID_WORKSPACE.set("617f6a13e2c506460410f645");
        BaseService.USER_ID.set("615d83eddabcc04ed1eaa2d1");
        BaseService.PROJECT_ID.set("617f6a44be50802cbbd3345b");
    }

    @And("add (.*)")
    public void addNameDescription(String name) {
        BaseService.DESCRIPTION_TIME_ENTRY.set(name);
    }


    @And("^busco el workspace (.*)$")
    public void buscoElWorkspaceNombreWorkspace(String nombre) {
        WorkspacesResponse[] workspaces = (WorkspacesResponse[]) APIManager.getLastResponse().getResponse();

        BaseService.ID_WORKSPACE.set("");

        for (WorkspacesResponse workspace : workspaces
        ) {

            if (workspace.getName().equals(nombre)) {
                BaseService.ID_WORKSPACE.set(workspace.getId());
            }
        }
        Assert.assertNotEquals("", BaseService.ID_WORKSPACE.get(), "No se encontró el workspace buscado");

    }


    @And("busco un project valido")
    public void buscoUnProjectNombreProjectValido() {
        BaseService.PROJECT_ID.set("617f6a44be50802cbbd3345b");
    }

    @And("my user ID")
    public void myUserID() {
        BaseService.USER_ID.set("615d83eddabcc04ed1eaa2d1");
    }


    @And("send project name to search (.*)")
    public void sendProjectNameToSearchNombreProjecto(String nombre) {
        BaseService.PROJECT_NAME.set(nombre);
    }

    @And("save project ID")
    public void saveProjectID() {
        ProjectResponse[] response = (ProjectResponse[]) APIManager.getLastResponse().getResponse();
        BaseService.PROJECT_ID.set(response[0].getId());
    }

    @Then("validate time entry ID")
    public void validateTimeEntry() {
        TimeValidator.validateAdd();

    }

    @And("save new time entry ID")
    public void saveNewTimeEntryID() {
        timeEntryResponse response = (timeEntryResponse) APIManager.getLastResponse().getResponse();
        //timeEntryResponse[] response = (timeEntryResponse[]) APIManager.getLastResponse().getResponse();
        //int e = response.length-1;
         //BaseService.TIME_ID.set(response[e].getId());
        BaseService.TIME_ID.set(response.getId());
    }

    @And("save description proyect (.*)")
    public void saveDescriptionProyectDescripcion(String name) {
        BaseService.DESCRIPTION_TIME_ENTRY.set(name);
    }

    @And("search with (.*)")
    public void searchWithDescripcion(String name) {
        timeEntryResponse[] times = (timeEntryResponse[])  APIManager.getLastResponse().getResponse();

        for (timeEntryResponse time: times
             ) {
            if(time.getDescription().equals(name)) {
                BaseService.ID_TIME_ENTRY.set(time.getId());
            }
            }
        }



    @And("new time entry description (.*)")
    public void newTimeEntryDescriptionNuevaDescripcion(String name) {
        BaseService.DESCRIPTION_TIME_ENTRY.set(name);
    }

    @Then("confirm time entry change (.*)")
    public void confirmTimeEntryChange(String name) {
        TimeValidator.validateChange(name);
    }

    @Then("confirm time entry delete")
    public void confirmTimeEntryDelete() {
        TimeValidator.validateDelete();
    }


    @And("select random time entry")
    public void selectRandomTimeEntry() {
        timeEntryResponse[] response = (timeEntryResponse[])  APIManager.getLastResponse().getResponse();
        int sizeTime = response.length;
        int num = (int) (Math.random() * sizeTime) ;
        BaseService.ID_TIME_ENTRY.set(response[num].getId());
    }
}



