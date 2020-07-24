package com.ssmpoint;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/*
 * 使用Spring自动扫描MyBatis的接口并装配 （Spring将指定包中所有被@Mapper注解标注的接口自动装配为MyBatis的映射接口
 */
public interface UserMapper {
    /**
     * 接口方法对应的SQL映射文件UserMapper.xml中的id
     */
    public MyUser selectUserById(Integer uid);
    public List<MyUser> selectAllUser();
    public int addUser(MyUser user);
    public int updateUser(MyUser user);
    public int deleteUser(Integer uid);
}