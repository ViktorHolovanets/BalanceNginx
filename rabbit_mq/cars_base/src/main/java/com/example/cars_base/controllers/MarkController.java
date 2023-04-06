package com.example.cars_base.controllers;

import com.example.cars_base.lib.SeedDataBase;
import com.example.cars_base.repositories.MarkRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/java")
public class MarkController {
    final MarkRepository repository;

    public MarkController(MarkRepository repository) {
        this.repository = repository;
    }
     @PostMapping("/")
     public String  testPost() {
        return  "TestHome post";
     }
     @GetMapping("/")
     public String  testGet() {
        return "TestHome get";
     }

    @PostMapping("/marks")
    public ResponseEntity  getMarkAll() {
        var mark=this.repository.findMarkAll();
        return new ResponseEntity<>(mark, HttpStatus.OK);
    }
    @PostMapping("/models")
    public ResponseEntity  getModel(String markId) {
        var model=this.repository.findModelByMarkId(markId);
        return new ResponseEntity<>(model, HttpStatus.OK);
    }
    @PostMapping("/generations")
    public ResponseEntity  getGeneration(String modelId) {
        var model=this.repository.findGenerationByModelId(modelId);
        return new ResponseEntity<>(model, HttpStatus.OK);
    }
    @PostMapping("/configurations")
    public ResponseEntity  getConfiguration(String generationId) {
        var model=this.repository.findConfigurationByGenerationId(generationId);
        return new ResponseEntity<>(model, HttpStatus.OK);
    }
    @PostMapping("/modifications")
    public ResponseEntity  getModification(String configurationId)
    {
        var model=this.repository.findModificationByConfigurationId(configurationId);
        return new ResponseEntity<>(model, HttpStatus.OK);
    }
}
