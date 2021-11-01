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
    PROJECT_ERROR {
        @Override
        public Class<?> getEntityService() {
            return ProjectErrorService.class;
        }
    };

    public abstract Class<?> getEntityService();
}
