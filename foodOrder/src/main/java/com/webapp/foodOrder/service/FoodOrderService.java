package com.webapp.foodOrder.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webapp.foodOrder.model.FoodOrder;
import com.webapp.foodOrder.repository.FoodOrderRepository;

@Service
public class FoodOrderService {

    @Autowired 
    FoodOrderRepository foodOrderRepository;

    public void saveOrder(FoodOrder foodOrder) {
        foodOrderRepository.save(foodOrder);
       
       
    }

    public List<FoodOrder> getAllFoodOrder() {
        List<FoodOrder> order = new ArrayList<FoodOrder>();
        foodOrderRepository.findAll().forEach(order1 -> order.add(order1));
        return order;

    }

    public void deleteAllFoodOrder() {
        foodOrderRepository.deleteAll();
    }
    public void deleteFoodOrderById(int id) {
        foodOrderRepository.deleteById(id);
    }
}
