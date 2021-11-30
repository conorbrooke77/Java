package Lab9.Question1;

public class Book extends LibraryItem implements LoanItem {
    private String author;
    private String title;
    private int numPages;

    public Book(String type, String ID, String author, String title, int numPages) {
        super(type, ID);
        //TODO Auto-generated constructor stub

        setAuthor(author);
        setTitle(title);
        setNumPages(numPages);
    }


    public  void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public  void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public  void setNumPages(int numPages) {
        this.numPages = numPages;
    }

    public int getNumPages() {
        return numPages;
    }

    @Override
    public double calculatePrice(int totalDaysToLoan) {
        // TODO Auto-generated method stub
        double reduction = 15; // If a user loans the LibraryItem for less than or equal to 15 days there is none loan amount;
        double totalPrice =0;

        if (totalDaysToLoan >= reduction) {
            reduction = totalDaysToLoan - reduction;
            totalPrice = reduction * 1.2;
        }

        return totalPrice;
    }

    public String toString() {
        return super.toString() + "\nAuthor: "  + author + "\nTitle: " + title + "\nNumber Of Pages: " + numPages;
    }

}
