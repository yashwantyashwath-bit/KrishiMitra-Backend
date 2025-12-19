package com.krishimitra.repository;

import com.krishimitra.model.WeatherCache;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WeatherCacheRepository extends JpaRepository<WeatherCache, Long> {}
