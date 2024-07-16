package com.example.bookstoreApplication.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.sql.Time;
import java.sql.Timestamp;

@Entity
@Table(name = "books")
public class BookEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @CreationTimestamp
    private Timestamp createdAt;

    @UpdateTimestamp
    private Timestamp updatedAt;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "author", nullable = false)
    private String author;

    @Column(name = "price", nullable = false)
    private int price;

    @Column(name = "description")
    private String description;

    @Column(name = "category_id", nullable = false)
    private Long categoryId;

    @ManyToOne
    @JoinColumn(name = "category_id", referencedColumnName = "id", insertable = false, updatable = false, nullable = false)
    private CategoryEntity categoryEntity;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CategoryEntity getCategoryEntity() {
        return categoryEntity;
    }

    public void setCategoryEntity(CategoryEntity categoryEntity) {
        this.categoryEntity = categoryEntity;
    }

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    @Override
    public String toString() {
        return "BookEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                ", categoryId=" + categoryId +
                ", categoryEntity=" + categoryEntity +
                '}';
    }
}
