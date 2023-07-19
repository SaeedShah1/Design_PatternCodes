package com.practice.ServiceImpl;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.practice.Entity.Student;
import com.practice.Service.StudentSerivce;

@Component
public class StudentServiceImpl implements StudentSerivce {

    @Autowired
    Student studentEntity;
    @Override
    public String getName(int id) {
        
        if(id == studentEntity.getId()){
            System.out.println("Service Called");
            return "This is Student1 and Student's name is :" + studentEntity.getName();
        }else{

            String message = "There is no Student with id " + id;     
         return  message;
        }
    
    }

    @Override
    public void setName(String name) {
        System.out.println("Service Called");
        studentEntity.setName(name);
        // TODO Auto-generated method stub
  
    }

    @Override
    public void setId(int id) {
        System.out.println("Service Called");
        studentEntity.setId(id);
    }
    
}
