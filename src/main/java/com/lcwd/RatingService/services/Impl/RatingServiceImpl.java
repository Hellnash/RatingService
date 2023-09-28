package com.lcwd.RatingService.services.Impl;

import com.lcwd.RatingService.entities.Rating;
import com.lcwd.RatingService.repositories.RatingRepository;
import com.lcwd.RatingService.services.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@SuppressWarnings("unused")
public class RatingServiceImpl implements RatingService {

    @Autowired
    RatingRepository ratingRepository;

    @Override
    public Rating createRating(Rating rating) {
        rating.setRatingId(UUID.randomUUID().toString());
        return ratingRepository.save(rating);
    }

    @Override
    public List<Rating> getAllRatings() {
        return ratingRepository.findAll();
    }

    @Override
    public List<Rating> getAllRatingOfHotel(String hotelId) {
        return ratingRepository.findByHotelId(hotelId);
    }

    @Override
    public List<Rating> getAllRatingOfUser(String userId) {
        return ratingRepository.findByUserId(userId);
    }
}
