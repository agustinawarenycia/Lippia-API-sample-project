package api.model.time_entry;

public class timeEntryResponse {
    private String id;
    private String description;
    private Boolean tagIds;
    private String userId;
    private String billable;
    private Boolean taskId;
    private Boolean projectId;
    private timeInterval timeInterval;
    private String workspaceId;
    private Boolean isLocked;
    private  String customFieldValues;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getTagIds() {
        return tagIds;
    }

    public void setTagIds(Boolean tagIds) {
        this.tagIds = tagIds;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getBillable() {
        return billable;
    }

    public void setBillable(String billable) {
        this.billable = billable;
    }

    public Boolean getTaskId() {
        return taskId;
    }

    public void setTaskId(Boolean taskId) {
        this.taskId = taskId;
    }

    public Boolean getProjectId() {
        return projectId;
    }

    public void setProjectId(Boolean projectId) {
        this.projectId = projectId;
    }

    public api.model.time_entry.timeInterval getTimeInterval() {
        return timeInterval;
    }

    public void setTimeInterval(api.model.time_entry.timeInterval timeInterval) {
        this.timeInterval = timeInterval;
    }

    public String getWorkspaceId() {
        return workspaceId;
    }

    public void setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
    }

    public Boolean getLocked() {
        return isLocked;
    }

    public void setLocked(Boolean locked) {
        isLocked = locked;
    }

    public String getCustomFieldValues() {
        return customFieldValues;
    }

    public void setCustomFieldValues(String customFieldValues) {
        this.customFieldValues = customFieldValues;
    }
}
