import java.util.Arrays;
import java.lang.Math;
import java.util.Scanner;

public class SortingStudentsByGPA implements Comparator {
    @Override
    public void quickSort(int[] A, int left, int rigth) {
        if (A.length == 0) {
            return; // если длина массива 0, то выход
        }

        if (left >= rigth) {
            return; //если левая граница выше левой, то выход
        }
        // выбор опорного элемента
        int m = (left + rigth) / 2;
        int n = A[m];
        // разделить на подмассивы, который левее и правее опорного элемента

        int l = left;
        int r = rigth;
        while (l <= r) {
            while (A[l] < n)
                l++;

            while (A[r] > n)
                r--;

            if (l <= r) {
                int temp = A[l];
                A[l] = A[r];
                A[r] = temp;
                l++;
                r--;
            }
        }

        if (left < r)
            quickSort(A,left,r);

        if (rigth > l)
            quickSort(A,l,rigth);
    }

    @Override
    public void AddMas(int [] A,int n) {
        for (int i = 0; i<A.length - 1;i++)
            A[i] = (int)(Math.random()*101);
    }
    public static void main(String[] args) {
        Comparator obj = new SortingStudentsByGPA();
        System.out.println("Введите кол-во элементов в списке");
        Scanner in = new Scanner(System.in);
        int g = in.nextInt();
        int[] Cer = new int[g];// {8,0,4,7,3,7,10,12,-3};
        //Сer = new int[g];
        obj.AddMas(Cer,g);

        int[] Cer1 = new int[g];
        int[] Cer2 = new int[g];

        for (int i = 0; i< Cer.length-1; i++){
            Cer1[i] = Cer[i];
            Cer2[i] = Cer[i];
        }

        System.out.println("Быстрая сортировка\n");
        System.out.println("Было");
        System.out.println(Arrays.toString(Cer));
        int left = 0;
        int rigth = Cer.length - 1;

        obj.quickSort(Cer,left,rigth);
        System.out.println("Стало");
        System.out.println(Arrays.toString(Cer));


        System.out.println("\nСортировка вставками\n");
        System.out.println("Было");
        System.out.println(Arrays.toString(Cer1));
        Student obj1 = new Student();
        obj1.SortStudent(Cer1);
        System.out.println("Стало");
        System.out.println(Arrays.toString(Cer1));



    }
}
