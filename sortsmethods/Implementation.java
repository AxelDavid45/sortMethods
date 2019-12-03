package sortsmethods;

public class Implementation {

    public static void main(String[] args) {
        int[] array = {8, 74, 11, 16, 14, 20, 1, 82, 10, 5};
//        Sorts.BubbleSort(array);
          Sorts.mergeSort(array, array.length);
//        Sorts.ShellSort(array);
//        Sorts.QuickSort(array, 0, array.length -1);
//        Sorts.radixSort(array, 2);
        Sorts.print(array);
    }
}
