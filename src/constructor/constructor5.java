package constructor;

//Problem 2: Book Library System
public class constructor5 {
 static class Book {
     public String ISBN;
     protected String title;
     private String author;

     public Book(String ISBN, String title, String author) {
         this.ISBN = ISBN;
         this.title = title;
         this.author = author;
     }

     public void setAuthor(String author) {
         this.author = author;
     }

     public String getAuthor() {
         return author;
     }
 }

 static class EBook extends Book {
     private String fileFormat;

     public EBook(String ISBN, String title, String author, String fileFormat) {
         super(ISBN, title, author);
         this.fileFormat = fileFormat;
     }

     public void displayDetails() {
         System.out.println("ISBN: " + ISBN + ", Title: " + title + ", Author: " + getAuthor() +
                 ", Format: " + fileFormat);
     }
 }

 public static void main(String[] args) {
     EBook ebook = new EBook("123-456", "Java Programming", "Herbert Schildt", "PDF");
     ebook.displayDetails();
     ebook.setAuthor("James Gosling");
     ebook.displayDetails();
 }
}
