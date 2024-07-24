package com.webapp.foodOrder.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Table
@AllArgsConstructor
@NoArgsConstructor
@Data
public class FoodOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int orderId;
    @Column
    @NotNull(message = "Name id may not be null")
    @NotEmpty(message = "Name id may not be empty")
    private String name;
    @Column
    @NotNull(message = "Email id may not be empty")
    @NotEmpty(message = "Email id may not be empty")
    @Size(min = 2, max = 32, message = "Name must be between 2 and 32 characters long") 
    private String email;
    @Column
    @NotNull(message = "MobileNumber id may not be empty")
    private long mobileNumber;
    @Column
    @NotNull(message = "Address id may not be empty")
    @NotEmpty(message = "Address id may not be empty")
    private String address;
    @Column
    @NotNull(message = "Menu id may not be empty")
    @NotEmpty(message = "Menu id may not be empty")
    private String menu;
    @Column
    @NotNull(message = "OrderType id may not be empty")
    @NotEmpty(message = "OrderType may not be empty")
    private String orderType;


}
