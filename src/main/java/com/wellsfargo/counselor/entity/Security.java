package com.wellsfargo.counselor.entity;

import java.util.Date;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Security {
    
    @Id
    @GeneratedValue()
    private long id;
    
    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private float price;

    @Column(nullable = false)
    private int quantity;
    
    @CreationTimestamp
    @Column(nullable = false)
    private Date purchasedAt;
    
    @ManyToOne
    private Category category;

    @ManyToOne
    @JoinColumn(name="portfolio", nullable=false)
    private Portfolio portfolio;

    public Security(String name, float price, int quantity, Date purchasedAt) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.purchasedAt = purchasedAt;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Date getPurchasedAt() {
        return purchasedAt;
    }

    public void setPurchasedAt(Date purchasedAt) {
        this.purchasedAt = purchasedAt;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Portfolio getPortfolio() {
        return portfolio;
    }

    public void setPortfolio(Portfolio portfolio) {
        this.portfolio = portfolio;
    }
}
