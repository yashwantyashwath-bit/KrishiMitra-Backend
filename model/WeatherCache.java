package com.krishimitra.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class WeatherCache {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private double lat;
    private double lon;
    private LocalDate date;
    private double rainfall;
}
