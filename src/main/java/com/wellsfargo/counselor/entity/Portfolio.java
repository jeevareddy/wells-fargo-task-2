package com.wellsfargo.counselor.entity;

import java.util.Date;
import java.util.List;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Portfolio {
    
    @Id
    @GeneratedValue()
    private long id;
    
    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String status;
    
    @CreationTimestamp
    @Column(nullable = false)
    private Date createdAt;

    @ManyToOne
    @JoinColumn(name="owner", nullable=false)
    private Client owner;
    
    @OneToMany(mappedBy="portfolio")
    private List<Security> securities;

    public Portfolio(String title, String status, Date createdAt) {
        this.title = title;
        this.status = status;
        this.createdAt = createdAt;
    }

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Client getOwner() {
        return owner;
    }

    public void setOwner(Client owner) {
        this.owner = owner;
    }

    public List<Security> getSecurities() {
        return securities;
    }

    public void setSecurities(List<Security> securities) {
        this.securities = securities;
    }
}
