package com.somesh.model;

import java.io.Serializable;
import java.sql.Date;

public class LoanPlansHistory implements Serializable{
    private static final long serialVersionUID = 1L;
    public static long getSerialversionuid() {
        return serialVersionUID;
    }
    private int id;
    private Date updatedDate;
    private String updatedReason;
    @Override
    public String toString() {
        return "LoanPlansHistory [id=" + id + ", updatedDate=" + updatedDate + ", updatedReason=" + updatedReason
                + ", loanPlanId=" + loanPlanId + "]";
    }
    private int loanPlanId;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public Date getUpdatedDate() {
        return updatedDate;
    }
    public void setUpdatedDate(Date updatedDate) {
        this.updatedDate = updatedDate;
    }
    public String getUpdatedReason() {
        return updatedReason;
    }
    public void setUpdatedReason(String updatedReason) {
        this.updatedReason = updatedReason;
    }
    public int getLoanPlanId() {
        return loanPlanId;
    }
    public void setLoanPlanId(int loanPlanId) {
        this.loanPlanId = loanPlanId;
    }
}
