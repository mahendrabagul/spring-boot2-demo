package info.mahendrabagul.artajaspringboot1.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Book {

	@Column(nullable = false)
	private String author;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Column(nullable = false, unique = true)
	private String title;

	public String getAuthor() {
		return author;
	}

	public long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setTitle(String title) {
		this.title = title;
	}
}