package com.kamal.springframework.guru.spring5demowebapp.repositories;

import com.kamal.springframework.guru.spring5demowebapp.model.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author,Long> {


}
