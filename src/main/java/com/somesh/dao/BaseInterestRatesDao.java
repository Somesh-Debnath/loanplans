package com.somesh.dao;

import java.util.List;

import com.somesh.model.BaseInterestRates;

public interface BaseInterestRatesDao {
    public List<BaseInterestRates> getAllBaseInterestRates();
    public BaseInterestRates getBaseInterestRateById(int id);
    public void addBaseInterestRate(BaseInterestRates baseInterestRate);
    public void saveOrUpdate(BaseInterestRates baseInterestRate);
    public void deleteBaseInterestRate(int id);
}
