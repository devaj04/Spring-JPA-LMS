package com.trigyn.jpalms.controller;

import com.trigyn.jpalms.model.Book;
import com.trigyn.jpalms.service.LibraryManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LibraryManagementController {

    @Autowired
    private LibraryManagementService libraryManagementService;

    @GetMapping("/book")
    public List<Book> getBookDetails(@RequestParam(required = false) Long id){
        if(id!=null){
            return libraryManagementService.findBookByUserId(id);
        }else {
            return libraryManagementService.getAllBookDetails();
        }
    }

    @PostMapping("/book")
    public Boolean saveBook(@RequestBody Book book){
        return libraryManagementService.saveBook(book);
    }

    @DeleteMapping("/book")
    public Boolean deleteBook(@RequestParam Long id){
        return libraryManagementService.deleteBook(id);
    }

    @PutMapping("/book")
    public Boolean updateBook(@RequestBody Book book){
        return libraryManagementService.updateBook(book);
    }

}
