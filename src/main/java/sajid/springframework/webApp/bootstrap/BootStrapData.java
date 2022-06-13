package sajid.springframework.webApp.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import sajid.springframework.webApp.domain.Author;
import sajid.springframework.webApp.domain.Book;
import sajid.springframework.webApp.domain.Publisher;
import sajid.springframework.webApp.repository.AuthorRepository;
import sajid.springframework.webApp.repository.BookRepository;
import sajid.springframework.webApp.repository.PublisherRepository;

@Component
public class BootStrapData implements CommandLineRunner {
    private AuthorRepository authorRepository;
    private BookRepository bookRepository;
    private PublisherRepository publisherRepository;

    public BootStrapData(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository){
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Data insertion started...");
        Publisher publisher = new Publisher("Mirpur DOHS","Mirpur","Dhaka","1226");
        publisherRepository.save(publisher);

        Author authorOne = new Author("Osman","Sajid");
        Book bookOne = new Book("Learning new things","123456");
        authorOne.getBooks().add(bookOne);
        bookOne.getAuthors().add(authorOne);
        bookOne.setPublisher(publisher);
        publisher.getBooks().add(bookOne);
        authorRepository.save(authorOne);
        bookRepository.save(bookOne);
        publisherRepository.save(publisher);

        Author authorTwo = new Author("Swapnil","Biswas");
        Book bookTwo = new Book("Doing new things","456789");
        authorTwo.getBooks().add(bookTwo);
        bookTwo.getAuthors().add(authorTwo);
        publisher.getBooks().add(bookTwo);
        bookTwo.setPublisher(publisher);

        authorRepository.save(authorTwo);
        bookRepository.save(bookTwo);
        publisherRepository.save(publisher);
        System.out.println("Number of books: "+bookRepository.count());
        System.out.println("Number of books for publisher: "+publisher.getBooks().size());
    }
}
