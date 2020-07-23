package com.myatispoint;

import java.util.List;

public interface PeopleMapper {

    public People findById(String Id);

    public List<People> getAllUser();

    public int addUser(People u);

    public int updateUser(People User);

    public int delUserById(String Id);
}

