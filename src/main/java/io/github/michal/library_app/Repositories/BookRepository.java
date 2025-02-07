package io.github.michal.library_app.Repositories;

import io.github.michal.library_app.model.Book;

public interface BookRepository {

    Book save(Book entity);
    
} 
