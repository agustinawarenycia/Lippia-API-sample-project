package ar.validator;

import api.model.workspace.WorkspacesResponse;
import com.crowdar.api.rest.APIManager;
import org.testng.Assert;

public class WorkspaceValidator {
        public static void validate(){
            //Realizamos las validaciones correspondientes
            WorkspacesResponse[] response = (WorkspacesResponse[]) APIManager.getLastResponse().getResponse();
            for (WorkspacesResponse Work: response) {
                String id = Work.getId();
                Assert.assertNotNull(id,"El campo ID es nulo");
            }
        }
}
