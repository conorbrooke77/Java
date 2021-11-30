package Lab9.Question1;

import java.util.Scanner;

public class Driver {
    private static LibraryItem[] libraryItems = new LibraryItem[4];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        for (int i = 0; i < libraryItems.length; i++) {

            System.out.println("What Item would you like to add?\nBook Or CD");
            String choice = sc.nextLine();
            
            System.out.println("Enter the type: ");
            String type = sc.nextLine();

            System.out.println("Enter the ID: ");
            String ID = sc.nextLine();      

            System.out.println("Enter the Total Days To Loan: ");
            int totalDaysToLoan = sc.nextInt();
            sc.nextLine();

            System.out.println("Enter the title of the "+ choice + ": ");
            String title = sc.nextLine(); 

            if (choice.toLowerCase().equals("book")) {
                System.out.println("Enter the Author of the book: ");
                String author = sc.nextLine();

                System.out.println("Enter the Number of Pages in the book: ");
                int numPages = sc.nextInt();
                sc.nextLine();

                libraryItems[i] = new Book(type, ID, author, title, numPages);
                Book b = (Book) libraryItems[i];

                System.out.println("\nThe loan amount: " + b.calculatePrice(totalDaysToLoan));

            } else if (choice.toLowerCase().equals("cd")) {

                System.out.println("Enter the Band of the CD: ");
                String band = sc.nextLine();

                System.out.println("Enter the Number of Tracks of the CD: ");
                int numTracks= sc.nextInt();
                sc.nextLine();

                libraryItems[i] = new CD(type, ID, band, title, numTracks);
                CD cd = (CD) libraryItems[i];

                System.out.println("The loan amount: " + cd.calculatePrice(totalDaysToLoan));
            }

            System.out.print(libraryItems[i].toString() +"\n\n");
        }
        sc.close();
    }
}
