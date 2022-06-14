package com.revature.dao;

import com.revature.models.User;

import java.util.ArrayList;

public interface UserDaoInterface {
    public void insertEmployee(User user);
    public User getEmployeeByUsername(String username);
    public ArrayList<User> getAllEmployees();
    public boolean existsByName(String username);
}