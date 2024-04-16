package com.daryn.solvatest.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name="limits")
public class Limit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "limitSum")
    private BigDecimal limitSum;

    @Column(name = "limitDateTime")
    private Date limitDateTime;

    @Column(name = "limitCurrencyShortName")
    private String limitCurrencyShortName;

    @Column(name = "category")
    private String category;

    public Limit() {
    }

    public Limit(Long id, BigDecimal limitSum, Date limitDateTime, String limitCurrencyShortName, String category) {
        this.id = id;
        this.limitSum = limitSum;
        this.limitDateTime = limitDateTime;
        this.limitCurrencyShortName = limitCurrencyShortName;
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BigDecimal getLimitSum() {
        return limitSum;
    }

    public void setLimitSum(BigDecimal limitSum) {
        this.limitSum = limitSum;
    }

    public Date getLimitDateTime() {
        return limitDateTime;
    }

    public void setLimitDateTime(Date limitDateTime) {
        this.limitDateTime = limitDateTime;
    }

    public String getLimitCurrencyShortName() {
        return limitCurrencyShortName;
    }

    public void setLimitCurrencyShortName(String limitCurrencyShortName) {
        this.limitCurrencyShortName = limitCurrencyShortName;
    }
}
