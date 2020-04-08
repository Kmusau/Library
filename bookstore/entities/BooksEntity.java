package projectLibrary.bookstore.DTO;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class BooksEntity {

	@Id
	@Column(name="bookid")
	private String bookId;
	@Column(name="booktitle")
	private String booktitle;
	@Column(name="subject")
	private String subject;
	@Column(name="classform")
	private String classForm;
	@Column(name="namestudent")
	private String nameStudent;
	@Column(name="studentno")
	private int studentNo;
	@Column(name="dateborrowed")
	private Date dateBorrowed;
	@Column(name="datereturned")
	private Date dateReturned;
	
	private int port;
	
	
	public Books() {
		super();
	}
	
	
	public String getBookId() {
		return bookId;
	}


	public void setBookId(String bookId) {
		this.bookId = bookId;
	}


	public String getBooktitle() {
		return booktitle;
	}
	public void setBooktitle(String booktitle) {
		this.booktitle = booktitle;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getClassForm() {
		return classForm;
	}
	public void setClassForm(String classForm) {
		this.classForm = classForm;
	}
	public String getNameStudent() {
		return nameStudent;
	}
	public void setNameStudent(String nameStudent) {
		this.nameStudent = nameStudent;
	}
	public int getStudentNo() {
		return studentNo;
	}
	public void setStudentNo(int studentNo) {
		this.studentNo = studentNo;
	}
	public Date getDateBorrowed() {
		return dateBorrowed;
	}
	public void setDateBorrowed(Date dateBorrowed) {
		this.dateBorrowed = dateBorrowed;
	}
	public Date getDateReturned() {
		return dateReturned;
	}
	public void setDateReturned(Date dateReturned) {
		this.dateReturned = dateReturned;
	}


	public int getPort() {
		return port;
	}


	public void setPort(int port) {
		this.port = port;
	}
	
	
	
	
}
