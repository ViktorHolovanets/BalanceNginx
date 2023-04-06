package com.example.cars_base.repositories;

import com.example.cars_base.models.*;
import com.example.cars_base.view.Responsible;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.Collection;

public interface MarkRepository extends CrudRepository<Mark,String> {
    @Query("SELECT c.id as id, c.name as name FROM Mark c")
    Collection<Responsible> findMarkAll();
    @Query("SELECT c.id as id, c.name as name FROM Model c WHERE c.mark.id = :markId")
    Collection<Responsible> findModelByMarkId(@Param("markId") String markId);

    @Query("SELECT c.id as id, c.name as name FROM Generation c WHERE c.model.id = :modelId")
    Collection<Responsible> findGenerationByModelId(@Param("modelId") String modelId);

    @Query("SELECT c.id as id, c.bodyType as name FROM Configuration c WHERE c.generation.id = :generationId")
    Collection<Responsible> findConfigurationByGenerationId(@Param("generationId") String generationId);

    @Query("SELECT c.id as id, c.groupName as name FROM Modification c WHERE c.configuration.id = :configurationId")
    Collection<Responsible> findModificationByConfigurationId(@Param("configurationId") String configurationId);
}
