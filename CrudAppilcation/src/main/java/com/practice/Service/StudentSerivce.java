package com.practice.Service;

import java.util.List;

import com.practice.Entity.Student;

public interface StudentSerivce {

    public String getName(int id);
    public void setName(String name);

    public void setId(int id);
    public void setStudentList(List<Student> students);
    public List<Student> getStudents();

    
}
