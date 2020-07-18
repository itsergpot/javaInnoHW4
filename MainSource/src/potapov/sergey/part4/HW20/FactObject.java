package potapov.sergey.part4.HW20;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class FactObject {

    @JsonProperty("used")
    private boolean used;

    @JsonProperty("source")
    private String source;

    @JsonProperty("type")
    private String type;

    @JsonProperty("deleted")
    private boolean deleted;

    @JsonProperty("_id")
    private String id;

    @JsonProperty("__v")
    private String version;

    @JsonProperty("text")
    private String text;

    @JsonProperty("updatedAt")
    private String updatedAt;

    @JsonProperty("createdAt")
    private String createdAt;

    @JsonProperty("status")
    private FactObjectStatus status;

    @JsonProperty("user")
    private String user;

    public FactObjectStatus getStatus() {
        return status;
    }

    public void setStatus(FactObjectStatus status) {
        this.status = status;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public boolean isUsed() {
        return used;
    }

    public void setUsed(boolean used) {
        this.used = used;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "FactObject{" +
                "used=" + used +
                ", source='" + source + '\'' +
                ", type='" + type + '\'' +
                ", deleted=" + deleted +
                ", id='" + id + '\'' +
                ", version='" + version + '\'' +
                ", text='" + text + '\'' +
                ", updatedAt='" + updatedAt + '\'' +
                ", createdAt='" + createdAt + '\'' +
                ", status=" + status +
                ", user='" + user + '\'' +
                '}';
    }
}
