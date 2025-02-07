package io.github.michal.library_app.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.michal.library_app.logic.BookService;
import io.github.michal.library_app.model.dtos.BookReadModel;
import io.github.michal.library_app.model.dtos.BookWriteModel;

@RestController
@RequestMapping("/books")
public class BookController {
    private final BookService service;

    public BookController(BookService service) {
        this.service = service;
    }

    @PostMapping
    ResponseEntity<BookReadModel> createBook(@RequestBody BookWriteModel toCreate){
        BookReadModel result = service.createBook(toCreate);
        return ResponseEntity.ok(result);
    }
}
