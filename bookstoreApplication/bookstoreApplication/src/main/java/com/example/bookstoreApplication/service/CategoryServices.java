package com.example.bookstoreApplication.service;

import com.example.bookstoreApplication.entity.BookEntity;
import com.example.bookstoreApplication.entity.CategoryEntity;
import com.example.bookstoreApplication.model.Books;
import com.example.bookstoreApplication.model.Category;
import com.example.bookstoreApplication.model.CategoryRequest;
import com.example.bookstoreApplication.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CategoryServices {
    @Autowired
    private CategoryRepository categoryRepository;

    public void saveCategory(CategoryRequest categoryRequest)
    {
        CategoryEntity categoryEntity = new CategoryEntity();
        categoryEntity.setCategoryName(categoryRequest.getCategoryName());
        categoryRepository.save(categoryEntity);
    }

    public List<Category> getCategory()
    {
        List<CategoryEntity> categoryEntities = new ArrayList<>();
        List<Category> categories = new ArrayList<>();
        categoryEntities = categoryRepository.findAll();
        for (CategoryEntity c : categoryEntities)
        {
            Category category = new Category();
            category.setId(c.getId());
            category.setCategoryName(c.getCategoryName());
            categories.add(category);
        }
        return categories;
    }

    public Category getcategorybyid(Long id) {
        CategoryEntity categoryEntity = categoryRepository.getReferenceById(id);
        Category category = new Category();
        category.setId(categoryEntity.getId());
        category.setCategoryName(categoryEntity.getCategoryName());
        return category;
    }

//    public void deletecategorybyid(Long categoryId) {
//        categoryRepository.deleteById(categoryId);
//    }
//
//    public void deleteallcategory() {
//        categoryRepository.deleteAll();
//    }

    public void updatecategorybyid(Long categoryId, CategoryRequest categoryRequest) {
        CategoryEntity categoryEntity = categoryRepository.getReferenceById(categoryId);
        categoryEntity.setId(categoryId);
        categoryEntity.setCategoryName(categoryRequest.getCategoryName());
        categoryRepository.saveAndFlush(categoryEntity);
    }
}
