package potapov.sergey.part4.HW20;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FactObjectStatus {

    @JsonProperty("verified")
    private boolean verified;
    @JsonProperty("sentCount")
    private long sentCount;

    public boolean isVerified() {
        return verified;
    }

    public void setVerified(boolean verified) {
        this.verified = verified;
    }

    public long getSentCount() {
        return sentCount;
    }

    public void setSentCount(long sentCount) {
        this.sentCount = sentCount;
    }

    @Override
    public String toString() {
        return "FactObjectSource{" +
                "verified=" + verified +
                ", sentCount=" + sentCount +
                '}';
    }
}
