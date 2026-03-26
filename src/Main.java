import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        CSVManager csvManager = new CSVManager();
        Algorithm algorithm = new Algorithm();
        long startTime;
        long endTime;
        long totalTime;
        double totalSeconds;

        ArrayList<Applicant> array_a = new ArrayList<>();
        ArrayList<Applicant> array_b = new ArrayList<>();
        ArrayList<Applicant> array_c = new ArrayList<>();
        ArrayList<Applicant> array_d = new ArrayList<>();
        csvManager.read("data/pool_a.csv", array_a);
        csvManager.read("data/pool_b.csv", array_b);
        csvManager.read("data/pool_c.csv", array_c);
        csvManager.read("data/pool_d.csv", array_d);

        //Pool A
        System.out.println("Pool A");
        //Selection Sort
        startTime = System.nanoTime();
        ArrayList<Applicant> array_a_selection = algorithm.selectionSort(array_a);
        endTime = System.nanoTime();
        totalTime = endTime - startTime;
        totalSeconds = totalTime / 1000000000.0;
        System.out.printf("SelectionSort: %fs ", totalSeconds);
        csvManager.write("outputs/pool_a_selection.csv", array_a_selection);
        //Insertion Sort
        startTime = System.nanoTime();
        ArrayList<Applicant> array_a_insertion = algorithm.insertionSort(array_a);
        endTime = System.nanoTime();
        totalTime = endTime - startTime;
        totalSeconds = totalTime / 1000000000.0;
        System.out.printf("InsertionSort: %fs ", totalSeconds);
        csvManager.write("outputs/pool_a_insertion.csv", array_a_insertion);
        //Merge Sort
        startTime = System.nanoTime();
        ArrayList<Applicant> array_a_merge = algorithm.mergeSort(array_a, 0, array_a.size() - 1);
        endTime = System.nanoTime();
        totalTime = endTime - startTime;
        totalSeconds = totalTime / 1000000000.0;
        System.out.printf("MergeSort: %fs ", totalSeconds);
        csvManager.write("outputs/pool_a_merge.csv", array_a_merge);
        //Quick Sort
        startTime = System.nanoTime();
        ArrayList<Applicant> array_a_quick = algorithm.quickSort(array_a, 0, array_a.size() - 1);
        endTime = System.nanoTime();
        totalTime = endTime - startTime;
        totalSeconds = totalTime / 1000000000.0;
        System.out.printf("QuickSort: %fs ", totalSeconds);
        csvManager.write("outputs/pool_a_quick.csv", array_a_quick);
        //Heap Sort
        startTime = System.nanoTime();
        ArrayList<Applicant> array_a_heap = algorithm.heapSort(array_a);
        endTime = System.nanoTime();
        totalTime = endTime - startTime;
        totalSeconds = totalTime / 1000000000.0;
        System.out.printf("HeapSort: %fs ", totalSeconds);
        csvManager.write("outputs/pool_a_heap.csv", array_a_heap);
        System.out.println();

        //Pool B
        System.out.println("Pool B");
        //Selection Sort
        startTime = System.nanoTime();
        ArrayList<Applicant> array_b_selection = algorithm.selectionSort(array_b);
        endTime = System.nanoTime();
        totalTime = endTime - startTime;
        totalSeconds = totalTime / 1000000000.0;
        System.out.printf("SelectionSort: %fs ", totalSeconds);
        csvManager.write("outputs/pool_b_selection.csv", array_b_selection);
        //Insertion Sort
        startTime = System.nanoTime();
        ArrayList<Applicant> array_b_insertion = algorithm.insertionSort(array_b);
        endTime = System.nanoTime();
        totalTime = endTime - startTime;
        totalSeconds = totalTime / 1000000000.0;
        System.out.printf("InsertionSort: %fs ", totalSeconds);
        csvManager.write("outputs/pool_b_insertion.csv", array_b_insertion);
        //Merge Sort
        startTime = System.nanoTime();
        ArrayList<Applicant> array_b_merge = algorithm.mergeSort(array_b, 0, array_b.size() - 1);
        endTime = System.nanoTime();
        totalTime = endTime - startTime;
        totalSeconds = totalTime / 1000000000.0;
        System.out.printf("MergeSort: %fs ", totalSeconds);
        csvManager.write("outputs/pool_b_merge.csv", array_b_merge);
        //Quick Sort
        startTime = System.nanoTime();
        ArrayList<Applicant> array_b_quick = algorithm.quickSort(array_b, 0, array_b.size() - 1);
        endTime = System.nanoTime();
        totalTime = endTime - startTime;
        totalSeconds = totalTime / 1000000000.0;
        System.out.printf("QuickSort: %fs ", totalSeconds);
        csvManager.write("outputs/pool_b_quick.csv", array_b_quick);
        //Heap Sort
        startTime = System.nanoTime();
        ArrayList<Applicant> array_b_heap = algorithm.heapSort(array_b);
        endTime = System.nanoTime();
        totalTime = endTime - startTime;
        totalSeconds = totalTime / 1000000000.0;
        System.out.printf("HeapSort: %fs ", totalSeconds);
        csvManager.write("outputs/pool_b_heap.csv", array_b_heap);
        System.out.println();

        //Pool C
        System.out.println("Pool C");
        //Selection Sort
        startTime = System.nanoTime();
        ArrayList<Applicant> array_c_selection = algorithm.selectionSort(array_c);
        endTime = System.nanoTime();
        totalTime = endTime - startTime;
        totalSeconds = totalTime / 1000000000.0;
        System.out.printf("SelectionSort: %fs ", totalSeconds);
        csvManager.write("outputs/pool_c_selection.csv", array_c_selection);
        //Insertion Sort
        startTime = System.nanoTime();
        ArrayList<Applicant> array_c_insertion = algorithm.insertionSort(array_c);
        endTime = System.nanoTime();
        totalTime = endTime - startTime;
        totalSeconds = totalTime / 1000000000.0;
        System.out.printf("InsertionSort: %fs ", totalSeconds);
        csvManager.write("outputs/pool_c_insertion.csv", array_c_insertion);
        //Merge Sort
        startTime = System.nanoTime();
        ArrayList<Applicant> array_c_merge = algorithm.mergeSort(array_c, 0, array_c.size() - 1);
        endTime = System.nanoTime();
        totalTime = endTime - startTime;
        totalSeconds = totalTime / 1000000000.0;
        System.out.printf("MergeSort: %fs ", totalSeconds);
        csvManager.write("outputs/pool_c_merge.csv", array_c_merge);
        //Quick Sort
        startTime = System.nanoTime();
        ArrayList<Applicant> array_c_quick = algorithm.quickSort(array_c, 0, array_c.size() - 1);
        endTime = System.nanoTime();
        totalTime = endTime - startTime;
        totalSeconds = totalTime / 1000000000.0;
        System.out.printf("QuickSort: %fs ", totalSeconds);
        csvManager.write("outputs/pool_c_quick.csv", array_c_quick);
        //Heap Sort
        startTime = System.nanoTime();
        ArrayList<Applicant> array_c_heap = algorithm.heapSort(array_c);
        endTime = System.nanoTime();
        totalTime = endTime - startTime;
        totalSeconds = totalTime / 1000000000.0;
        System.out.printf("HeapSort: %fs ", totalSeconds);
        csvManager.write("outputs/pool_c_heap.csv", array_c_heap);
        System.out.println();

        //Pool D
        System.out.println("Pool D");
        //Selection Sort
        startTime = System.nanoTime();
        ArrayList<Applicant> array_d_selection = algorithm.selectionSort(array_d);
        endTime = System.nanoTime();
        totalTime = endTime - startTime;
        totalSeconds = totalTime / 1000000000.0;
        System.out.printf("SelectionSort: %fs ", totalSeconds);
        csvManager.write("outputs/pool_d_selection.csv", array_d_selection);
        //Insertion Sort
        startTime = System.nanoTime();
        ArrayList<Applicant> array_d_insertion = algorithm.insertionSort(array_d);
        endTime = System.nanoTime();
        totalTime = endTime - startTime;
        totalSeconds = totalTime / 1000000000.0;
        System.out.printf("InsertionSort: %fs ", totalSeconds);
        csvManager.write("outputs/pool_d_insertion.csv", array_d_insertion);
        //Merge Sort
        startTime = System.nanoTime();
        ArrayList<Applicant> array_d_merge = algorithm.mergeSort(array_d, 0, array_d.size() - 1);
        endTime = System.nanoTime();
        totalTime = endTime - startTime;
        totalSeconds = totalTime / 1000000000.0;
        System.out.printf("MergeSort: %fs ", totalSeconds);
        csvManager.write("outputs/pool_d_merge.csv", array_d_merge);
        //Quick Sort
        startTime = System.nanoTime();
        ArrayList<Applicant> array_d_quick = algorithm.quickSort(array_d, 0, array_d.size() - 1);
        endTime = System.nanoTime();
        totalTime = endTime - startTime;
        totalSeconds = totalTime / 1000000000.0;
        System.out.printf("QuickSort: %fs ", totalSeconds);
        csvManager.write("outputs/pool_d_quick.csv", array_d_quick);
        //Heap Sort
        startTime = System.nanoTime();
        ArrayList<Applicant> array_d_heap = algorithm.heapSort(array_d);
        endTime = System.nanoTime();
        totalTime = endTime - startTime;
        totalSeconds = totalTime / 1000000000.0;
        System.out.printf("HeapSort: %fs ", totalSeconds);
        csvManager.write("outputs/pool_d_heap.csv", array_d_heap);
        System.out.println();
    }
}
