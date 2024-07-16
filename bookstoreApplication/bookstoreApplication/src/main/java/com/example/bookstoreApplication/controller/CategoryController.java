package com.example.bookstoreApplication.controller;

import com.example.bookstoreApplication.entity.CategoryEntity;
import com.example.bookstoreApplication.model.BookRequest;
import com.example.bookstoreApplication.model.Books;
import com.example.bookstoreApplication.model.Category;
import com.example.bookstoreApplication.model.CategoryRequest;
import com.example.bookstoreApplication.service.CategoryServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@RestController
public class CategoryController {
//
//    @Autowired
//    private CategoryServices categoryServices;

//    @GetMapping(value = "/getcategory")
//    public List<Category> getCategory(CategoryRequest categoryRequest)
//    {
//        return categoryServices.getCategory();
//    }
//
//
//    @GetMapping(value = "/getcategory/{id}")
//    public Category getcategorybyid(@PathVariable("id") Long bookId)
//    {
//        return categoryServices.getcategorybyid(bookId);
//    }

//    @GetMapping(value = "/deletecategory/{id}")
//    public String deletecategorybyid(@PathVariable("id") Long categoryId)
//    {
//        categoryServices.deletecategorybyid(categoryId);
//        return "successfully deleted";
//    }
//
//    @GetMapping(value = "/deleteallcategory")
//    public String deleteAll()
//    {
//        categoryServices.deleteallcategory();
//
//        return "Successfully deleted All Data";
//    }

//    @PutMapping(value = "/updatecategorybyid/{id}")
//    public String updatecategorybyid(@PathVariable("id") Long categoryId, @RequestBody CategoryRequest categoryRequest)
//    {
//        categoryServices.updatecategorybyid(categoryId, categoryRequest);
//        return "Updation successfull";
//    }
//
//    @PostMapping(value = "/savecategory")
//    public String updateCategory(@RequestBody CategoryRequest categoryRequest) {
//        categoryServices.saveCategory(categoryRequest);
//        return "updation successful";
//    }

}
