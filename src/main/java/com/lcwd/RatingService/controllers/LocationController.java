package com.lcwd.RatingService.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/locations")
@SuppressWarnings("unused")
public class LocationController
{

    @GetMapping
    public ResponseEntity<List<String>> getAllLocations(){
        return new ResponseEntity<>(List.of("mumbai","delhi","kolkata"), HttpStatus.OK);
    }
}
