package io.github.michal.library_app.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import io.github.michal.library_app.model.Book;

public interface SqlBookRepository extends BookRepository ,JpaRepository<Book,Integer> {

}
