package com.example.bookstoreApplication.entity;

import jakarta.persistence.*;
import org.springframework.boot.autoconfigure.web.WebProperties;

import java.awt.print.Book;
import java.util.List;

@Entity
@Table(name = "category")
public class CategoryEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "category_name", nullable = false)
    private String categoryName;

    @OneToMany(mappedBy = "categoryEntity",fetch = FetchType.LAZY)
    private List<BookEntity> bookEntity;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public List<BookEntity> getBookEntity() {
        return bookEntity;
    }

    public void setBookEntity(List<BookEntity> bookEntity) {
        this.bookEntity = bookEntity;
    }

    @Override
    public String toString() {
        return "CategoryEntity{" +
                "id=" + id +
                ", categoryName='" + categoryName + '\'' +
                ", bookEntity=" + bookEntity +
                '}';
    }
}
