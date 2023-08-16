package com.practice.ServiceImpl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.practice.Entity.Student;
import com.practice.Service.StudentSerivce;

@Component
public class StudentServiceImpl implements StudentSerivce {

    @Autowired
    Student studentEntity;
    String message;

    @Override
    public String getName(int id) {
        if (studentEntity.getStudents() != null) {

            studentEntity.getStudents().stream().forEach(std -> {
                if (std.getId() == id) {
                    message = "This is Student1 and Student is :\n" + std.getId() + ", " + std.getName() + ", "
                            + std.getAddress();
                }

            });
            if (message != null) {
                System.out.println("else called");
                return message;
            }

        }
        if (id == studentEntity.getId()) {
            System.out.println("Service Called");

            return "This is Student1 and Student is :\n" + studentEntity.getId() + ", " + studentEntity.getName() + ", "
                    + studentEntity.getAddress();
        } else {

            String message = "There is no Student with id " + id;
            return message;
        }

    }

    @Override
    public void setName(String name) {
        System.out.println("Service Called");
        studentEntity.setName(name);
        // TODO Auto-generated method stub

    }

    @Override
    public void setStudentList(List<Student> list) {

        list.stream().forEach(std -> {
            System.out.println(std.getId() + " " + std.getAddress() + " " + std.getName());
        });
        studentEntity.setStudents(list);

    }

    @Override
    public List<Student> getStudents() {
        // TODO Auto-generated method stub
        return studentEntity.getStudents();
    }

    @Override
    public void setId(int id) {
        System.out.println("Service Called");
        studentEntity.setId(id);
    }

}
