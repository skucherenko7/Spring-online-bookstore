package mate.academy.demo.service;

import java.util.List;
import lombok.RequiredArgsConstructor;
import mate.academy.demo.model.Book;
import mate.academy.demo.repository.BookRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BookServiceImpl implements BookService {
    private final BookRepository bookRepository;

    @Override
    public Book saveBook(Book book) {
        return bookRepository.save(book);
    }

    @Override
    public List<Book> findAllBooks() {
        return bookRepository.findAll();
    }
}
