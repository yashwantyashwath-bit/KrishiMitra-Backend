package com.krishimitra.dto;

public class OptionDto {
    private String name;
    private String priority;
    private String reason;

    public OptionDto(String name, String priority, String reason) {
        this.name = name;
        this.priority = priority;
        this.reason = reason;
    }

    public String getName() { return name; }
    public String getPriority() { return priority; }
    public String getReason() { return reason; }
}
