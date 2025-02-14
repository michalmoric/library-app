package io.github.michal.library_app.application;

import org.springframework.stereotype.Service;

import io.github.michal.library_app.contract.BookReadModel;
import io.github.michal.library_app.contract.BookWriteModel;
import io.github.michal.library_app.domain.model.Book;
import io.github.michal.library_app.domain.repositories.BookRepository;

@Service
public class BookService {
    private BookRepository repository;

    public BookService(BookRepository repository) {
        this.repository = repository;
    }

    public BookReadModel createBook(final BookWriteModel source){
        Book result = repository.save(source.toBook());
        return new BookReadModel(result);
    }

    

}
