package com.somesh.service;

import java.util.List;

import com.somesh.model.BaseInterestRates;
import com.somesh.model.LoanPlans;

public interface LoanPlansService {
    public List<LoanPlans> getAllLoanPlans();
    public LoanPlans getLoanPlanById(int id);
    public void saveOrUpdate(LoanPlans loanPlan);
    public void deleteLoanPlan(int id);
    public double calculateInterestAmount(LoanPlans loanPlan, BaseInterestRates baseInterestRates);
}
