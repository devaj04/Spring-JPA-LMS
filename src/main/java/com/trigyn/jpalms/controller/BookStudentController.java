package com.trigyn.jpalms.controller;

import com.trigyn.jpalms.model.BookStudentVO;
import com.trigyn.jpalms.service.BookStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookStudentController {

    @Autowired
    private BookStudentService bookStudentService;

    @GetMapping("/student")
    public List<BookStudentVO> getAllStudentDetails(@RequestParam(required = false) String name){
        if(name!=null){
            return bookStudentService.findStudentByUserName(name);
        }else {
            return bookStudentService.getAllStudentDetails();
        }
    }

    @PostMapping("/student")
    public Boolean saveStudent(@RequestBody BookStudentVO bookStudentVO){
        return bookStudentService.saveStudent(bookStudentVO);
    }
}
