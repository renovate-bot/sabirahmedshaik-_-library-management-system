package com.sabir.springboot.services;

import com.sabir.springboot.dto.BookDto;

import java.util.List;

public interface BookService {
    BookDto createBook(BookDto bookDto);
    List<BookDto> getBooks();
    BookDto getBookById(Long bookId);
}
