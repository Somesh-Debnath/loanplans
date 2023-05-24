package com.somesh.dao;

import java.util.List;

public interface LoanPlansHistory {
    public List<LoanPlansHistory> getAllLoanPlansHistory();
    public LoanPlansHistory getLoanPlanHistoryById(int id);
    public void addLoanPlanHistory(LoanPlansHistory loanPlanHistory);
    public void saveOrUpdate(LoanPlansHistory loanPlanHistory);
    public void deleteLoanPlanHistory(int id);
}
