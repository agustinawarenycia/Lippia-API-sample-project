package api.model.project;

import api.model.workspace.HourlyRate;
import api.model.workspace.Membership;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class ProjectResponse {
    private String id;
    private String name;
    private HourlyRate hourlyRate;
    private String clientId;
    private String workspaceId;
    private Boolean billable;
    private List<Membership> memberships;
    private String color;
    private Estimate estimate;
    private Boolean archived;
    private String duration;
    private String clientName;
    private String note;
    private String costRate;
    private TimeEstimate timeEstimate;
    private String budgetEstimate;
    @JsonProperty("public")
    private Boolean publicc;
    private Boolean template;

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

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getWorkspaceId() {
        return workspaceId;
    }

    public void setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
    }

    public Boolean getBillable() {
        return billable;
    }

    public void setBillable(Boolean billable) {
        this.billable = billable;
    }

    public List<Membership> getMemberships() {
        return memberships;
    }

    public void setMemberships(List<Membership> memberships) {
        this.memberships = memberships;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Estimate getEstimate() {
        return estimate;
    }

    public void setEstimate(Estimate estimate) {
        this.estimate = estimate;
    }

    public Boolean getArchived() {
        return archived;
    }

    public void setArchived(Boolean archived) {
        this.archived = archived;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getCostRate() {
        return costRate;
    }

    public void setCostRate(String costRate) {
        this.costRate = costRate;
    }

    public TimeEstimate getTimeEstimate() {
        return timeEstimate;
    }

    public void setTimeEstimate(TimeEstimate timeEstimate) {
        this.timeEstimate = timeEstimate;
    }

    public String getBudgetEstimate() {
        return budgetEstimate;
    }

    public void setBudgetEstimate(String budgetEstimate) {
        this.budgetEstimate = budgetEstimate;
    }

    public Boolean getPublicc() {
        return publicc;
    }

    public void setPublicc(Boolean publicc) {
        this.publicc = publicc;
    }

    public Boolean getTemplate() {
        return template;
    }

    public void setTemplate(Boolean template) {
        this.template = template;
    }
}
