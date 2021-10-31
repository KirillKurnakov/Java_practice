package JavaPractice2;
import java.util.Scanner;

public class TestAuthor {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.println("Введите имя,почту и пол автора книги");
        String name = in.nextLine();
        String email = in.nextLine();
        char gender = in.next().charAt(0);
        //in.close();
        Author b1 = new Author(name,email,gender);
        //Author b1 = new Author("James","James123@mail.ru",'M');

        System.out.println(b1.toString());
        System.out.print("Имя автора - ");System.out.println(b1.getName());
        System.out.print("Почта автора - ");System.out.println(b1.getEmail());
        System.out.print("Пол автора - ");System.out.println(b1.getGender());
        System.out.println("Есть возможность поменять почту! Задайте новую!");
        in.nextLine();
        String email1 = in.nextLine();
        b1.setEmail(email1);
        System.out.println(b1.toString());
    }
}