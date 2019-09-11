package com.soplab.lecture.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "Sashimi")
public class Sashimi implements Serializable {

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private double price;

    @Column(nullable = false)
    private int amount=0;

    @Column(nullable = false)
    private String type;

    @Id
    @GeneratedValue()
    private int id;

    public Sashimi(String name, double price, int amount, String type) {
        this.name = name;
        this.price = price;
        this.amount = amount;
        this.type = type;
    }

    public Sashimi() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
