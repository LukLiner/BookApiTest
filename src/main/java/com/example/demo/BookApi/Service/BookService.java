package com.example.demo.BookApi.Service;

import com.example.demo.BookApi.Reposytory.BookReposytory;
import com.example.demo.BookApi.entity.Book;
import com.example.demo.Exeption.ResourceNotFoundException;
import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;

import java.util.List;

public class BookService {
    private final BookReposytory bookReposytory;
    public BookService(BookReposytory bookReposytory) {
        this.bookReposytory = bookReposytory;
    }

    public List<Book> getAllBooks() {
        return bookReposytory.findAll();
    }
    public Book getBookById(long id) {
        return bookReposytory.getReferenceById(id);
    }
    public Book addBook(Book book) {
        return bookReposytory.save(book);
    }
    public Book updateBook(long id,Book newBookData) {
        return bookReposytory.findById(id).
                map(book->{
                    book.setTitle(newBookData.getTitle());
                    book.setAuthor(newBookData.getAuthor());
                    book.setPublisher(newBookData.getPublisher());
                    book.setIsbn(newBookData.getIsbn());
                    return bookReposytory.save(book);
                }).orElseThrow(()->new ResourceNotFoundException("Book Not Found"));
    }
    public void deleteBook(long id) {
        bookReposytory.deleteById(id);
    }
}
