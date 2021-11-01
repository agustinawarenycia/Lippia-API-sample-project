package api.model.workspace;

import java.util.List;

public class WorkspaceSettings {
    private Boolean timeRoundingInReports;
    private Boolean onlyAdminsSeeBillableRates;
    private Boolean onlyAdminsCreateProject;
    private Boolean onlyAdminsSeeDashboard;
    private Boolean defaultBillableProjects;
    private Boolean lockTimeEntries;
    private Round round;
    private Boolean projectFavorites;
    private Boolean canSeeTimeSheet;
    private Boolean canSeeTracker;
    private Boolean projectPickerSpecialFilter;
    private Boolean forceProjects;
    private Boolean forceTasks;
    private Boolean forceTags;
    private Boolean forceDescription;
    private Boolean onlyAdminsSeeAllTimeEntries;
    private Boolean onlyAdminsSeePublicProjectsEntries;
    private Boolean trackTimeDownToSecond;
    private String projectGroupingLabel;
    private List<String> adminOnlyPages;
    private String automaticLock;
    private String onlyAdminsCreateTag;
    private String onlyAdminsCreateTask;
    private String timeTrackingMode;
    private Boolean isProjectPublicByDefault;

    public Boolean getTimeRoundingInReports() {
        return timeRoundingInReports;
    }

    public void setTimeRoundingInReports(Boolean timeRoundingInReports) {
        this.timeRoundingInReports = timeRoundingInReports;
    }

    public Boolean getOnlyAdminsSeeBillableRates() {
        return onlyAdminsSeeBillableRates;
    }

    public void setOnlyAdminsSeeBillableRates(Boolean onlyAdminsSeeBillableRates) {
        this.onlyAdminsSeeBillableRates = onlyAdminsSeeBillableRates;
    }

    public Boolean getOnlyAdminsCreateProject() {
        return onlyAdminsCreateProject;
    }

    public void setOnlyAdminsCreateProject(Boolean onlyAdminsCreateProject) {
        this.onlyAdminsCreateProject = onlyAdminsCreateProject;
    }

    public Boolean getOnlyAdminsSeeDashboard() {
        return onlyAdminsSeeDashboard;
    }

    public void setOnlyAdminsSeeDashboard(Boolean onlyAdminsSeeDashboard) {
        this.onlyAdminsSeeDashboard = onlyAdminsSeeDashboard;
    }

    public Boolean getDefaultBillableProjects() {
        return defaultBillableProjects;
    }

    public void setDefaultBillableProjects(Boolean defaultBillableProjects) {
        this.defaultBillableProjects = defaultBillableProjects;
    }

    public Boolean getLockTimeEntries() {
        return lockTimeEntries;
    }

    public void setLockTimeEntries(Boolean lockTimeEntries) {
        this.lockTimeEntries = lockTimeEntries;
    }

    public Round getRound() {
        return round;
    }

    public void setRound(Round round) {
        this.round = round;
    }

    public Boolean getProjectFavorites() {
        return projectFavorites;
    }

    public void setProjectFavorites(Boolean projectFavorites) {
        this.projectFavorites = projectFavorites;
    }

    public Boolean getCanSeeTimeSheet() {
        return canSeeTimeSheet;
    }

    public void setCanSeeTimeSheet(Boolean canSeeTimeSheet) {
        this.canSeeTimeSheet = canSeeTimeSheet;
    }

    public Boolean getCanSeeTracker() {
        return canSeeTracker;
    }

    public void setCanSeeTracker(Boolean canSeeTracker) {
        this.canSeeTracker = canSeeTracker;
    }

    public Boolean getProjectPickerSpecialFilter() {
        return projectPickerSpecialFilter;
    }

    public void setProjectPickerSpecialFilter(Boolean projectPickerSpecialFilter) {
        this.projectPickerSpecialFilter = projectPickerSpecialFilter;
    }

    public Boolean getForceProjects() {
        return forceProjects;
    }

    public void setForceProjects(Boolean forceProjects) {
        this.forceProjects = forceProjects;
    }

    public Boolean getForceTasks() {
        return forceTasks;
    }

    public void setForceTasks(Boolean forceTasks) {
        this.forceTasks = forceTasks;
    }

    public Boolean getForceTags() {
        return forceTags;
    }

    public void setForceTags(Boolean forceTags) {
        this.forceTags = forceTags;
    }

    public Boolean getForceDescription() {
        return forceDescription;
    }

    public void setForceDescription(Boolean forceDescription) {
        this.forceDescription = forceDescription;
    }

    public Boolean getOnlyAdminsSeeAllTimeEntries() {
        return onlyAdminsSeeAllTimeEntries;
    }

    public void setOnlyAdminsSeeAllTimeEntries(Boolean onlyAdminsSeeAllTimeEntries) {
        this.onlyAdminsSeeAllTimeEntries = onlyAdminsSeeAllTimeEntries;
    }

    public Boolean getOnlyAdminsSeePublicProjectsEntries() {
        return onlyAdminsSeePublicProjectsEntries;
    }

    public void setOnlyAdminsSeePublicProjectsEntries(Boolean onlyAdminsSeePublicProjectsEntries) {
        this.onlyAdminsSeePublicProjectsEntries = onlyAdminsSeePublicProjectsEntries;
    }

    public Boolean getTrackTimeDownToSecond() {
        return trackTimeDownToSecond;
    }

    public void setTrackTimeDownToSecond(Boolean trackTimeDownToSecond) {
        this.trackTimeDownToSecond = trackTimeDownToSecond;
    }

    public String getProjectGroupingLabel() {
        return projectGroupingLabel;
    }

    public void setProjectGroupingLabel(String projectGroupingLabel) {
        this.projectGroupingLabel = projectGroupingLabel;
    }

    public List<String> getAdminOnlyPages() {
        return adminOnlyPages;
    }

    public void setAdminOnlyPages(List<String> adminOnlyPages) {
        this.adminOnlyPages = adminOnlyPages;
    }

    public String getAutomaticLock() {
        return automaticLock;
    }

    public void setAutomaticLock(String automaticLock) {
        this.automaticLock = automaticLock;
    }

    public String getOnlyAdminsCreateTag() {
        return onlyAdminsCreateTag;
    }

    public void setOnlyAdminsCreateTag(String onlyAdminsCreateTag) {
        this.onlyAdminsCreateTag = onlyAdminsCreateTag;
    }

    public String getOnlyAdminsCreateTask() {
        return onlyAdminsCreateTask;
    }

    public void setOnlyAdminsCreateTask(String onlyAdminsCreateTask) {
        this.onlyAdminsCreateTask = onlyAdminsCreateTask;
    }

    public String getTimeTrackingMode() {
        return timeTrackingMode;
    }

    public void setTimeTrackingMode(String timeTrackingMode) {
        this.timeTrackingMode = timeTrackingMode;
    }

    public Boolean getProjectPublicByDefault() {
        return isProjectPublicByDefault;
    }

    public void setProjectPublicByDefault(Boolean projectPublicByDefault) {
        isProjectPublicByDefault = projectPublicByDefault;
    }
}
