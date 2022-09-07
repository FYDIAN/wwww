package com.fy.mybatis.pojo;

public class User {
    private Integer id;
    private String username;
    private String password;
    private Integer age;
    private Character sex;
    private String email;

    public User() {
    }

    public User(Integer id, String username, String password, Integer age, Character sex, String email) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.age = age;
        this.sex = sex;
        this.email = email;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Character getAgend() {
        return sex;
    }

    public void setAgend(Character agend) {
        this.age = age;
    }

    public String getEmial() {
        return email;
    }

    public void setEmial(String emial) {
        this.email = emial;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", age=" + age +
                ", agend=" + sex +
                ", emial='" + email + '\'' +
                '}';
    }
}
