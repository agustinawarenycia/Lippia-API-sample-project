package ar.steps;

import ar.validator.TimeValidator;
import com.crowdar.api.rest.APIManager;
import com.crowdar.core.PageSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.testng.Assert;
import services.BaseService;

public class TimeEntrySteps extends PageSteps {

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
       Assert.assertEquals(actualStatusCode, expStatusCode, "Status code are not equals.");
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
}
