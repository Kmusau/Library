package projectLibrary.bookstore.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import projectLibrary.bookstore.DTO.Books;

public interface BooksRepository extends JpaRepository<Books, String> {

	Optional<Books> findAllBooksByStudent(int studentno);
	

}
