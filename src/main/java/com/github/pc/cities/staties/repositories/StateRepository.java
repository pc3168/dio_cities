package com.github.pc.cities.staties.repositories;

import com.github.pc.cities.staties.entities.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}
