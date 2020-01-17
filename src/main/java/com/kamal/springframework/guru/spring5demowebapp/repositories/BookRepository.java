package com.kamal.springframework.guru.spring5demowebapp.repositories;

import com.kamal.springframework.guru.spring5demowebapp.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {

}
