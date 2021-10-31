import java.util.HashMap;
import java.util.Map;

public class Pet {
    //@Override
    public String ret () {
        return "H";
    }

    public static void main(String[] args) {
        HashMap<String, Pet> hm = new HashMap<>();
        hm.put("Собака", new Dog("Гари"));
        hm.put("Кошка", new Cat("Мася"));
        hm.put("Сова", new Owl("Сова"));
        for (Map.Entry<String, Pet> entry : hm.entrySet()) // Интерфейс Мар.Entry представляет объект с ключом типа К и значением V. Метод entrySet() возвращает набор всех элементов в виде объектов Map.Entry<K,V>
            System.out.println(entry.getKey() + " - " + entry.getValue().ret());

        System.out.println("\nС новыми значениями");
        hm.put("Кот", new Cat("Ричард"));
        hm.put("Кот", new Cat("Джеральд"));
        hm.put("Собака", new Cat("Гарик"));
        hm.put("Собака", new Cat("Джон"));
        hm.put("Сова", new Cat("Гер"));
        for (Map.Entry<String, Pet> entry : hm.entrySet()) // Интерфейс Мар.Entry представляет объект с ключом типа К и значением V. Метод entrySet() возвращает набор всех элементов в виде объектов Map.Entry<K,V>
            System.out.println(entry.getKey() + " - " + entry.getValue().ret());


        Map<Integer,Integer> hm1 = new HashMap<>(); // первый int - значение числа, второй int - количество повторов

        // Сгенерируем 10 случайных чисел и подсчитаем количество повторов
        for (int i = 0; i < 10; i++) {
            int num = (int) (Math.random() * 101);
            Integer bn = hm1.get(num); // get возвращает значение объекта с ключом(num), то есть сколько раз число повтороилось
            // Integer объект, который обертывает int
            if (bn == null)
                hm1.put(num,1);
            else
                hm1.put(num, bn + 1);
        }
        System.out.println("\nКоличество повторов");
        for (Map.Entry<Integer,Integer> ent : hm1.entrySet())
            System.out.println(ent.getKey() + " Количество повторов: " + ent.getValue());
    }

}
