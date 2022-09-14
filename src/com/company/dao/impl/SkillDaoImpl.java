package com.company.dao.impl;

import com.company.dao.inter.AbstractDao;
import com.company.dao.inter.SkillDaoInter;
import com.company.entity.Skill;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class SkillDaoImpl extends AbstractDao implements SkillDaoInter {

    private Skill getSkill(ResultSet rs)throws Exception{
       String name = rs.getString("name");
       Skill skill = new Skill(null,name);
       return skill;
    }

    @Override
    public List<Skill> getAllSkill() {
        List<Skill> result = new ArrayList<>();

        try(Connection c = connect()){
            PreparedStatement stmt = c.prepareStatement("select * from skill");
            stmt.execute();
            ResultSet rs = stmt.getResultSet();

            while(rs.next()){
                Skill skill = getSkill(rs);
                result.add(skill);
            }


        }catch (Exception ex){
            ex.printStackTrace();
        }
        return result;
    }
}
