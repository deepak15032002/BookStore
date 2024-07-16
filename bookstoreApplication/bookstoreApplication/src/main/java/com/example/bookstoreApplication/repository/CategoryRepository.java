package com.example.bookstoreApplication.repository;

import com.example.bookstoreApplication.entity.CategoryEntity;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<CategoryEntity, Long> {

}
