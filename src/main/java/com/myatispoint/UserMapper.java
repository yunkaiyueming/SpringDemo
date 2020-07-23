package com.myatispoint;

import java.util.List;

public interface UserMapper {

    public User findById(String Id);

    public List<User> getAllUser();

    public void addUser(User u);

    public void updateUser(User User);

    public void delUserById(String Id);
}

