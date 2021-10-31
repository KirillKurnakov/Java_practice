public class MergeSorting extends SortingStudentsByGPA implements Comparator {

    public void mergeSort(int[] A, int start, int end) {
        if (start < end) {
            int middle = (start + end) / 2; // середина массива
            mergeSort(A,start,middle);
            mergeSort(A,middle + 1, end);
            Merge(A,start,middle,end);
        }
    }
    public void Merge(int[] A, int start, int mid, int end) {
        int[] leftA = new int[mid - start + 1];
        int[] rigthA = new int[end - mid + 1];
        for (int i = start; i <= mid; i++) {
            leftA[i - start] = A[i];
        }
        for (int i = mid + 1; i<= end; i++)
            rigthA[i - mid - 1] = A[i];

        int LeftI = 0;
        int RigthI = 0;

        for (int k = start; k <= end; k++) {
            if (leftA[LeftI] <= rigthA[RigthI]) {
                A[k] = leftA[LeftI++];
            }
            else
                A[k] = rigthA[RigthI++];
        }
    }
}
