package objectOrientedProgramming;

import objectOrientedProgramming.utilityClasses.Book;
import objectOrientedProgramming.utilityClasses.Library;

public class Aggregation {
    public static void main(String[] args) {

        // AGGREGATION => Represents a "has-a" relationship between objects.
        //                One object contains another object as a part of its structure,
        //                but the contained object/s can exist independently


        Book book1 = new Book("book1", 123);
        Book book2 = new Book("book2", 234);
        Book book3 = new Book("book3", 345);

        Book[] books = {book1, book2, book3};

//        for (Book book : books) {
//            System.out.println(book.displayInfo());
//        }

        Library library = new Library(books,"Pune library", 1947);
        library.displayBooks();

    }
}
