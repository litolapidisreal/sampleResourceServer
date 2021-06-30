package com.sampleAuth.resource.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200")
@Slf4j
public class ProductQueryController {

    @GetMapping("/sampler/{id}")
    public ResponseEntity<?> createSampleData(@PathVariable("id") Integer id) {
        return ResponseEntity.ok("Success");
    }


}