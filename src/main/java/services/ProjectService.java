package services;

import api.model.project.ProjectResponse;
import com.crowdar.core.PropertyManager;
import com.crowdar.api.rest.Response;
import java.util.HashMap;
import java.util.Map;


public class ProjectService extends BaseService{

    public static Response post(String jsonName) {
        return post(jsonName, ProjectResponse.class,setParams());
    }

    private static Map<String, String> setParams() {
        Map<String, String> params = new HashMap<String, String>();
        params.put("base.url", PropertyManager.getProperty("base.api.url"));
        params.put("api-key",API_KEY.get());
        params.put("workspaceId",ID_WORKSPACE.get());

        return params;
    }
}
