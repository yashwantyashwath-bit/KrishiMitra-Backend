package com.krishimitra.service;

import com.krishimitra.dto.CropRequestDto;
import org.springframework.stereotype.Service;

@Service
public class CropRecommendationService {

    public String recommendCrops(CropRequestDto req) {
        return "Recommended crops based on soil type: " + req.getSoilType();
    }
}
