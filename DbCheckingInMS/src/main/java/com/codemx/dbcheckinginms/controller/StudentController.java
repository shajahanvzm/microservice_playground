package com.codemx.dbcheckinginms.controller;

import com.codemx.dbcheckinginms.dto.ContactDto;
import com.codemx.dbcheckinginms.entity.Student;
import com.codemx.dbcheckinginms.service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/students")
@AllArgsConstructor
public class StudentController {

    private StudentService studentService;

    @Autowired
    private ContactDto contactDto;

    @PostMapping
    public Student saveStudent(@RequestBody Student student){
        return studentService.saveStudent(student);
    }

    @GetMapping
    public List<Student> getAllStudents(){
        return  studentService.findAll();
    }

}
