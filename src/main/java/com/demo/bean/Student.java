package com.demo.bean;

import net.sf.json.JSONObject;

/**
 * @description:
 * @author: lijian
 * @create: 2019-03-01
 **/
public class Student {
    private Integer id;
    private String name;
    private String subjects;
    private JSONObject stu_json;

    public JSONObject getStu_json() {
        return stu_json;
    }

    public void setStu_json(JSONObject stu_json) {
        this.stu_json = stu_json;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubjects() {
        return subjects;
    }

    public void setSubjects(String subjects) {
        this.subjects = subjects;
    }
}
