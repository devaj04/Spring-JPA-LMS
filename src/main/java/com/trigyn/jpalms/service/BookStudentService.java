package com.trigyn.jpalms.service;

import com.trigyn.jpalms.entity.BookStudent;
import com.trigyn.jpalms.model.BookStudentVO;
import com.trigyn.jpalms.repository.BookStudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class BookStudentService {

    @Autowired
    private BookStudentRepository bookStudentRepository;

    public List<BookStudentVO> getAllStudentDetails(){
        List<BookStudentVO> bookStudentList = new ArrayList<>();
        for(BookStudent bookStudent : bookStudentRepository.findAll()){
            bookStudentList.add(convertStudentVO(bookStudent));
        }
        return bookStudentList;
    }

    private BookStudentVO convertStudentVO(BookStudent bookStudent){
        BookStudentVO bookStudentVO = new BookStudentVO();
        bookStudentVO.setId(bookStudent.getId());
        bookStudentVO.setUserName(bookStudent.getUserName());
        bookStudentVO.setBookName(bookStudent.getBookName());
        bookStudentVO.setFine(bookStudent.getFine());
        bookStudentVO.setPeriod(bookStudent.getPeriod());
        bookStudentVO.setIssueDate(bookStudent.getIssueDate());
        bookStudentVO.setReturnDate(bookStudent.getReturnDate());
        return  bookStudentVO;
    }

    public Boolean saveStudent(BookStudentVO bookStudentVO){
        BookStudent bookStudent = convertStudentEntity(bookStudentVO);
        try {
            bookStudentRepository.save(bookStudent);
            return true;
        }catch (Exception e){
            System.out.printf("Exception during the save the data in db");
            return false;
        }
    }

    private BookStudent convertStudentEntity(BookStudentVO bookStudentVO) {
        BookStudent bookStudent = new BookStudent();
        bookStudent.setId(bookStudentVO.getId());
        bookStudent.setUserName(bookStudentVO.getUserName());
        bookStudent.setBookName(bookStudentVO.getBookName());
        bookStudent.setFine(bookStudentVO.getFine());
        bookStudent.setPeriod(bookStudentVO.getPeriod());
        bookStudent.setIssueDate(bookStudentVO.getIssueDate());
        bookStudent.setReturnDate(bookStudentVO.getReturnDate());
        return bookStudent;
    }

    public List<BookStudentVO> findStudentByUserName(String userName){
        List<BookStudentVO> bookStudentVOList = new ArrayList<>();
        List<BookStudent> bookStudent= bookStudentRepository.findStudentByUserName(userName);
        for(BookStudent student : bookStudent){
            bookStudentVOList.add(convertStudentVO(student));
        }
        return bookStudentVOList;
    }
}
