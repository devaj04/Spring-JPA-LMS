package com.trigyn.jpalms.service;

import com.trigyn.jpalms.entity.BookEntity;
import com.trigyn.jpalms.model.Book;
import com.trigyn.jpalms.repository.LibraryManagementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LibraryManagementService {

    @Autowired
    private LibraryManagementRepository libraryManagementRepository;

    public List<Book> findBookByUserId(Long id) {
        List<Book> bookList = new ArrayList<>();
        List<BookEntity> bookEntities = libraryManagementRepository.findStudentById(id);
        for (BookEntity bookEntity : bookEntities) {
            bookList.add(convertBook(bookEntity));
        }
        return bookList;
    }

    public List<Book> getAllBookDetails() {
        List<Book> bookList = new ArrayList<>();
        for (BookEntity bookEntity : libraryManagementRepository.findAll()) {
            bookList.add(convertBook(bookEntity));
        }
        return bookList;
    }

    private Book convertBook(BookEntity bookEntity) {
        Book book = new Book();
        book.setId(bookEntity.getId());
        book.setBookAuthor(bookEntity.getBookAuthor());
        book.setBookTitle(bookEntity.getBookTitle());
        book.setUserIssued(bookEntity.getUserIssued());
        book.setIssueDate(bookEntity.getIssueDate());
        book.setReturnDate(bookEntity.getReturnDate());
        return book;
    }

    public Boolean saveBook(Book book) {
        BookEntity bookEntity = convertBookEntity(book);
        try {
            libraryManagementRepository.save(bookEntity);
            return true;
        } catch (Exception e) {
            System.out.print("Exception during the save the data in db");
            return false;
        }
    }

    private BookEntity convertBookEntity(Book book) {
        BookEntity bookEntity = new BookEntity();
        bookEntity.setId(book.getId());
        bookEntity.setBookAuthor(book.getBookAuthor());
        bookEntity.setBookTitle(book.getBookTitle());
        bookEntity.setUserIssued(book.getUserIssued());
        bookEntity.setIssueDate(book.getIssueDate());
        bookEntity.setReturnDate(book.getReturnDate());
        return bookEntity;
    }

    public Boolean deleteBook(Long id) {
        if (id == null) {
            return false;
        } else {
            try{
                libraryManagementRepository.deleteById(id);
            }catch (Exception e){
                System.out.println("Data not found");
            }
        }
        return true;
    }

    public Boolean updateBook(Book book) {
        return saveBook(book);
    }
}
