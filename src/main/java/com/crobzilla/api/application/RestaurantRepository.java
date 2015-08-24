package com.crobzilla.api.application;

import com.crobzilla.api.model.Restaurant;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface RestaurantRepository extends MongoRepository<Restaurant, String> {

    public List<Restaurant> findByName(String name);
    public Restaurant findByRestaurantId(String restaurantId);

}