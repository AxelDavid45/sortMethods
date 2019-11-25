package sortsmethods;

public class Sorts {

    public static void BubbleSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] < array[j + 1]) {
                    int aux = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = aux;
                }
            }
        }
    }

    public static void ShellSort(int[] array) {
        for (int jump = (array.length / 2); jump != 0; jump /= 2) {
            boolean change = true;
            while (change) {
                change = false;
                for (int i = jump; i < array.length; i++) {
                    if (array[i - jump] > array[i]) {
                        int aux = array[i];
                        array[i] = array[i - jump];
                        array[i - jump] = aux;
                        change = true;
                    }
                }
            }

        }
    }

    public static void QuickSort(int[] array, int start, int end) {
        int p = array[start];
        int i = start;
        int j = end;
        while (i < j) {
            while (array[i] <= p && i < j) {
                i++;
            }
            while (array[j] > p) {
                j--;
            }
            if (i < j) {
                int aux = array[i];
                array[i] = array[j];
                array[j] = aux;
            }
        }
        array[start] = array[j];
        array[j] = p;

        if (i < end - 1) {
            QuickSort(array, start, end - 1);
        }
        if (end + 1 < end) {
            QuickSort(array, end + 1, end);
        }

    }

    public static void print(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    //RADIX
    public static void initWithZero(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = 0;
        }
    }

    public static void copyArray(int[] source, int[] destination) {
        for (int i = 0; i < source.length; i++) {
            destination[i] = source[i];
        }
    }

    public static void radixSort(int[] array, int length) {
        int[] auxArray = new int[array.length];
        int[] indexArray = new int[10];

        int base = 1, index, auxNum;

        for (int i = 0; i < length; i++) {
            initWithZero(indexArray);
            for (int j = 0; j < array.length; j++) {
                auxNum = array[j] / (base);
                index = auxNum % 10;
                indexArray[index]++;
            }

            for (int j = 0; j < 9; j++) {
                indexArray[j + 1] += indexArray[j];
            }

            for (int j = array.length - 1; j >= 0; j--) {
                auxNum = array[j] / base;
                index = auxNum % 10;
                indexArray[index]--;
                auxArray[indexArray[index]] = array[j];
            }

            copyArray(auxArray, array);
            base *= 10;
        }
    }
}
