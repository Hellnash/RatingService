package com.lcwd.RatingService.controllers;

import com.lcwd.RatingService.entities.Rating;
import com.lcwd.RatingService.services.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ratings")
@SuppressWarnings("unused")
public class RatingController {

    @Autowired
    RatingService ratingService;

    @PostMapping
    public ResponseEntity<Rating> createRating(@RequestBody Rating rating){
        Rating savedRating = ratingService.createRating(rating);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedRating);

    }

    @GetMapping
    public ResponseEntity<List<Rating>> getAllRatings(){
        List<Rating> allRatings = ratingService.getAllRatings();
        return ResponseEntity.status(HttpStatus.OK).body(allRatings);

    }

    @GetMapping("/hotel/{hotelId}")
    public ResponseEntity<List<Rating>> getRatingOfHotel(@PathVariable String hotelId){
        List<Rating> hotelRatings = ratingService.getAllRatingOfHotel(hotelId);
        return ResponseEntity.status(HttpStatus.OK).body(hotelRatings);

    }

    @GetMapping("/user/{userId}")
    public ResponseEntity<List<Rating>> getRatingOfUser(@PathVariable String userId){
        List<Rating> userRatings = ratingService.getAllRatingOfUser(userId);
        return ResponseEntity.status(HttpStatus.OK).body(userRatings);

    }
}
