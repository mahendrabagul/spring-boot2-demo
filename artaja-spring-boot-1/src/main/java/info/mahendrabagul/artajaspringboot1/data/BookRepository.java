package info.mahendrabagul.artajaspringboot1.data;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import info.mahendrabagul.artajaspringboot1.model.Book;

public interface BookRepository extends CrudRepository<Book, Long> {
	List<Book> findByTitle(String title);

	Optional<Book> findOne(long id);
}