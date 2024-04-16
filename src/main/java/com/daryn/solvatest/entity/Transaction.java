package com.daryn.solvatest.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "transaction")
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "accountFrom")
    private Integer accountFrom;

    @Column(name = "accountTo")
    private Integer accountTo;

    @Column(name = "currencyShortName")
    private String currencyShortName;

    @Column(name = "sum")
    private BigDecimal sum;

    @Column(name = "datetime")
    private Date datetime;

    @Column(name = "expenseCategory")
    private String expenseCategory;

    @Column(name = "limitExceeded")
    private Boolean limitExceeded = false;


    public Transaction() {
    }

    public Transaction(Long id, Integer accountFrom, Integer accountTo, String currencyShortName, BigDecimal sum, Date datetime, String expenseCategory, Boolean limitExceeded) {
        this.id = id;
        this.accountFrom = accountFrom;
        this.accountTo = accountTo;
        this.currencyShortName = currencyShortName;
        this.sum = sum;
        this.datetime = datetime;
        this.expenseCategory = expenseCategory;
        this.limitExceeded = limitExceeded;
    }

    public Boolean getLimitExceeded() {
        return limitExceeded;
    }

    public void setLimitExceeded(Boolean limitExceeded) {
        this.limitExceeded = limitExceeded;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getAccountFrom() {
        return accountFrom;
    }

    public void setAccountFrom(Integer accountFrom) {
        this.accountFrom = accountFrom;
    }

    public Integer getAccountTo() {
        return accountTo;
    }

    public void setAccountTo(Integer accountTo) {
        this.accountTo = accountTo;
    }

    public String getCurrencyShortName() {
        return currencyShortName;
    }

    public void setCurrencyShortName(String currencyShortName) {
        this.currencyShortName = currencyShortName;
    }

    public BigDecimal getSum() {
        return sum;
    }

    public void setSum(BigDecimal sum) {
        this.sum = sum;
    }

    public Date getDatetime() {
        return datetime;
    }

    public void setDatetime(Date datetime) {
        this.datetime = datetime;
    }

    public String getExpenseCategory() {
        return expenseCategory;
    }

    public void setExpenseCategory(String expenseCategory) {
        this.expenseCategory = expenseCategory;
    }
}
