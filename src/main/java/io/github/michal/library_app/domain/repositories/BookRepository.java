package io.github.michal.library_app.domain.repositories;

import io.github.michal.library_app.domain.model.Book;

public interface BookRepository {

    Book save(Book entity);
    
} 
