package ar.validator;

import api.model.project.ProjectResponse;
import api.model.time_entry.timeEntryResponse;
import com.crowdar.api.rest.APIManager;
import org.testng.Assert;
import services.BaseService;

public class TimeValidator {
    public static void validate() {
        //Que el array del time entry sea mayor a cero
        timeEntryResponse[] response = (timeEntryResponse[]) APIManager.getLastResponse().getResponse();
        Assert.assertTrue(response.length > 0, "No tiene horas cargadas en el proyecto elegido");
    }

    public static void validateAdd() {
        timeEntryResponse[] responses = (timeEntryResponse[]) APIManager.getLastResponse().getResponse();
        boolean flag = false;
        for (timeEntryResponse response : responses
        ) {
            if (BaseService.TIME_ID.get().equals(response.getId())) {
                flag = true;
            }
        }
        Assert.assertTrue(flag, "No se dio de alta el time entry");
    }

    public static void validateDelete() {
        timeEntryResponse[] responses = (timeEntryResponse[]) APIManager.getLastResponse().getResponse();
        boolean flag = false;
        for (timeEntryResponse response : responses
        ) {
            if (BaseService.ID_TIME_ENTRY.get().equals(response.getId())) {
                flag = true;
            }
        }
        Assert.assertFalse(flag, "No se elimino el time entry");
    }
    public static void validateChange(String descr){
        timeEntryResponse responses = (timeEntryResponse) APIManager.getLastResponse().getResponse();
        Assert.assertEquals(descr, responses.getDescription(), "No se cambio el time entry correctamente");
    }


}
