package com.biprogy.Service;

import com.biprogy.Model.Rating;

import java.util.List;
import java.util.Set;

public interface RatingService {
    List<Rating> getRatings();
    Boolean addRating(Rating rating);
    List<Rating> getratingsByUserId(Long id);
}
