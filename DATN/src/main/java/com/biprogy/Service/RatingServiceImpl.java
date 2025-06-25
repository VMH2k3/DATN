package com.biprogy.Service;

import com.biprogy.Model.Rating;
import com.biprogy.Model.User;
import com.biprogy.Repository.RatingRepository;
import com.biprogy.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.Set;
import java.util.Objects;

@Service
public class RatingServiceImpl implements RatingService {

    private static final Logger logger = LoggerFactory.getLogger(RatingServiceImpl.class);

    @Autowired
    RatingRepository RatingRepository;
    @Autowired
    UserRepository userRepository;

    @Override
    public List<Rating> getRatings() {
        return this.RatingRepository.findAll();
    }

    @Override
    public Boolean addRating(Rating rating) {
        try {
            this.RatingRepository.save(rating);
            return true;
        } catch (Exception e){
            return false;
        }
    }

    @Override
    public List<Rating> getratingsByUserId(Long id) {
        User user = this.userRepository.findById(id).get();
        List<Rating> ratings = user.getRatings();
        return ratings;
    }
}
