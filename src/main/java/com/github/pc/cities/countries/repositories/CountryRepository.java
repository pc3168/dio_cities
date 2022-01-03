package com.github.pc.cities.countries.repositories;

import com.github.pc.cities.countries.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
