package sortsmethods;

import java.io.*;

public class Implementation {

    public static void main(String[] args) {
        int[] array = {8, 74, 11, 16, 14, 20, 1, 82, 10, 5};

        File f = new File("C:/Users/axele/Documents/estructuras-datos-s3a/Ordenamientos/src/sortsmethods/test");
        
        try {
// se genera un archivo secuencialmente de claves enteras
            SortFiles.mezclaDirecta(f);
        } catch (IOException e) {
            System.out.println("Error entrada/salida durante proceso"
                    + " de ordenación ");
            e.printStackTrace();
        }
        SortFiles.escribir(f);
//        Sorts.BubbleSort(array);
//        Sorts.mergeSort(array, array.length);
//        Sorts.ShellSort(array);
//        Sorts.QuickSort(array, 0, array.length -1);
//        Sorts.radixSort(array, 2);
//        Sorts.print(array);

    }
}
