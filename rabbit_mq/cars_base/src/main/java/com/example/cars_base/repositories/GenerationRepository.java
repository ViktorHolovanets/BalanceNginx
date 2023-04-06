package com.example.cars_base.repositories;

import com.example.cars_base.models.Generation;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface GenerationRepository extends CrudRepository<Generation,String> {
    @Query("SELECT c FROM Generation c WHERE c.model.id = :modelId")
    Generation findByMModelId(@Param("modelId") String modelId);
}
