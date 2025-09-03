package oops_concept;

class Book {
    private String title;
    private String author;
    private double price;

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void displayDetails() {
        System.out.println("Book Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
}

public class oops3 {
    public static void main(String[] args) {
        Book b = new Book("Java Programming", "James Gosling", 450.50);
        b.displayDetails();
    }
}
