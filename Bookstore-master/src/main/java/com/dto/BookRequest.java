package com.dto;

import jakarta.validation.constraints.*;
import lombok.Data;
import java.time.LocalDate;

@Data
public class BookRequest {
    @NotBlank
    private String title;

    @NotBlank
    private String author;

    @NotBlank
    private String category;

    @Positive
    private Double price;

    @DecimalMin("0.0") @DecimalMax("5.0")
    private Double rating;

    @PastOrPresent
    private LocalDate publishedDate;
}