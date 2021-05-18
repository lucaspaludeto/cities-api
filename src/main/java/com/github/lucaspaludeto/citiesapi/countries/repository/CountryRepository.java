package com.github.lucaspaludeto.citiesapi.countries.repository;

import com.github.lucaspaludeto.citiesapi.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
