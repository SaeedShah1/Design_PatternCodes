package com.practice.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.practice.ServiceImpl.StudentServiceImpl;



@RestController
public class StudentServiceController {
    
@Autowired
StudentServiceImpl studentServiceImpl;

    @GetMapping(value ="/getStudentName")
    public String getName(@RequestParam int id){

        try{
        
          String name =  studentServiceImpl.getName(id);
          return name;

        }
        catch(Exception e){
            e.printStackTrace();
            return "Exception Occured";
        }
       
    }

    @PostMapping(value = "/setStudentName")
    public String setStudentName(@RequestParam String name){
        try {
            studentServiceImpl.setName(name);
            return "Name updated";
            
        } catch (Exception e) {
            return "Exception Occured";
            // TODO: handle exception
        }
       

    }

    @PostMapping(value = "/setStudentId")
    public String setStudentID(@RequestParam int id){
        try {
            System.out.println(id);
            studentServiceImpl.setId(id);
            return "ID updated";
            
        } catch (Exception e) {
            return "Exception Occured";
            // TODO: handle exception
        }
       

    }

}
