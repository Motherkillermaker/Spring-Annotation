package com.atguigu.bean;

import org.springframework.beans.factory.annotation.Value;

/**
 * @author CJYong
 * @create 2021-10-26 13:26
 */
public class Person {
    @Value("张三")
    private String name;
    @Value("#{20-2}")
    private Integer age;

    public Person() {
    }

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
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

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}