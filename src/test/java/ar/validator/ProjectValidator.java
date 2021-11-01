package ar.validator;

import api.model.project.ProjectResponse;
import com.crowdar.api.rest.APIManager;
import org.testng.Assert;

public class ProjectValidator {
    public static void validate(String name){
        ProjectResponse response = (ProjectResponse) APIManager.getLastResponse().getResponse();
        Assert.assertEquals(name,response.getName(),"Nombre de proyecnto no coincide");
    }
}
