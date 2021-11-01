package services;

import api.model.workspace.WorkspacesResponse;
import com.crowdar.api.rest.Response;
import com.crowdar.core.PropertyManager;

import java.util.HashMap;
import java.util.Map;

public class WorkspaceSinParametroService extends BaseService {

    public static Response get(String jsonName) {
        return get(jsonName, WorkspacesResponse[].class);
    }
}
