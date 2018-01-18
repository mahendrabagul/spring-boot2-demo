package info.mahendrabagul.artajaspringboot1.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import info.mahendrabagul.artajaspringboot1.data.BookRepository;
import info.mahendrabagul.artajaspringboot1.exception.BookIdMismatchException;
import info.mahendrabagul.artajaspringboot1.model.Book;

@RestController
@RequestMapping("/api/books")
public class BookController {

	@Autowired
	private BookRepository bookRepository;

	@GetMapping
	public Iterable<Book> findAll() {
		return bookRepository.findAll();
	}

	@GetMapping("/title/{bookTitle}")
	public List<Book> findByTitle(@PathVariable String bookTitle) {
		return bookRepository.findByTitle(bookTitle);
	}

	@GetMapping("/{id}")
	public Book findOne(@PathVariable Long id) {
		return bookRepository.findOne(id);
	}

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Book create(@RequestBody Book book) {
		return bookRepository.save(book);
	}

	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id) {
		bookRepository.delete(id);
	}

	@PutMapping("/{id}")
	public Book updateBook(@RequestBody Book book, @PathVariable Long id) {
		if (book.getId() != id) {
			throw new BookIdMismatchException();
		}
		return bookRepository.save(book);
	}
}