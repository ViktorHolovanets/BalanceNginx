package com.example.cars_base.repositories;

import com.example.cars_base.models.Configuration;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface ConfigurationRepository extends CrudRepository<Configuration,String> {
    @Query("SELECT c FROM Configuration c WHERE c.generation.id = :generationId")
    Configuration findByGenerationId(@Param("generationId") String generationId);
}
