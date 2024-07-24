package com.webapp.foodOrder.controller;

import org.springframework.web.bind.annotation.RestController;

import com.webapp.foodOrder.model.FoodOrder;
import com.webapp.foodOrder.service.FoodOrderService;

import jakarta.validation.Valid;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@Validated
public class FoodController {

    @Autowired
    FoodOrderService foodOrderService;

    @PostMapping("/orderFood")
    public int saveOrder(@Valid  @RequestBody FoodOrder foodOrder){
        foodOrderService.saveOrder(foodOrder);
       return foodOrder.getOrderId();
    }

    @GetMapping("/getAllFood")
    public List<FoodOrder> getAllFoodOrder(){
        return foodOrderService.getAllFoodOrder();
    }
    @GetMapping("/getFood")
    public String getFoodOrder(){
        return "Welcome to foodOrder company";
    }
    @DeleteMapping("/deleteAllFood")
    public String deleteAllFoodOrder() {
        foodOrderService.deleteAllFoodOrder();
        return "Order Deleted Successfully";
    }

    @DeleteMapping("/deleteFood/{orderId}")
    public String deleteAllFoodOrder(@PathVariable int orderId) {
        foodOrderService.deleteFoodOrderById(orderId);
        return "Order delected successfully " + orderId;
    }
}
