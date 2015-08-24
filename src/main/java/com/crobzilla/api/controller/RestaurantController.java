package com.crobzilla.api.controller;

import com.crobzilla.api.model.Restaurant;
import com.crobzilla.api.service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/restaurants")
public class RestaurantController {

    @Autowired
    private RestaurantService restaurantService;

    /**
     * Creates a new restaurant with the provided data
     * @param restaurant the data used to create the restaurant
     * @return the newly created restaurant
     */
    @RequestMapping(value = "/", method = RequestMethod.POST)
    public Restaurant createRestaurant(@RequestBody Restaurant restaurant){
        return restaurantService.createRestaurant(restaurant);
    }

    /**
     * Gets all restaurants
     * @return a list of all Restaurants
     */
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<Restaurant> getAllRestaurants(){
        return restaurantService.getAllRestaurants();
    }

    /**
     * Gets a single restaurant by the restaurant ID
     * @param id the restaurant ID
     * @return Restaurant
     */
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Restaurant getRestaurantById(@PathVariable("id") String id){
        return restaurantService.getRestaurant(id);
    }

    /**
     * Updates a single restaurant with the given restaurant ID
     * @param id the restaurant ID
     * @param updatedRestaurant the new data to update the Restaurant with
     * @return the Restaurant with the newly updated data
     */
    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public Restaurant updateRestaurantById(@PathVariable("id") String id, @RequestBody Restaurant updatedRestaurant){
        return restaurantService.updateRestaurant(id, updatedRestaurant);
    }

    /**
     * Deletes a single restaurant with the given ID
     * @param id the restaurant ID
     * @return a message informing whether it failed or succeeded
     */
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE, produces = "application/json")
    public Map<String, String> deleteRestaurant(@PathVariable("id") String id){

        Map payload = new HashMap<>();

        try {
            restaurantService.deleteRestaurant(id);
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
            payload.put("Message", "A restaurant with a given ID was not found");
            return payload;
        }

        payload.put("Message", "Restaurant: " + id + " was deleted");
        return payload;

    }

}