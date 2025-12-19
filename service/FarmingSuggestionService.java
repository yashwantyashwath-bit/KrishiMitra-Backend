package com.krishimitra.service;

import com.krishimitra.dto.*;
import com.krishimitra.model.CropSuggestion;
import com.krishimitra.model.PrimaryFarmingOption;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FarmingSuggestionService {

    private final FinanceSupportService financeService;

    public FarmingSuggestionService(FinanceSupportService financeService) {
        this.financeService = financeService;
    }

    public FarmingResponseDto suggest(FarmingRequestDto req) {

        // ---- PRIMARY: AGRICULTURE WITH CROPS ----
        List<CropSuggestion> crops = new ArrayList<>();

        crops.add(new CropSuggestion(
                "Cotton",
                90,
                "Warm climate and low rainfall are suitable"
        ));

        crops.add(new CropSuggestion(
                "Rice",
                82,
                "Good rainfall and water availability"
        ));

        crops.add(new CropSuggestion(
                "Wheat",
                75,
                "Moderate temperature and loamy soil"
        ));

        PrimaryFarmingOption primary = new PrimaryFarmingOption(
                "Agriculture (Crop Farming)",
                crops
        );

        // ---- SECONDARY OPTIONS ----
        List<OptionDto> secondary = new ArrayList<>();

        secondary.add(new OptionDto(
                "Animal Husbandry",
                "SECONDARY",
                "Availability of fodder and rural suitability"
        ));

        secondary.add(new OptionDto(
                "Fisheries",
                "SECONDARY",
                "Adequate rainfall and nearby water sources"
        ));

        secondary.add(new OptionDto(
                "Poultry Farming",
                "SECONDARY",
                "Low investment and quick income"
        ));

        // ---- FINAL RESPONSE ----
        return new FarmingResponseDto(
                primary,
                secondary,
                financeService.getSchemes()
        );
    }
}
