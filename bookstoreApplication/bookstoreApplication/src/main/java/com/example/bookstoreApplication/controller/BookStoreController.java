package com.example.bookstoreApplication.controller;

import ch.qos.logback.core.model.Model;
import com.example.bookstoreApplication.entity.BookEntity;
import com.example.bookstoreApplication.model.BookRequest;
import com.example.bookstoreApplication.model.Books;
import com.example.bookstoreApplication.service.BookServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Controller
public class BookStoreController {
    @Autowired
    private BookServices bookServices;


    @GetMapping(value = "/getbookinfo")
    public List<Books> getbookinfo()
    {
        return bookServices.getbooks();
    }


    @GetMapping(value = "/getbookinfo/{id}")
    public Books getbookbyid(@PathVariable("id") Long bookId)
    {
        return bookServices.getbookbyid(bookId);
    }

//    @GetMapping(value = "/deletebookbyid/{id}")
//    public String deletebookbyid(@PathVariable("id") Long bookId)
//    {
//        bookServices.deletebookbyid(bookId);
//        return "successfully deleted";
//    }

//    @GetMapping(value = "/deleteallbooks")
//    public String deleteAll()
//    {
//        bookServices.deleteallbooks();
//
//        return "Successfully deleted All Data";
//    }

    @PutMapping(value = "/updatebookbyid/{id}")
    public String updatebookbyid(@PathVariable("id") Long bookId, @RequestBody BookRequest book)
    {
        bookServices.updatebookbyid(bookId, book);
        return "Updation successfull";
    }

//    @PostMapping(value = "/savebook")
//    public String savbook(@RequestBody BookRequest book)
//    {
//        bookServices.savebook(book);
//        return "successful";
//    }

}
