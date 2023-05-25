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
        return jdbcTemplate.query("Select * from loanplans", new RowMapper<LoanPlans>() {

            @Override
            public LoanPlans mapRow(ResultSet rs, int rowNum) throws SQLException {
                LoanPlans loanPlan = new LoanPlans();
                loanPlan.setPlanId(rs.getInt("planId"));
                loanPlan.setPlanName(rs.getString("planName"));
                loanPlan.setLoanTypeId(rs.getInt("loanTypeId"));
                loanPlan.setPrincipalAmount(rs.getInt("principalAmount"));
                loanPlan.setInterestRate(rs.getInt("interestRate"));
                loanPlan.setTenure(rs.getInt("tenure"));
                loanPlan.setEmi(rs.getInt("emi"));
                loanPlan.setTotalAmount(rs.getInt("totalAmount"));
                loanPlan.setInterestAmount(rs.getInt("interestAmount"));
                loanPlan.setPlanValidity(rs.getInt("planValidity"));
                loanPlan.setPlanAddedOn(rs.getInt("planAddedOn"));
                return loanPlan;

            }
        });
        
    }


    @Override
    public LoanPlans getLoanPlanById(int id) {
        // TODO Auto-generated method stub
        String sql = "Select * from loanplans where planId=" + id;
        return jdbcTemplate.query(sql, new ResultSetExtractor<LoanPlans>() {

            @Override
            public LoanPlans extractData(ResultSet rs) throws SQLException, DataAccessException {
                if (rs.next()) {
                    LoanPlans loanPlan = new LoanPlans();
                    loanPlan.setPlanId(rs.getInt("planId"));
                    loanPlan.setPlanName(rs.getString("planName"));
                    loanPlan.setLoanTypeId(rs.getInt("loanTypeId"));
                    loanPlan.setPrincipalAmount(rs.getInt("principalAmount"));
                    loanPlan.setInterestRate(rs.getInt("interestRate"));
                    loanPlan.setTenure(rs.getInt("tenure"));
                    loanPlan.setEmi(rs.getInt("emi"));
                    loanPlan.setTotalAmount(rs.getInt("totalAmount"));
                    loanPlan.setInterestAmount(rs.getInt("interestAmount"));
                    loanPlan.setPlanValidity(rs.getInt("planValidity"));
                    loanPlan.setPlanAddedOn(rs.getInt("planAddedOn"));
                    return loanPlan;
                }
                return null;
            }
        });
    }

    @Override
    public void saveOrUpdate(LoanPlans loanPlan) {
        // TODO Auto-generated method stub
        if (loanPlan.getPlanId() > 0) {
            // update
            String sql = "UPDATE loanplans SET planName=?, loanTypeId=?, principalAmount=?, interestRate=?, tenure=?, emi=?, totalAmount=?, interestAmount=?, planValidity=?, planAddedOn=? WHERE planId=?";
            jdbcTemplate.update(sql, loanPlan.getPlanName(), loanPlan.getLoanTypeId(), loanPlan.getPrincipalAmount(), loanPlan.getInterestRate(), loanPlan.getTenure(), loanPlan.getEmi(), loanPlan.getTotalAmount(), loanPlan.getInterestAmount(), loanPlan.getPlanValidity(), loanPlan.getPlanAddedOn(), loanPlan.getPlanId());
        } else {
            // insert
            String sql = "INSERT INTO loanplans (planName, loanTypeId, principalAmount, interestRate, tenure, emi, totalAmount, interestAmount, planValidity, planAddedOn) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            jdbcTemplate.update(sql, loanPlan.getPlanName(), loanPlan.getLoanTypeId(), loanPlan.getPrincipalAmount(), loanPlan.getInterestRate(), loanPlan.getTenure(), loanPlan.getEmi(), loanPlan.getTotalAmount(), loanPlan.getInterestAmount(), loanPlan.getPlanValidity(), loanPlan.getPlanAddedOn());
        }
    }

    @Override
    public void deleteLoanPlan(int id) {
        // TODO Auto-generated method stub
        String sql = "DELETE FROM loanplans WHERE planId=?";
        jdbcTemplate.update(sql, id);
    }
}