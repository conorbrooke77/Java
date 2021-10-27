package CA;

public class Book {
    private static int noOfBooksCreated;

    private char status = 'A'; // A for available / B for borrowed;
    private String name;
    private String author;
    private String genre;
    private int ISBN;

    public Book(String name, String author, String genre) {
        ++noOfBooksCreated;
        ISBN = getNoOfBooks();

        setName(name);
        setAuthor(author);
        setGenre(genre);
    }

    public void Borrow() {
        status = 'B';
    }

    public static int getNoOfBooks() {
        return noOfBooksCreated;
    }
    public String toString() {
        return "The name: " + name  + "\n" + "The Author: " + author + "\n" + "The Genre: " + genre + "\n" + "The ISBN: " + ISBN + "\n" + "Status: " + status;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setName(String name) {
        this.name = name;
    }
	public void setStatus(char status)
	{
		this.status = status;
	}

    public char getStatus() {
        return status;
    }
    public String getName(String name) {
        return name;
    }

    public String getAuthor(String author) {
        return author;
    }

    public String getGenre(String genre) {
        return genre;
    }
}
