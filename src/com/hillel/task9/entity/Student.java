package com.hillel.task9.entity;

public class Student extends Human{
    private float avgMark;

    public Student(String name, int age, float avgMark) {
        super(name, age);
        this.avgMark = avgMark;
    }

    public float getAvgMark() {
        return avgMark;
    }

    public void setAvgMark(float avgMark) {
        this.avgMark = avgMark;
    }

    @Override
    public void walking() {
        System.out.println(this.getName() + " Run");
    }

}
