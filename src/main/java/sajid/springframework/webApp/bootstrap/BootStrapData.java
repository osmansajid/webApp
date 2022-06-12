package sajid.springframework.webApp.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import sajid.springframework.webApp.repository.AuthorRepository;
import sajid.springframework.webApp.repository.BookRepository;

@Component
public class BootStrapData implements CommandLineRunner {
    private AuthorRepository authorRepository;
    private BookRepository bookRepository;

    @Override
    public void run(String... args) throws Exception {

    }
}
