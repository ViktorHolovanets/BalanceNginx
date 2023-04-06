package com.example.cars_base.repositories;

import com.example.cars_base.models.Model;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface ModelRepository extends CrudRepository<Model,String> {
    @Query("SELECT c.id as id, c.name as name FROM Model c WHERE c.mark.id = :markId")
    Model findByMarkId(@Param("markId") String markId);
}
