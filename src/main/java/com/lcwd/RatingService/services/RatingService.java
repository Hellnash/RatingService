package com.lcwd.RatingService.services;

import com.lcwd.RatingService.entities.Rating;

import java.util.List;

public interface RatingService {

    //create rating
    Rating createRating(Rating rating);

    //get All ratings
    List<Rating> getAllRatings();

    //get All Ratings of a hotel
    List<Rating> getAllRatingOfHotel(String hotelId);

    //get All Ratings from a user
    List<Rating> getAllRatingOfUser(String userId);

}
