package com.example.bookstoreApplication.service;

import com.example.bookstoreApplication.entity.BookEntity;
import com.example.bookstoreApplication.model.BookRequest;
import com.example.bookstoreApplication.model.Books;
import com.example.bookstoreApplication.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookServices {
    @Autowired
    private BookRepository bookRepository;

    public List<Books> getbooks()
    {
        List<Books> booksList = new ArrayList<>();
        List<BookEntity> booksEntity = bookRepository.findAll();
        for(BookEntity be : booksEntity){
            Books books = new Books();
            books.setId(be.getId());
            books.setAuthor(be.getAuthor());
            books.setName(be.getName());
            books.setCategoryId(be.getCategoryId());
            books.setPrice(be.getPrice());
            books.setDescription(be.getDescription());
            booksList.add(books);
        }
        return booksList;
    }


    public Books getbookbyid(Long id) {
        BookEntity bookEntity = bookRepository.getReferenceById(id);
        Books books = new Books();
        books.setId(bookEntity.getId());
        books.setName(bookEntity.getName());
        books.setPrice(bookEntity.getPrice());
        books.setDescription(bookEntity.getDescription());
        books.setAuthor(bookEntity.getAuthor());
        books.setCategoryId(bookEntity.getCategoryId());
        return books;
    }

    public void deletebookbyid(Long id)
    {
        bookRepository.deleteById(id);
    }

    public void savebook(BookRequest book)
    {
        BookEntity bookEntity = new BookEntity();
        bookEntity.setName(book.getName());
        bookEntity.setAuthor(book.getAuthor());
        bookEntity.setCategoryId(book.getCategoryId());
        bookEntity.setPrice(book.getPrice());
        bookEntity.setDescription(book.getDescription());
        bookRepository.save(bookEntity);
    }

    public void updatebookbyid(Long bookId, BookRequest book) {
            BookEntity bookEntity = bookRepository.getReferenceById(bookId);
            bookEntity.setName(book.getName());
            bookEntity.setPrice(book.getPrice());
            bookEntity.setDescription(book.getDescription());
            bookEntity.setAuthor(book.getAuthor());
            bookEntity.setCategoryId(book.getCategoryId());
            bookRepository.saveAndFlush(bookEntity);
    }

    public void deleteallbooks() {
        bookRepository.deleteAll();
    }
}
