package api.config;

import services.*;

public enum EntityConfiguration {

    USER {
        @Override
        public Class<?> getEntityService() {
            return UserService.class;
        }

    },
    RESPONSE_HEADERS {
        @Override
        public Class<?> getEntityService() {
            return ResponseHeadersService.class;
        }
    },
    WORKSPACE {
        @Override
        public Class<?> getEntityService() {
            return WorkspaceService.class;
        }
    },
    WORKSPACE_SIN_PARAMETRO {
        @Override
        public Class<?> getEntityService() {
            return WorkspaceSinParametroService.class;
        }
    },
    WORKSPACE_ERROR {
        @Override
        public Class<?> getEntityService() {
            return WorkspaceErrorService.class;
        }
    },
    PROJECT {
        @Override
        public Class<?> getEntityService() {
            return ProjectService.class;
        }
    },
    PROJECT_MODIFICAR {
        @Override
        public Class<?> getEntityService() {
            return ProjectModificarService.class;
        }
    },

    WORKSPACE_TIMES_ENTRY {
        @Override
        public Class<?> getEntityService() {
            return WorkspaceTimeService.class;
        }
    },
    WORKSPACE_ADD_TIMES{
        @Override
        public Class<?> getEntityService() {
            return WorkspaceAddTimeService.class;
        }
    },
    WORKSPACE_EDIT_TIMES{
        @Override
        public Class<?> getEntityService() {
            return WorkspaceEditTimeService.class;
        }
    },
    WORKSPACE_DELETE_TIMES{
        @Override
        public Class<?> getEntityService() {
            return WorkspaceDeleteTimeService.class;
        }
    },  SEARCH_PROJECT{
        @Override
        public Class<?> getEntityService() {
            return SearchProjectService.class;
        }
    },SEARCH_PROJECTS{
        @Override
        public Class<?> getEntityService() {
            return SearchProjectsService.class;
        }
    },

    PROJECT_ERROR {
        @Override
        public Class<?> getEntityService() {
            return ProjectErrorService.class;
        }
    };

    public abstract Class<?> getEntityService();
}
