package com.ssmpoint;

import java.util.List;

/*
 * 使用Spring自动扫描MyBatis的接口并装配 （Spring将指定包中所有被@Mapper注解标注的接口自动装配为MyBatis的映射接口
 */
public interface ItemMapper {
    /**
     * 接口方法对应的SQL映射文件ItemMapper.xml中的id
     */
    public MyItem selectItemById(Integer uid);
    public List<MyItem> selectAllItem();
    public int addItem(MyItem Item);
    public int updateItem(MyItem Item);
    public int deleteItem(Integer uid);
}