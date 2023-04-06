package com.example.cars_base.repositories;

import com.example.cars_base.models.Generation;
import com.example.cars_base.models.Modification;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface ModificationRepository extends CrudRepository<Modification,String> {
    @Query("SELECT c FROM Modification c WHERE c.configuration.id = :configurationId")
    Modification findByConfigurationId(@Param("configurationId") String configurationId);
}
