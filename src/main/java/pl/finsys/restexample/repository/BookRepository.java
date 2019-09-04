package pl.finsys.restexample.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import pl.finsys.restexample.domain.Book;

public interface BookRepository extends JpaRepository<Book, Long> {
}