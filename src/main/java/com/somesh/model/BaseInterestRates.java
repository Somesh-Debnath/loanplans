package com.somesh.model;

import java.io.Serializable;

public class BaseInterestRates implements Serializable{

 private static final long serialVersionUID = 1L;
 public static long getSerialversionuid() {
    return serialVersionUID;
}

private int id;
 private String loanType;
 public String getLoanType() {
    return loanType;
}
public void setLoanType(String loanType) {
    this.loanType = loanType;
}
@Override
public String toString() {
    return "baseInterestRates [id=" + id + ", loanType=" + loanType + ", baseInterestRate=" + baseInterestRate + "]";
}
public float getBaseInterestRate() {
    return baseInterestRate;
}
public void setBaseInterestRate(float baseInterestRate) {
    this.baseInterestRate = baseInterestRate;
}

private float baseInterestRate;
public int getId() {
    return id;
}
public void setId(int id) {
    this.id = id;
}

public void setBaseInterestRate(int baseInterestRate) {
    this.baseInterestRate = baseInterestRate;
}   
}
