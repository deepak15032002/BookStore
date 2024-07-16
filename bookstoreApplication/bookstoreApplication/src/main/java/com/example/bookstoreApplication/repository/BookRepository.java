package com.example.bookstoreApplication.repository;

import com.example.bookstoreApplication.entity.BookEntity;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
//@Qualifier("book_store")
@Repository
public interface BookRepository extends JpaRepository<BookEntity, Long> {
}
