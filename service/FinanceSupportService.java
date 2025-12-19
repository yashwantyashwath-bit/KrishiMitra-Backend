package com.krishimitra.service;

import com.krishimitra.dto.LoanSchemeDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FinanceSupportService {

    public List<LoanSchemeDto> getSchemes() {
        return List.of(
            new LoanSchemeDto("Kisan Credit Card", "Crop loans at low interest"),
            new LoanSchemeDto("PM Fasal Bima Yojana", "Crop insurance"),
            new LoanSchemeDto("National Livestock Mission", "Animal husbandry subsidy"),
            new LoanSchemeDto("PM Matsya Sampada Yojana", "Fisheries support"),
            new LoanSchemeDto("PM Mudra Yojana", "Small farming business loan")
        );
    }
}
