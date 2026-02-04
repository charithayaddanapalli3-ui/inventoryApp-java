package com.inventory.model;

import jakarta.persistence.*;

@Entity
@Table(name = "InventoryItems")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int itemId;

    private String name;
    private String description;
    private Integer quantity;
    private Double unitprice;

    public int getItemId() { return itemId; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
    public Integer getQuantity() { return quantity; }
    public void setQuantity(Integer quantity) { this.quantity = quantity; }
    public Double getUnitprice() { return unitprice; }
    public void setUnitprice(Double unitprice) { this.unitprice = unitprice; }
}