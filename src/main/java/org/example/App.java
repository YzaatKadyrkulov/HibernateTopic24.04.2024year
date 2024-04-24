package org.example;

import org.example.entity.Student;
import org.example.enums.Gender;
import org.example.service.StudentService;
import org.example.service.serviceImpl.StudentServiceImpl;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        StudentService studentService = new StudentServiceImpl();
//        studentService.saveStudent(new Student("Sultan Ali", "Kaldarbekov", "sultaAli@gmail.com", 20, Gender.MALE));

//        System.out.println(studentService.getStudentById(1L));
//        System.out.println(studentService.getAllStudents());

//        System.out.println(studentService.updateStudent(2L, new Student("Zaripbek", "Hursanov", "zaripbek@gmail.com", 22, Gender.MALE)));

//        System.out.println(studentService.deleteStudentById(2L));
    }
}
