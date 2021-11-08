package com.beniregev.designpatterns.j2ee_patterns.model_view_controller.example1;

/**
 * <div>
 *     <h1>View</h1>
 * </div>
 * @author binyamin.regev
 */
public class StudentView {
    public void printStudentDetails(String studentName, String studentRollNo){
        System.out.println("Student: ");
        System.out.println("Name: " + studentName);
        System.out.println("Roll No: " + studentRollNo);
    }
}
