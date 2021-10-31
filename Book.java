import java.lang.*;

public class Book {
    private String name;
    private int Pages;

    public Book(String n, int a) {
        name = n;
        Pages = a;
    }

    public Book () {
        name = "";
        Pages = 0;
    }

    public void setPage (int Pages) {
        this.Pages = Pages;
    }

    public void setName (String name) {
        this.name = name;
    }

    public String getName () {
        return name;
    }

    public int getPages() {
        return Pages;
    }

    public String toString () {
        return this.name + ", Pages " + this.Pages;
    }
}