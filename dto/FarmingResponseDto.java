package com.krishimitra.dto;

import com.krishimitra.model.PrimaryFarmingOption;
import java.util.List;

public class FarmingResponseDto {

    private PrimaryFarmingOption primaryOption;
    private List<OptionDto> secondaryOptions;
    private List<LoanSchemeDto> loanSchemes;

    public FarmingResponseDto() {}

    public FarmingResponseDto(
            PrimaryFarmingOption primaryOption,
            List<OptionDto> secondaryOptions,
            List<LoanSchemeDto> loanSchemes) {
        this.primaryOption = primaryOption;
        this.secondaryOptions = secondaryOptions;
        this.loanSchemes = loanSchemes;
    }

    public PrimaryFarmingOption getPrimaryOption() {
        return primaryOption;
    }

    public void setPrimaryOption(PrimaryFarmingOption primaryOption) {
        this.primaryOption = primaryOption;
    }

    public List<OptionDto> getSecondaryOptions() {
        return secondaryOptions;
    }

    public void setSecondaryOptions(List<OptionDto> secondaryOptions) {
        this.secondaryOptions = secondaryOptions;
    }

    public List<LoanSchemeDto> getLoanSchemes() {
        return loanSchemes;
    }

    public void setLoanSchemes(List<LoanSchemeDto> loanSchemes) {
        this.loanSchemes = loanSchemes;
    }
}
