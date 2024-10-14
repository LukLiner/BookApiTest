package com.example.demo.BookApi.Reposytory;

import com.example.demo.BookApi.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface BookReposytory  extends JpaRepository<Book, Long> {
}
