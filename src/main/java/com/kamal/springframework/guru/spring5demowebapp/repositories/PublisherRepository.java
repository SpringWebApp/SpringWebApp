package com.kamal.springframework.guru.spring5demowebapp.repositories;

import com.kamal.springframework.guru.spring5demowebapp.model.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher,Long> {

}
