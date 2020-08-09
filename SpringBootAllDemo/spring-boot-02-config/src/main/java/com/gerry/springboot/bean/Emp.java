package com.gerry.springboot.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * 员工实体
 *
 * @ConfigurationProperties 告诉Springboot 将配置文件中的对应属性值,映射到这个数组类中 进行一一绑定
 * @Component : 将当前组件作为 Springboot中的一个组件来使用,会纳入SpringIOC容器中
 * prefix="emp" : 配置文件中的前缀名,配置了哪个前缀就会与下面的属性进行一一映射
 */
@Component
@ConfigurationProperties(prefix="emp")
public class Emp {
    private String lastName;
    private Integer age;
    private Date birthday;
    private Double salary;
    private Boolean boss;

    private Map map;
    private List list;

    private Forte forte;

    @Override
    public String toString() {
        return "Emp{" +
                "lastName='" + lastName + '\'' +
                ", age=" + age +
                ", birthday=" + birthday +
                ", salary=" + salary +
                ", boss=" + boss +
                ", map=" + map +
                ", list=" + list +
                ", forte=" + forte +
                '}';
    }

    public Emp() {
    }

    public Emp(String lastName, Integer age, Date birthday, Double salary, Boolean boss, Map map, List list, Forte forte) {
        this.lastName = lastName;
        this.age = age;
        this.birthday = birthday;
        this.salary = salary;
        this.boss = boss;
        this.map = map;
        this.list = list;
        this.forte = forte;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Boolean getBoss() {
        return boss;
    }

    public void setBoss(Boolean boss) {
        this.boss = boss;
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    public List getList() {
        return list;
    }

    public void setList(List list) {
        this.list = list;
    }

    public Forte getForte() {
        return forte;
    }

    public void setForte(Forte forte) {
        this.forte = forte;
    }
}
