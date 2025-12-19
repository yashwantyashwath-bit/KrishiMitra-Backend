package com.krishimitra.model;

public class CropSuggestion {

    private String crop;
    private int score;
    private String reason;

    public CropSuggestion() {}

    public CropSuggestion(String crop, int score, String reason) {
        this.crop = crop;
        this.score = score;
        this.reason = reason;
    }

    public String getCrop() {
        return crop;
    }

    public void setCrop(String crop) {
        this.crop = crop;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }
}
