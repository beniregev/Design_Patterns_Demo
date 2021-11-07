package com.beniregev.designpatterns.j2ee_patterns.model_view_controller;

/**
 * <div>
 *     <h1>Model</h1>
 * </div>
 * @author binyamin.regev
 */
public class Student {
    private String rollNo;
    private String name;

    public String getRollNo() {
        return rollNo;
    }

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
