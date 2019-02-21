package com.hillel.task9;

import com.hillel.task9.entity.Human;
import com.hillel.task9.entity.Student;
import com.hillel.task9.entity.Teacher;

public class Main {
    public static void main(String[] args) {
        Human human = new Human("human", 18);
        Human student = new Student("student", 19, 9.8f);
        Human teacher = new Teacher("teacher", 42, "Math");
        Teacher realTeacher = new Teacher("real teacher", 43, "QAautto");
        ((Teacher) teacher).giveReview();
        realTeacher.giveReview();

        goOutHuman(human);
        goOutHuman(student);
        goOutHuman(teacher);
        goOutHuman(realTeacher);
    }

    private static void goOutHuman(Human human) {
        human.walking();
    }
}
