package com.krishimitra.controller;

import com.krishimitra.dto.CropRequestDto;
import com.krishimitra.service.CropRecommendationService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/crop")
@CrossOrigin
public class CropController {

    private final CropRecommendationService service;

    public CropController(CropRecommendationService service) {
        this.service = service;
    }

    @PostMapping("/recommend")
    public String recommend(@RequestBody CropRequestDto req) {
        return service.recommendCrops(req);
    }
}
