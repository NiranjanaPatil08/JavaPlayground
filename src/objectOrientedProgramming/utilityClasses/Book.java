package objectOrientedProgramming.utilityClasses;

public class Book {

    public String title;
    public int pages;

    public Book(String title, int pages) {
        this.title = title;
        this.pages = pages;
    }

    public String displayInfo(){
        return "Title: " + this.title + ", Pages: " + this.pages;
    }
}
