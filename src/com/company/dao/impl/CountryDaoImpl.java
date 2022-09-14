package com.company.dao.impl;

import com.company.dao.inter.AbstractDao;
import com.company.dao.inter.CountryDaoInter;
import com.company.entity.Country;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CountryDaoImpl extends AbstractDao implements CountryDaoInter {

    private Country getCountry(ResultSet rs) throws Exception {
        String name = rs.getString("name");
        Country cntry = new Country(null, name, null);
        return cntry;
    }

    @Override
    public List<Country> getAllCountry() {
        List<Country> result = new ArrayList<>();

        try (Connection c = connect()) {
            PreparedStatement stmt = c.prepareStatement("select*from country");
            stmt.execute();
            ResultSet rs = stmt.getResultSet();

            while (rs.next()) {
                Country cnt = getCountry(rs);
                result.add(cnt);
            }


        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return result;
    }
}
