package com.somesh.dao;

import java.util.List;

import com.somesh.model.LoanPlans;

public interface LoanPlansDao {
    public List<LoanPlans> getAllLoanPlans();
    public LoanPlans getLoanPlanById(int id);
    public void addLoanPlan(LoanPlans loanPlan);
    public void saveOrUpdate(LoanPlans loanPlan);
    public void deleteLoanPlan(int id);
}
