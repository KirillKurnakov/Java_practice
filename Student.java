public class Student extends SortingStudentsByGPA implements Comparator {
    //Сортировка вставками
    public void SortStudent (int[] A) {
        for (int i = 0; i < A.length; i++) {
            int v = A[i]; // выбираем первый элемент в качестве отсортированного подспика
            //Двигаемся по элементам, которые находятся перед v
            int it = i - 1;
            for (it = i - 1;it>=0;it--) {
                if (v < A[it]) { // если взяли меньший элемент, больший перемещаем дальше от начала
                    A[it+1] = A[it];
                }
                else {
                    break; // если v больше - остановка
                }
            }
            A[it+1] = v;
        }
    }
}
