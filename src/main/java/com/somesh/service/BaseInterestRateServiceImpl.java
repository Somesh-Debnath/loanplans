package com.somesh.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.somesh.dao.BaseInterestRatesDao;
import com.somesh.model.BaseInterestRates;

@Service
public class BaseInterestRateServiceImpl implements BaseInterestRateService{

    @Autowired
    BaseInterestRatesDao baseInterestRatesDao;
    @Override
    public List<BaseInterestRates> getAllBaseInterestRates() {
        List<BaseInterestRates> baseInterestRates = baseInterestRatesDao.getAllBaseInterestRates();
        return baseInterestRates;
    }
    
}
