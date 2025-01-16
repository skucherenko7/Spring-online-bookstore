package mate.academy.demo;

import java.math.BigDecimal;
import mate.academy.demo.model.Book;
import mate.academy.demo.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BookstoreApplication {

    @Autowired
private BookService bookService;

    public static void main(String[] args) {
        SpringApplication.run(BookstoreApplication.class, args);
    }

    @Bean
public CommandLineRunner commandLineRunner() {
        return args -> {
            Book book = new Book();
            book.setTitle("Title Book");
            book.setAuthor("Author Name");
            book.setIsbn("12345678");
            book.setPrice(new BigDecimal("100.98"));
            book.setDescription("This is the best book");
            book.setCoverImage("cover.jpg");
            bookService.saveBook(book);
            System.out.println("Book saved: " + book.getTitle());
        };
    }
}
