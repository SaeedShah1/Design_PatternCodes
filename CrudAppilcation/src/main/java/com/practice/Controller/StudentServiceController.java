package com.practice.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.practice.Entity.Student;
import com.practice.ServiceImpl.StudentServiceImpl;

@RestController
public class StudentServiceController {

    @Autowired
    StudentServiceImpl studentServiceImpl;

    @GetMapping(value = "/getStudentName")
    public ResponseEntity getName(@RequestParam int id) {

        try {

            String name = studentServiceImpl.getName(id);
          if(!name.isEmpty()){
            return new ResponseEntity<>(name,HttpStatus.OK);
          }else{
            return new ResponseEntity<>(name,HttpStatus.NO_CONTENT);
          }
            
        

        } catch (Exception e) {
            e.printStackTrace();
            return new ResponseEntity<>("Issue",HttpStatus.BAD_REQUEST);
        }

    }

    @GetMapping(value = "/getStudents")
    public List<Student> getAll() {

        try {

            return studentServiceImpl.getStudents();

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

    }

    @PostMapping(value = "/setStudentName")
    public String setStudentName(@RequestParam String name) {
        try {
            studentServiceImpl.setName(name);
            return "Name updated";

        } catch (Exception e) {
            return "Exception Occured";
            // TODO: handle exception
        }

    }

    @PostMapping(value = "/setStudents")
    public String setStudents(@RequestBody List<Student> list) {
        try {

            studentServiceImpl.setStudentList(list);
            return "Students added";

        } catch (Exception e) {
            return "Exception Occured";
            // TODO: handle exception
        }

    }

    @PostMapping(value = "/setStudentId")
    public String setStudentID(@RequestParam int id) {
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
