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
public class Client {
    
    @Id
    @GeneratedValue()
    private long id;
    
    @Column(nullable = false)
    private String userName;
    
    @Column(nullable = false)
    private String email;
    
    @Column(nullable = false)
    private String contact;
    
    @CreationTimestamp
    @Column(nullable = false)
    private Date createdAt;

    @ManyToOne
    @JoinColumn(name="financialAdvisorId", nullable=false)
    private FinancialAdvisor financialAdvisor;
    
    @OneToMany(mappedBy="owner")
    private List<Portfolio> portfolios;

    public Client(String userName, String email, String contact, Date createdAt) {
        this.userName = userName;
        this.email = email;
        this.contact = contact;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public FinancialAdvisor getFinancialAdvisor() {
        return financialAdvisor;
    }

    public void setFinancialAdvisor(FinancialAdvisor financialAdvisor) {
        this.financialAdvisor = financialAdvisor;
    }

    public List<Portfolio> getPortfolios() {
        return portfolios;
    }

    public void setPortfolios(List<Portfolio> portfolios) {
        this.portfolios = portfolios;
    }
}
