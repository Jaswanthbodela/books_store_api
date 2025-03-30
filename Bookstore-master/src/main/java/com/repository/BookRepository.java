package com.repository;

import com.model.Book;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface BookRepository extends JpaRepository<Book, Long> {
    @Query("SELECT b FROM Book b WHERE " +
            "(:author IS NULL OR b.author LIKE %:author%) AND " +
            "(:category IS NULL OR b.category LIKE %:category%) AND " +
            "(:rating IS NULL OR b.rating >= :rating)")
    Page<Book> findByAuthorContainingOrCategoryContainingOrRatingGreaterThanEqual(
            @Param("author") String author,
            @Param("category") String category,
            @Param("rating") Double rating,
            Pageable pageable
    );
}