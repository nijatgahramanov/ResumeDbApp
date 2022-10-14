package com.company.dao.inter;

import com.company.entity.User;
import com.company.entity.UserSkill;

import java.util.List;

public interface UserDaoInter {

    public List<User> getAll();
    public boolean updateUser(User u);
    public boolean addUser(User u);
    public boolean removeUserById(int id);
    public User getById(int id);




}
