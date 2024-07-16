package com.example.bookstoreApplication.model;

public class BookRequest {

    private String name;
    private String description;
    private String author;
    private Long categoryId;
    private int price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "BookRequest{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", author='" + author + '\'' +
                ", categoryId=" + categoryId +
                ", price=" + price +
                '}';
    }
}
