package projectLibrary.bookstore.controller;

import java.util.List;
import java.util.Optional;

//import org.hibernate.cfg.Environment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import projectLibrary.bookstore.DTO.Books;
import projectLibrary.bookstore.repository.BooksRepository;

@RestController
public class Controller {
	//@Autowired
	//private Environment environment;
	@Autowired
	private BooksRepository booksRepo;

	@GetMapping("/allbooks")
	public List<Books> allbooks() {
		return booksRepo.findAll();
	}
	@GetMapping("/books/{bookid}")
	public Optional<Books> specificBook(@PathVariable String bookid ) {
		return booksRepo.findById(bookid);
	}
	@PostMapping("/books/borrow")
	public List<Books> borrowBooks(@RequestBody Books books) {
		booksRepo.save(books);
		return booksRepo.findAll();
	}
	
	/*@GetMapping("/books/{studentno}")
	public Optional<Books> booksByStudent(@PathVariable int studentno) {
		Optional<Books> optbooks =  booksRepo.findAllBooksByStudent(studentno);
		optbooks.setPort(Integer.parseInt(environment.getProperties("local.server.port")));
		return optbooks;
		
	}*/
}
