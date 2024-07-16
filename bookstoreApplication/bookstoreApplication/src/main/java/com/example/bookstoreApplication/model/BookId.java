package com.example.bookstoreApplication.model;

public class BookId {
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "BookId{" +
                "id=" + id +
                '}';
    }
    
}
