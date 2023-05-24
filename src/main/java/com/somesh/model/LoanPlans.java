package com.somesh.model;

import java.io.Serializable;

public class LoanPlans implements Serializable{
    private static final long serialVersionUID = 1L;

    public static long getSerialversionuid() {
        return serialVersionUID;
    }
    private int planId;
    private String planName;
    private int loanTypeId;
    private int principalAmount;
    private int interestRate;
    private int tenure;
    private int emi;
    private int totalAmount;
    private int interestAmount;
    private int planValidity;
    private int planAddedOn;

    
    public int getPlanId() {
        return planId;
    }
    public void setPlanId(int planId) {
        this.planId = planId;
    }
    public String getPlanName() {
        return planName;
    }
    public void setPlanName(String planName) {
        this.planName = planName;
    }
    public int getLoanTypeId() {
        return loanTypeId;
    }
    public void setLoanTypeId(int loanTypeId) {
        this.loanTypeId = loanTypeId;
    }
    public int getPrincipalAmount() {
        return principalAmount;
    }
    public void setPrincipalAmount(int principalAmount) {
        this.principalAmount = principalAmount;
    }
    public int getInterestRate() {
        return interestRate;
    }
    public void setInterestRate(int interestRate) {
        this.interestRate = interestRate;
    }
    public int getTenure() {
        return tenure;
    }
    public void setTenure(int tenure) {
        this.tenure = tenure;
    }
    public int getEmi() {
        return emi;
    }
    public void setEmi(int emi) {
        this.emi = emi;
    }
    public int getTotalAmount() {
        return totalAmount;
    }
    public void setTotalAmount(int totalAmount) {
        this.totalAmount = totalAmount;
    }
    public int getInterestAmount() {
        return interestAmount;
    }
    public void setInterestAmount(int interestAmount) {
        this.interestAmount = interestAmount;
    }
    public int getPlanValidity() {
        return planValidity;
    }
    public void setPlanValidity(int planValidity) {
        this.planValidity = planValidity;
    }
    public int getPlanAddedOn() {
        return planAddedOn;
    }
    public void setPlanAddedOn(int planAddedOn) {
        this.planAddedOn = planAddedOn;
    }


    @Override
    public String toString() {
        return "loanPlans [planId=" + planId + ", planName=" + planName + ", loanTypeId=" + loanTypeId
                + ", principalAmount=" + principalAmount + ", interestRate=" + interestRate + ", tenure=" + tenure
                + ", emi=" + emi + ", totalAmount=" + totalAmount + ", interestAmount=" + interestAmount
                + ", planValidity=" + planValidity + ", planAddedOn=" + planAddedOn + "]";
    }
}
