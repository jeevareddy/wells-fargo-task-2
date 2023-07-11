package com.wellsfargo.counselor.entity;

import java.util.Date;
import java.util.List;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class FinancialAdvisor {

    @Id
    @GeneratedValue()
    private long id;

    @Column(nullable = false)
    private String userName;

    @CreationTimestamp
    @Column(nullable = false)
    private Date createdAt;

    @OneToMany(mappedBy="financialAdvisor")
    private List<Client> clients;

    public FinancialAdvisor(String userName, Date createdAt) {
        this.userName = userName;
        this.createdAt = createdAt;
    }

    public long getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public List<Client> getClients() {
        return clients;
    }

    public void setClients(List<Client> clients) {
        this.clients = clients;
    }    
    
}
