package api.model.project;

public class TimeEstimate {
    private String estimate;
    private String type;
    private String resetOption;
    private Boolean active;

    public String getEstimate() {
        return estimate;
    }

    public void setEstimate(String estimate) {
        this.estimate = estimate;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getResetOption() {
        return resetOption;
    }

    public void setResetOption(String resetOption) {
        this.resetOption = resetOption;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }
}
