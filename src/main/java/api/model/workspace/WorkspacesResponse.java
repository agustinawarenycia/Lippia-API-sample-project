package api.model.workspace;

import java.util.List;

public class WorkspacesResponse {
    private String id;
    private String name;
    private HourlyRate hourlyRate;
    private List<Membership> memberships;
    private WorkspaceSettings workspaceSettings;
    private String imageUrl;
    private String featureSubscriptionType;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public HourlyRate getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(HourlyRate hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public List<Membership> getMemberships() {
        return memberships;
    }

    public void setMemberships(List<Membership> memberships) {
        this.memberships = memberships;
    }

    public WorkspaceSettings getWorkspaceSettings() {
        return workspaceSettings;
    }

    public void setWorkspaceSettings(WorkspaceSettings workspaceSettings) {
        this.workspaceSettings = workspaceSettings;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getFeatureSubscriptionType() {
        return featureSubscriptionType;
    }

    public void setFeatureSubscriptionType(String featureSubscriptionType) {
        this.featureSubscriptionType = featureSubscriptionType;
    }
}
