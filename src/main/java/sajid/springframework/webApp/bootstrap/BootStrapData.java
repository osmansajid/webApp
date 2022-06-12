package sajid.springframework.webApp.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import sajid.springframework.webApp.domain.Author;
import sajid.springframework.webApp.domain.Book;
import sajid.springframework.webApp.repository.AuthorRepository;
import sajid.springframework.webApp.repository.BookRepository;

@Component
public class BootStrapData implements CommandLineRunner {
    private AuthorRepository authorRepository;
    private BookRepository bookRepository;

    public BootStrapData(AuthorRepository authorRepository, BookRepository bookRepository){
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Author authorOne = new Author("Osman","Sajid");
        Book bookOne = new Book("Learning new things","123456");
        authorOne.getBooks().add(bookOne);
        bookOne.getAuthors().add(authorOne);
        authorRepository.save(authorOne);
        bookRepository.save(bookOne);

        Author authorTwo = new Author("Swapnil","Biswas");
        Book bookTwo = new Book("Doing new things","456789");
        authorTwo.getBooks().add(bookTwo);
        bookTwo.getAuthors().add(authorTwo);
        authorRepository.save(authorTwo);
        bookRepository.save(bookTwo);
        System.out.println("Number of books: "+bookRepository.count());
    }
}
