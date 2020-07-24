package com.ssmpoint;
/**
 * springtest数据库中user表的持久类
 */
public class MyUser  {
    private Integer uid; // 主键
    private String uname;
    private String usex;

    public String getUsex() {
        return usex;
    }
    public Integer getUid() {
        return uid;
    }

    public String getUname() {
        return uname;
    }

    public void setUsex(String usex) {
        this.usex = usex;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    // 此处省略setter和getter方法
    @Override
    public String toString() { // 为了方便查看结果，重写了toString方法
        return "User[uid=" + uid + ",uname=" + uname + ",usex=" + usex + "]";
    }
}