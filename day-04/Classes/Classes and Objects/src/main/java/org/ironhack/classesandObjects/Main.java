package org.ironhack.classesandObjects;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Course course = new Course("CS101", 30, 25, "Intro to Computer Science");
        System.out.println(course.getTitle());        // Output: Intro to Computer Science
        System.out.println(course.getStudentCount());  // Output: 25
    }
}
