package com.somesh.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.somesh.dao.LoanPlansDao;
import com.somesh.model.BaseInterestRates;
import com.somesh.model.LoanPlans;

@Service
public class LoanPlansServiceImpl implements LoanPlansService{

@Autowired
LoanPlansDao loanPlansDao;
    @Override
    public List<LoanPlans> getAllLoanPlans() {
        List<LoanPlans> loanPlans = loanPlansDao.getAllLoanPlans();
        return loanPlans;
    }

    @Override
    public LoanPlans getLoanPlanById(int id) {
       LoanPlans loanPlan = loanPlansDao.getLoanPlanById(id);
        return loanPlan;
    }

    @Override
    public void saveOrUpdate(LoanPlans loanPlan) {
        loanPlansDao.saveOrUpdate(loanPlan);
    }

    @Override
    public void deleteLoanPlan(int id) {
        loanPlansDao.deleteLoanPlan(id);
    }
    
    @Override
    public double calculateInterestAmount(LoanPlans loanPlan, BaseInterestRates baseInterestRates) {
        double interestAmount = 0;
        float baseInterestRate = baseInterestRates.getBaseInterestRate();
        int loanTypeId = loanPlan.getLoanTypeId();
        int principalAmount = loanPlan.getPrincipalAmount();
        int tenure = loanPlan.getTenure();
        int interestRate = loanPlan.getInterestRate();
        if(loanTypeId == 1) {
            interestAmount = (principalAmount * tenure * (baseInterestRate + interestRate))/100;
        }
        else if(loanTypeId == 2) {
            interestAmount = (principalAmount * tenure * (baseInterestRate + interestRate + 0.2))/100;
        }
        else if(loanTypeId == 3) {
            interestAmount = (principalAmount * tenure * (baseInterestRate + interestRate + 0.3))/100;
        }
        else if(loanTypeId == 4) {
            interestAmount = (principalAmount * tenure * (baseInterestRate + interestRate + 0.25))/100;
        }
        else if(loanTypeId == 5) {
            interestAmount = (principalAmount * tenure * (baseInterestRate + interestRate + 0.25))/100;
        }
        return interestAmount;
    }

   
}
