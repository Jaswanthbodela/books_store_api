package com.service;

import com.dto.BookRequest;
import com.exception.BookNotFoundException;
import com.model.Book;
import com.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BookService {
    private final BookRepository bookRepository;

    public Book createBook(Book request) {
        Book book = new Book();
        book.setTitle(request.getTitle());
        book.setAuthor(request.getAuthor());
        book.setCategory(request.getCategory());
        book.setPrice(request.getPrice());
        book.setRating(request.getRating());
        book.setPublishedDate(request.getPublishedDate());
        return bookRepository.save(book);
    }

    public Page<Book> filterBooks(String author, String category, Double rating, int page, int size) {
        return bookRepository.findByAuthorContainingOrCategoryContainingOrRatingGreaterThanEqual(
                author, category, rating, PageRequest.of(page, size)
        );
    }

    public Book updateBook(Long id, BookRequest request) {
        Book book = bookRepository.findById(id)
                .orElseThrow(() -> new BookNotFoundException(id));

        book.setTitle(request.getTitle());
        book.setAuthor(request.getAuthor());
        book.setCategory(request.getCategory());
        book.setPrice(request.getPrice());
        book.setRating(request.getRating());
        book.setPublishedDate(request.getPublishedDate());
        return bookRepository.save(book);
    }
}