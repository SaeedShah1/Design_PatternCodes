package com.practice.Entity;

import java.util.List;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Component
public class Student {

    private Integer id;
    private String name;
    private String address;
    private List<Student> students;
    
}
