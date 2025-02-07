package io.github.michal.library_app.logic;

import org.springframework.stereotype.Service;

import io.github.michal.library_app.Repositories.BookRepository;
import io.github.michal.library_app.model.Book;
import io.github.michal.library_app.model.dtos.BookReadModel;
import io.github.michal.library_app.model.dtos.BookWriteModel;

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
