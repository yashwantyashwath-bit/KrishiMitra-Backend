package com.krishimitra.controller;

import com.krishimitra.dto.FarmingRequestDto;
import com.krishimitra.dto.FarmingResponseDto;
import com.krishimitra.service.FarmingSuggestionService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/farming")
@CrossOrigin
public class FarmingSuggestionController {

    private final FarmingSuggestionService service;

    public FarmingSuggestionController(FarmingSuggestionService service) {
        this.service = service;
    }

    @PostMapping("/suggest")
    public FarmingResponseDto suggest(@RequestBody FarmingRequestDto req) {
        return service.suggest(req);
    }
}
