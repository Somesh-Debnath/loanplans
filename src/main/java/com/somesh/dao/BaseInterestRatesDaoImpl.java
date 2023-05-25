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

import com.somesh.model.BaseInterestRates;

@Repository
public class BaseInterestRatesDaoImpl implements BaseInterestRatesDao{
    @Autowired
    JdbcTemplate jdbcTemplate;

    public BaseInterestRatesDaoImpl(DataSource dataSource) {
        jdbcTemplate = new JdbcTemplate(dataSource);
    }
    public BaseInterestRatesDaoImpl() {
        // TODO Auto-generated constructor stub
        super();
    }
    @Override
    public List<BaseInterestRates> getAllBaseInterestRates() {
        return jdbcTemplate.query("Select * from baseinterestrates", new RowMapper<BaseInterestRates>() {
            @Override
            public BaseInterestRates mapRow(ResultSet rs, int rowNum) throws SQLException {
                BaseInterestRates baseInterestRate = new BaseInterestRates();
                baseInterestRate.setId(rs.getInt("id"));
                baseInterestRate.setLoanType(rs.getString("loanType"));
                baseInterestRate.setBaseInterestRate(rs.getFloat("baseInterestRate"));
                return baseInterestRate;
            }
        });
    }
    // @Override
    // public BaseInterestRates getBaseInterestRateById(int id) {
    //     String sql = "SELECT * FROM baseinterestrates WHERE id=" + id;
    //     return jdbcTemplate.query(sql, new ResultSetExtractor<BaseInterestRates>() {
    //         @Override
    //         public BaseInterestRates extractData(ResultSet rs) throws SQLException, DataAccessException {
    //             if (rs.next()) {
    //                 BaseInterestRates baseInterestRate = new BaseInterestRates();
    //                 baseInterestRate.setId(rs.getInt("id"));
    //                 baseInterestRate.setLoanType(rs.getString("loanType"));
    //                 baseInterestRate.setBaseInterestRate(rs.getFloat("baseInterestRate"));
    //                 return baseInterestRate;
    //             }
    //             return null;
    //         }
    //     });
    // }
    // @Override
    // public void saveOrUpdate(BaseInterestRates baseInterestRate) {
    //     if (baseInterestRate.getId() > 0) {
    //         // update
    //         String sql = "UPDATE baseinterestrates SET loanType=?, baseInterestRate=? WHERE id=?";
    //         jdbcTemplate.update(sql, baseInterestRate.getLoanType(), baseInterestRate.getBaseInterestRate(), baseInterestRate.getId());
    //     } else {
    //         // insert
    //         String sql = "INSERT INTO baseinterestrates (loanType, baseInterestRate) VALUES (?, ?)";
    //         jdbcTemplate.update(sql, baseInterestRate.getLoanType(), baseInterestRate.getBaseInterestRate());
    //     }
    // }
    // @Override
    // public void deleteBaseInterestRate(int id) {
    //     String sql = "DELETE FROM baseinterestrates WHERE id=?";
    //     jdbcTemplate.update(sql, id);
    // }
    
}
