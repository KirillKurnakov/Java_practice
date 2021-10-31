import java.lang.*;
public class TestBook {
    public static void main(String[] args) {
        Book b1 = new Book("Woe from Mind",145);
        Book b2 = new Book("Captain's daughter",480);
        Book b3 = new Book();
        b3.setPage(1300);
        b3.setName("War and Peace");
        System.out.println(b3);
        System.out.println(b2);
        System.out.println(b1);
    }
}
