package com.krishimitra.dto;

public class LoanSchemeDto {
    private String schemeName;
    private String purpose;

    public LoanSchemeDto(String schemeName, String purpose) {
        this.schemeName = schemeName;
        this.purpose = purpose;
    }

    public String getSchemeName() { return schemeName; }
    public String getPurpose() { return purpose; }
}
