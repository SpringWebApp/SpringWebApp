package com.kamal.springframework.guru.spring5demowebapp.bootstrap;


import com.kamal.springframework.guru.spring5demowebapp.model.Author;
import com.kamal.springframework.guru.spring5demowebapp.model.Book;
import com.kamal.springframework.guru.spring5demowebapp.model.Publisher;
import com.kamal.springframework.guru.spring5demowebapp.repositories.AuthorRepository;
import com.kamal.springframework.guru.spring5demowebapp.repositories.BookRepository;
import com.kamal.springframework.guru.spring5demowebapp.repositories.PublisherRepository;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {

    private AuthorRepository authorRepository;
    private BookRepository bookRepository;
    private PublisherRepository publisherRepository;

    public DevBootstrap(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository
                        publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        initData();
    }

    private void initData() {

        Author auth1 = new Author("J.K.","Rowling");
        Publisher pb1 = new Publisher("Scholastic Publications","Los Angeles",
                "California","95051");
        Book b1 = new Book("Harry Potter","HP001",pb1);

        auth1.getBooks().add(b1);
        b1.getAuthors().add(auth1);

        authorRepository.save(auth1);
        publisherRepository.save(pb1);
        bookRepository.save(b1);

        Author auth2 = new Author("Paulo","Coelho");
        Publisher pb2 = new Publisher("Penguin House","Dallas","Texas","78729");
        Book b2 = new Book("Alchemist","AC001",pb2);

        auth2.getBooks().add(b2);
        b2.getAuthors().add(auth2);

        authorRepository.save(auth2);
        publisherRepository.save(pb2);
        bookRepository.save(b2);


    }
}
