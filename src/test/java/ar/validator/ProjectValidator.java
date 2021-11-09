package ar.validator;

import api.model.project.ProjectResponse;
import api.model.workspace.WorkspacesResponse;
import com.crowdar.api.rest.APIManager;
import org.testng.Assert;

public class ProjectValidator {
    public static void validate(String name){
        ProjectResponse response = (ProjectResponse) APIManager.getLastResponse().getResponse();
        Assert.assertEquals(name,response.getName(),"Nombre de proyecnto no coincide");
    }
    public static void validateSearch(){
        ProjectResponse[] response = (ProjectResponse[]) APIManager.getLastResponse().getResponse();
        Assert.assertTrue(response.length > 0, "No tiene proyectos cargados");
    }
}
