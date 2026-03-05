import java.util.Scanner;

// Publisher class
class Publisher {
    String publisherName;

    Publisher(String publisherName) {
        this.publisherName = publisherName;
    }
}

// Book class inheriting Publisher
class Book extends Publisher {
    String bookTitle;
    String author;

    Book(String publisherName, String bookTitle, String author) {
        super(publisherName);
        this.bookTitle = bookTitle;
        this.author = author;
    }
}

// Literature class inheriting Book
class Literature extends Book {

    Literature(String publisherName, String bookTitle, String author) {
        super(publisherName, bookTitle, author);
    }

    void display() {
        System.out.println("Category: Literature");
        System.out.println("Book Title: " + bookTitle);
        System.out.println("Author: " + author);
        System.out.println("Publisher: " + publisherName);
        System.out.println("---------------------------");
    }
}

// Fiction class inheriting Book
class Fiction extends Book {

    Fiction(String publisherName, String bookTitle, String author) {
        super(publisherName, bookTitle, author);
    }

    void display() {
        System.out.println("Category: Fiction");
        System.out.println("Book Title: " + bookTitle);
        System.out.println("Author: " + author);
        System.out.println("Publisher: " + publisherName);
        System.out.println("---------------------------");
    }
}

// Main class
public class Books {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of books: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {

            System.out.println("\nEnter book title:");
            String title = sc.nextLine();

            System.out.println("Enter author name:");
            String author = sc.nextLine();

            System.out.println("Enter publisher name:");
            String publisher = sc.nextLine();

            System.out.println("Enter category (1-Literature, 2-Fiction):");
            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {
                Literature l = new Literature(publisher, title, author);
                l.display();
            } else if (choice == 2) {
                Fiction f = new Fiction(publisher, title, author);
                f.display();
            } else {
                System.out.println("Invalid category.");
            }
        }

        sc.close();
    }
}