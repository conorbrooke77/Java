package CA;

public class Library { // Instead of the user inputing the data I manualy entered the data.
    public static void main(String[] args) {
        Book book1 = new Book("Harry Potter and the Goblet of Fire", "JK Rowling", "fantasy");
        System.out.println(book1.toString());
        System.out.println(Book.getNoOfBooks() + "\n");

        Book book2 = new Book("Coraline", "Neil Gaiman", "Horror");
        book2.Borrow();
        System.out.println(book2.toString());
        System.out.println(Book.getNoOfBooks() + "\n");

        Book book3 = new Book("Thinking, Fast and Slow", "Daniel Kahneman", "Psychology");
        System.out.println(book3.toString());
        System.out.println(Book.getNoOfBooks() + "\n");
    }
}
