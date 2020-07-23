package com.myatispoint;

public class User {
    private String name;
    private Integer age;
    private String id;

    public User(){
    }

    public User( int age, String name){
        this.name=name;
        this.age=age;
    }

    public User(String id, int age, String name){
        this.id=id;
        this.name=name;
        this.age=age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getId() {return this.id;}

    public void setId(String id) {
        this.id = id;
    }

    public String toString(){
        return this.getName()+":"+this.getAge();
    }

}