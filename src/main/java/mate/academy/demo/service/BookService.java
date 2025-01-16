package mate.academy.demo.service;

import java.util.List;
import mate.academy.demo.model.Book;

public interface BookService {
    Book saveBook(Book book);

    List<Book> findAllBooks();
}
