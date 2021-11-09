package services;

import api.model.project.ProjectResponse;
import api.model.time_entry.timeEntryResponse;
import com.crowdar.api.rest.Response;
import com.crowdar.core.PropertyManager;

import java.util.HashMap;
import java.util.Map;


public class WorkspaceAddTimeService extends BaseService{

    public static Response post(String jsonName) {
        return post(jsonName, timeEntryResponse.class,setParams());
    }

    private static Map<String, String> setParams() {
        Map<String, String> params = new HashMap<String, String>();
        params.put("base.url", PropertyManager.getProperty("base.api.url"));
        params.put("api-key",API_KEY.get());
        params.put("workspaceId",ID_WORKSPACE.get());
        params.put("projectId", PROJECT_ID.get());
        params.put("description", DESCRIPTION_TIME_ENTRY.get());
        return params;
    }
}
