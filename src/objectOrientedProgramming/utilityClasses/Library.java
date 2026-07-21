package objectOrientedProgramming.utilityClasses;

public class Library {
    Book [] books;
    String name;
    int year;

    public Library(Book[] books , String name, int year ) {
        this.books = books;
        this.name = name;
        this.year = year;
    }

    public void displayBooks() {
        System.out.println("The " + this.year + " " + this.name );
        System.out.println("Available Books:");
        for (Book book : books) {
            System.out.println(book.displayInfo());
        }
    }
}
