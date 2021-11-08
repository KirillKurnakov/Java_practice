import java.awt.*;
import java.util.*;
import java.util.List;

public class Main {

    public static void main(String[] args) {

	    String earth = new String("Земля");
        String venus = new String("Венера");
        String mars = new String ("Марс");
        String jupiter = new String ("Юпитер");
        String mercuri = new String ("Меркурий");

        List<String> ArrayList_m = new ArrayList<String> (Arrays.asList(earth, venus, mars,jupiter,mercuri)); // модифицируемый список солнечной системы
        List<String> ArrayList_not_m = Collections.unmodifiableList(new ArrayList<String>(ArrayList_m)); // немодифицируемый список солнечной системы
        System.out.println("Исходный список: " + ArrayList_not_m + "\n");
        Scanner in = new Scanner(System.in);

        System.out.println("Добавление элемента\n");
        System.out.println("Исходный список: " + ArrayList_not_m + "\n");
        System.out.println("Введите элемент, который хотите добавить: ");
        String check = in.nextLine();
        ArrayList_m.add(check); // для добавление в определенное место по индексу можно ставить индекс перед добавляемым элементом
        System.out.println("Список с новым элементом: " + ArrayList_m + "\n");

        System.out.println("Удаление элемента\n");
        System.out.println("Исходный список: " + ArrayList_m + "\n");
        System.out.println("Введите элемент, который хотите удалить: ");
        String check1 = in.nextLine();
        ArrayList_m.remove(check1); // можно удалять также по индексу элемента
        System.out.println("Список без удаленного элемента: " + ArrayList_m + "\n");

        System.out.println("Изменение элемента\n");
        System.out.println("Исходный список: " + ArrayList_m + "\n");
        System.out.println("Введите индекс элемента, который хотите изменить и новое значение: ");
        int check3 = in.nextInt();
        in.nextLine();
        String check2 = in.nextLine();
        ArrayList_m.set(check3,check2); // индекс изменяеого элемента и то, на что меняем
        System.out.println("Новый список: " + ArrayList_m + "\n");

        System.out.println("Перемешивание элементов\n");
        System.out.println("Исходный список: " + ArrayList_m + "\n");
        Collections.shuffle(ArrayList_m); // перемешали список ArrayList_m в случайном порядке
        System.out.println("Новый список: " + ArrayList_m + "\n");

        System.out.println("Выбор случайного элемента списка\n");
        System.out.println("Исходный список: " + ArrayList_m + "\n");
        // перемешаем список и возьмем первый элемент из списка, таким образом получим случайный элемент списка
        Collections.shuffle(ArrayList_m); // перемешали список ArrayList_m в случайном порядке
        System.out.println("Случайный элемент списка: " + ArrayList_m.get(0) + "\n");

        System.out.println("Вывод индекса элемента списка\n");
        System.out.println("Исходный список: " + ArrayList_m + "\n");
        System.out.println("Введите название объекта, индекс которого хотите узнать: ");
        String check5 = in.nextLine();
        System.out.println("Индекс выбранного элемента списка: " + ArrayList_m.indexOf(check5) + "\n");

        System.out.println("Проверка наличия элемента списка\n");
        System.out.println("Исходный список: " + ArrayList_m + "\n");
        System.out.println("Введите название элемента, наличие которого хотите проверить: ");
        String check6 = in.nextLine();
            if (ArrayList_m.contains(check6) == true)
                System.out.println("Элемент есть в списке с индексом " + ArrayList_m.indexOf(check6) + "\n");
            else
                System.out.println("Элемента нет в списке\n");

        // Дополнительно рассмотрим четыре метода
        System.out.println("Обмен позициями двух элементов\n");
        System.out.println("Исходный список: " + ArrayList_m + "\n");
        System.out.println("Введите индексы элементов, которые хотите поменять: ");
        int check7 = in.nextInt();
        int check8 = in.nextInt();
        Collections.swap(ArrayList_m,check7,check8);
        System.out.println("Новый список: " + ArrayList_m + "\n");

        System.out.println("Перевот списка\n");
        System.out.println("Исходный список: " + ArrayList_m + "\n");
        Collections.reverse(ArrayList_m);
        System.out.println("Новый список: " + ArrayList_m + "\n");

        System.out.println("Поворот списка\n");
        // данная функция позволяет повернуть список на нужное количество позииций, то есть последний элемент
        // списка запишется в начало столько раз, сколько будет необходимо
        System.out.println("Исходный список: " + ArrayList_m + "\n");
        Collections.rotate(ArrayList_m,4);
        System.out.println("Новый список: " + ArrayList_m + "\n");

        System.out.println("Замена всех повторов на другое значение\n");
        // данная функция позволяет заменить в списке все значения, которые совпадают с нужным на то значение,
        // которое было введено в качестве замены
        System.out.println("Исходный список: " + ArrayList_m + "\n");
        Collections.replaceAll(ArrayList_m,"Венера","Замена");
        System.out.println("Новый список: " + ArrayList_m + "\n");

    }
}