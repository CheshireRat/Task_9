package com.hillel.task9.entity;

public class Teacher extends Human{
    private String subject;

    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public void walking() {
        System.out.println(this.getName() + " Slow walk");
    }

    public String giveReview(){
        return "Good job";
    }
}
