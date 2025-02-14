package io.github.michal.library_app.infrastructure.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import io.github.michal.library_app.domain.model.Book;
import io.github.michal.library_app.domain.repositories.BookRepository;

public interface SqlBookRepository extends BookRepository ,JpaRepository<Book,Integer> {

}
