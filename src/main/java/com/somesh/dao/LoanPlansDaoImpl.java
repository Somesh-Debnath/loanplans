package com.somesh.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.somesh.model.LoanPlans;

@Repository
public class LoanPlansDaoImpl implements LoanPlansDao{
    @Autowired
    JdbcTemplate jdbcTemplate;

    public LoanPlansDaoImpl(DataSource dataSource) {
        jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public LoanPlansDaoImpl() {
        // TODO Auto-generated constructor stub
        super();
    }

    @Override
    public List<LoanPlans> getAllLoanPlans() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public LoanPlans getLoanPlanById(int id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getLoanPlanById'");
    }

    @Override
    public void addLoanPlan(LoanPlans loanPlan) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addLoanPlan'");
    }

    @Override
    public void saveOrUpdate(LoanPlans loanPlan) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'saveOrUpdate'");
    }

    @Override
    public void deleteLoanPlan(int id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteLoanPlan'");
    }
    
}
