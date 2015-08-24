package com.crobzilla.api.service;

import com.crobzilla.api.application.RestaurantRepository;
import com.crobzilla.api.model.Restaurant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RestaurantService {

    @Autowired
    private RestaurantRepository restaurantRepository;

    /**
     * Create a new restaurant
     * @param restaurant the restaurant data
     * @return the newly created restaurant data
     */
    public Restaurant createRestaurant(Restaurant restaurant){
        Restaurant newRestaurant = restaurantRepository.insert(restaurant);
        return newRestaurant;
    }

    /**
     * Gets a restaurant by the given ID
     * @param restaurantId the ID of the restaurant
     * @return The restaurant with the given ID
     */
    public Restaurant getRestaurant(String restaurantId){
        return restaurantRepository.findByRestaurantId(restaurantId);
    }

    /**
     * Gets all restaurants
     * @return the list of all restaurants
     */
    public List<Restaurant> getAllRestaurants(){
        return restaurantRepository.findAll();
    }

    /**
     * Updates the restaurant with the given id with the given data
     * @param restaurantId the ID of the restaurant
     * @param restaurant the updated restaurant data
     * @return the restaurant with the newly updated data
     */
    public Restaurant updateRestaurant(String restaurantId, Restaurant restaurant){

        Restaurant oldRestaurant = restaurantRepository.findByRestaurantId(restaurantId);
        oldRestaurant.setAddress(restaurant.getAddress());
        oldRestaurant.setBorough(restaurant.getBorough());
        oldRestaurant.setCuisine(restaurant.getCuisine());
        oldRestaurant.setGrades(restaurant.getGrades());
        oldRestaurant.setName(restaurant.getName());
        Restaurant updatedRestaurant = restaurantRepository.save(oldRestaurant);

        return updatedRestaurant;
    }

    /**
     * Delete the restaurant with the given ID
     * @param restaurantId the ID of the restaurant
     * @throws IllegalArgumentException if there is no restaurant with the given ID
     */
    public void deleteRestaurant(String restaurantId) throws IllegalArgumentException{
        try {
            restaurantRepository.delete(restaurantRepository.findByRestaurantId(restaurantId));
        } catch (IllegalArgumentException e) {
            throw e;
        }
    }

}