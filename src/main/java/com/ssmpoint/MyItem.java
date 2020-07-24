package com.ssmpoint;
/**
 * springtest数据库中item表的持久类
 */
public class MyItem {
    private Integer id; // 主键
    private String itemId;
    private String num;

    public Integer getId() {
        return id;
    }

    public String getItemId() {
        return itemId;
    }

    public String getNum() {
        return num;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public void setNum(String num) {
        this.num = num;
    }

    // 此处省略setter和getter方法
    @Override
    public String toString() { // 为了方便查看结果，重写了toString方法
        return "User[id=" + id + ",itemid=" + itemId + ",itemnum=" + num + "]";
    }
}