package com.krishimitra.model;

import java.util.List;

public class PrimaryFarmingOption {

    private String category; // Agriculture
    private List<CropSuggestion> recommendedCrops;

    public PrimaryFarmingOption() {}

    public PrimaryFarmingOption(String category, List<CropSuggestion> recommendedCrops) {
        this.category = category;
        this.recommendedCrops = recommendedCrops;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public List<CropSuggestion> getRecommendedCrops() {
        return recommendedCrops;
    }

    public void setRecommendedCrops(List<CropSuggestion> recommendedCrops) {
        this.recommendedCrops = recommendedCrops;
    }
}
