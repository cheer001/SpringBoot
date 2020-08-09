package com.gerry.springboot.bean;

/**
 * 特长实体
 */
public class Forte {
    private String name;
    private Integer time;

    @Override
    public String toString() {
        return "Forte{" +
                "name='" + name + '\'' +
                ", time=" + time +
                '}';
    }

    public Forte() {
    }

    public Forte(String name, Integer time) {
        this.name = name;
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getTime() {
        return time;
    }

    public void setTime(Integer time) {
        this.time = time;
    }
}
