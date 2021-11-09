package ar.validator;

import api.model.time_entry.timeEntryResponse;
import com.crowdar.api.rest.APIManager;
import org.testng.Assert;

public class TimeValidator {
    public static void validate(){
        //Que el array del time entry sea mayor a cero
        timeEntryResponse[] response = (timeEntryResponse[]) APIManager.getLastResponse().getResponse();
        Assert.assertTrue(response.length>0, "No tiene horas cargadas en el proyecto elegido");
    }
}
