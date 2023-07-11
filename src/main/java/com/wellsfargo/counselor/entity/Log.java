package com.wellsfargo.counselor.entity;

import java.util.Date;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
 
@Entity
public class Log {
    
    @Id
    @GeneratedValue()
    private long id;
    
    @Column(nullable = false)
    private String operation;

    @Column(nullable = false)
    private String table;

    @Column(nullable = false)
    private Object old_value;

    @Column(nullable = false)
    private Object new_value;
    
    @CreationTimestamp
    @Column(nullable = false)
    private Date timestamp;

    public Log(String operation, String table, Object old_value, Object new_value, Date timestamp) {
        this.operation = operation;
        this.table = table;
        this.old_value = old_value;
        this.new_value = new_value;
        this.timestamp = timestamp;
    }

    public long getId() {
        return id;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public String getTable() {
        return table;
    }

    public void setTable(String table) {
        this.table = table;
    }

    public Object getOld_value() {
        return old_value;
    }

    public void setOld_value(Object old_value) {
        this.old_value = old_value;
    }

    public Object getNew_value() {
        return new_value;
    }

    public void setNew_value(Object new_value) {
        this.new_value = new_value;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }
    
}
