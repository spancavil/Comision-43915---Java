package com.coderhouse.Relationships.model;

import com.coderhouse.Relationships.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Integer> {
}
