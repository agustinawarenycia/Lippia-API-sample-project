package services;

import api.model.project.ProjectResponse;
import api.model.workspace.WorkspacesResponse;
import com.crowdar.api.rest.Response;
import com.crowdar.core.PropertyManager;

import java.util.HashMap;
import java.util.Map;


public class WorkspaceTimeService extends BaseService{

    public static Response get(String jsonName) {
        return get(jsonName, WorkspacesResponse[].class,setParams());
    }

    private static Map<String, String> setParams() {
        Map<String, String> params = new HashMap<String, String>();
        params.put("base.url", PropertyManager.getProperty("base.api.url"));
        params.put("api-key",API_KEY.get());
        params.put("id", ID_TIME_ENTRY.get());
        params.put("description", DESCRIPTION_TIME_ENTRY.get());
        params.put("userId", USER_ID.get());
        params.put("workspaceId",ID_WORKSPACE.get());

        return params;
    }
}
