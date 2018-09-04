package com.thefallenbrain.stayfithub.services.repository;

import com.thefallenbrain.stayfithub.services.domain.FitnessCenter;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FitnessCenterRepository extends JpaRepository<FitnessCenter, Integer> {
}
