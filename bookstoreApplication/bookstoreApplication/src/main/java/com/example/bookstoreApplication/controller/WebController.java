package com.example.bookstoreApplication.controller;

import com.example.bookstoreApplication.entity.BookEntity;
import com.example.bookstoreApplication.model.*;
import com.example.bookstoreApplication.service.BookServices;
import com.example.bookstoreApplication.service.CategoryServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;

@Controller
public class WebController {

    @Autowired
    private BookServices bookServices;

    @Autowired
    private CategoryServices categoryServices;

    @GetMapping(value = "/home")
    public String home() {
        return "Home.html";
    }

    @GetMapping(value = "/allbooksandcategories")
    public String allBooks(Model model) {
        List<Books> books = bookServices.getbooks();
        List<Category> categories = categoryServices.getCategory();
        model.addAttribute("books", books);
        model.addAttribute("categories", categories);
        return "AllBooksAndCategories.html";
    }

    @GetMapping(value = "savebook")
    public String saveBook(Model model) {
        model.addAttribute("book", new BookRequest());
        return "SaveBook.html";
    }

    @PostMapping(value = "/savebookinfo")
    public String saveBookInfo(BookRequest book) {
        bookServices.savebook(book);
        return "BookSaveMessage.html";
    }

    @GetMapping(value = "savecategory")
    public String saveCategory(Model model) {
        model.addAttribute("category", new CategoryRequest());
        return "SaveCategory.html";
    }

    @PostMapping(value = "/savecategoryinfo")
    public String updateCategory(CategoryRequest categoryRequest) {
        categoryServices.saveCategory(categoryRequest);
        return "CategorySaveMessage.html";
    }

    @GetMapping(value = "/deletebookbyid")
    public String deletebookbyid(Model model)
    {
        model.addAttribute("book", new BookId());
        return "DeleteBook.html";
    }

    @PostMapping(value = "/deletedbook")
    public String deletebyid(BookId bookId)
    {
        Long id = bookId.getId();
        bookServices.deletebookbyid(id);
        return "BookDeleteMessage.html";
    }

    @GetMapping(value = "/deleteallbooks")
    public String deleteAll()
    {
        bookServices.deleteallbooks();
        return "BookDeleteMessage.html";
    }
}