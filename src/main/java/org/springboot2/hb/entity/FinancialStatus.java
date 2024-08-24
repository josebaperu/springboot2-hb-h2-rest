package org.springboot2.hb.entity;

import jakarta.persistence.*;

@Entity
@Table(name="financial_status")
public class FinancialStatus {
    private String name;
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name="id",nullable=false,unique=true)
    private String id;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

}
