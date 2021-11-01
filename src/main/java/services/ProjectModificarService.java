package services;

import api.model.project.ProjectResponse;
import com.crowdar.api.rest.Response;
import com.crowdar.core.PropertyManager;

import java.util.HashMap;
import java.util.Map;


public class ProjectModificarService extends BaseService{

    public static final ThreadLocal<String> ID_P = new ThreadLocal<String>();

    public static Response put(String jsonName) {
        return put(jsonName, ProjectResponse.class,setParams());
    }

    private static Map<String, String> setParams() {
        Map<String, String> params = new HashMap<String, String>();

        return params;
    }
}
