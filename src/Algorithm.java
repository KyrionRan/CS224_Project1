import java.util.ArrayList;
import java.util.Collections;

public class Algorithm {
    public ArrayList<Applicant> selectionSort(ArrayList<Applicant> array) {
        ArrayList<Applicant> arr = new ArrayList<>(array);
        for (int i = 0; i < arr.size() - 1; i++) {
            int max = i;
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(j).compareTo(arr.get(max)) > 0) {
                    max = j;
                }
            }
            if (i != max) {
                Collections.swap(arr, i, max);
            }
        }
        return arr;
    }

    public ArrayList<Applicant> insertionSort(ArrayList<Applicant> array) {
        ArrayList<Applicant> arr = new ArrayList<>(array);
        for (int i = 1; i < arr.size(); i++) {
            Applicant temp = arr.get(i);
            int j = i;
            while (j > 0) {
                if (temp.compareTo(arr.get(j - 1)) > 0) {
                    arr.set(j, arr.get(j - 1));
                    j--;
                } else {
                    break;
                }
            }
            if (j != i) {
                arr.set(j, temp);
            }
        }
        return arr;
    }

    public ArrayList<Applicant> mergeSort(ArrayList<Applicant> arr, int lowIndex, int highIndex) {
        if (lowIndex == highIndex) {
            ArrayList<Applicant> temp = new ArrayList<>();
            temp.add(arr.get(lowIndex));
            return temp;
        }
        int midIndex = (highIndex + lowIndex) / 2;
        ArrayList<Applicant> leftHalf = mergeSort(arr, lowIndex, midIndex);
        ArrayList<Applicant> rightHalf = mergeSort(arr, midIndex + 1, highIndex);
        return merge(leftHalf, rightHalf);
    }

    private ArrayList<Applicant> merge(ArrayList<Applicant> leftArray, ArrayList<Applicant> rightArray) {
        ArrayList<Applicant> result = new ArrayList<>();
        int left = 0;
        int right = 0;
        while (left < leftArray.size() && right < rightArray.size()) {
            if (leftArray.get(left).compareTo(rightArray.get(right)) > 0) {
                result.add(leftArray.get(left));
                left++;
            } else {
                result.add(rightArray.get(right));
                right++;
            }
        }
        while (left < leftArray.size()) {
            result.add(leftArray.get(left));
            left++;
        }
        while (right < rightArray.size()) {
            result.add(rightArray.get(right));
            right++;
        }
        return result;
    }

    public ArrayList<Applicant> quickSort(ArrayList<Applicant> array, int lowIndex, int highIndex) {
        ArrayList<Applicant> arr = new ArrayList<>(array);
        quickSortAlgorithm(arr, lowIndex, highIndex);
        return arr;
    }

    private void quickSortAlgorithm(ArrayList<Applicant> arr, int lowIndex, int highIndex) {
        if (lowIndex >= highIndex) {
            return;
        }
        Applicant pivot = arr.get(highIndex);
        int pivotIndex = partition(arr, lowIndex, highIndex, pivot);
        quickSortAlgorithm(arr, lowIndex, pivotIndex - 1);
        quickSortAlgorithm(arr, pivotIndex + 1, highIndex);
    }

    private int partition(ArrayList<Applicant> arr, int lowIndex, int highIndex, Applicant pivot) {
        int leftPointer = lowIndex;
        int rightPointer = highIndex;
        while (leftPointer < rightPointer) {
            while (arr.get(leftPointer).compareTo(pivot) >= 0 && leftPointer < rightPointer) {
                leftPointer++;
            }
            while (arr.get(rightPointer).compareTo(pivot) <= 0 && leftPointer < rightPointer) {
                rightPointer--;
            }
            Collections.swap(arr, leftPointer, rightPointer);
        }
        Collections.swap(arr, leftPointer, highIndex);
        return leftPointer;
    }

    public ArrayList<Applicant> heapSort(ArrayList<Applicant> array) {
        ArrayList<Applicant> arr = new ArrayList<>(array);
        heapSortAlgorithm(arr);
        return arr;
    }

    private void heapSortAlgorithm(ArrayList<Applicant> arr) {
        int n = arr.size();
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }
        for (int i = n - 1; i > 0; i--) {
            Collections.swap(arr, 0, i);
            heapify(arr, i, 0);
        }
    }

    private void heapify(ArrayList<Applicant> arr, int n, int i) {
        int smallest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        if (left < n && arr.get(left).compareTo(arr.get(smallest)) < 0) {
            smallest = left;
        }
        if (right < n && arr.get(right).compareTo(arr.get(smallest)) < 0) {
            smallest = right;
        }
        if (smallest != i) {
            Collections.swap(arr, i, smallest);
            heapify(arr, n, smallest);
        }
    }
}
