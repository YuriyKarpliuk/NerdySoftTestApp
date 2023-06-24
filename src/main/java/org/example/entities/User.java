package org.example.entities;

public class User {
    private String name;
    private Integer age;
    private User(){

    };
    public static User createUser(String name, Integer age){
        User user = new User();
        user.setName(name);
        user.setAge(age);
        return user;
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
}
