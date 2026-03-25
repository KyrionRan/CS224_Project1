import java.util.ArrayList;
import java.util.Collections;

public class Algorithm {
    public ArrayList<Applicant> selectionSort(ArrayList<Applicant> array) {
        ArrayList<Applicant> arr = new ArrayList<>(array);
        for (int i = 0; i < arr.size() - 1; i++) {
            int max = i;
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(j).getScore() > arr.get(max).getScore()) {
                    max = j;
                } else if (arr.get(j).getScore() == arr.get(max).getScore()) {
                    if (arr.get(j).getId().compareTo(arr.get(max).getId()) < 0) {
                        max = j;
                    } else if (arr.get(j).getId().compareTo(arr.get(max).getId()) == 0) {
                        if (arr.get(j).getLast_name().compareTo(arr.get(max).getLast_name()) < 0) {
                            max = j;
                        } else if (arr.get(j).getLast_name().compareTo(arr.get(max).getLast_name()) == 0) {
                            if (arr.get(j).getFirst_name().compareTo(arr.get(max).getFirst_name()) < 0) {
                                max = j;
                            }
                        }
                    }
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
                if (temp.getScore() > arr.get(j - 1).getScore()) {
                    arr.set(j, arr.get(j - 1));
                    j--;
                } else if (temp.getScore() == arr.get(j - 1).getScore()) {
                    if (temp.getId().compareTo(arr.get(j - 1).getId()) < 0) {
                        arr.set(j, arr.get(j - 1));
                        j--;
                    } else if (temp.getId().compareTo(arr.get(j - 1).getId()) == 0) {
                        if (temp.getLast_name().compareTo(arr.get(j - 1).getLast_name()) < 0) {
                            arr.set(j, arr.get(j - 1));
                            j--;
                        } else if (temp.getLast_name().compareTo(arr.get(j - 1).getLast_name()) == 0) {
                            if (temp.getFirst_name().compareTo(arr.get(j - 1).getFirst_name()) < 0) {
                                arr.set(j, arr.get(j - 1));
                                j--;
                            } else {
                                break;
                            }
                        } else {
                            break;
                        }
                    } else {
                        break;
                    }
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
            if (leftArray.get(left).getScore() > rightArray.get(right).getScore()) {
                result.add(leftArray.get(left));
                left++;
            } else if (leftArray.get(left).getScore() == rightArray.get(right).getScore()) {
                if (leftArray.get(left).getId().compareTo(rightArray.get(right).getId()) < 0) {
                    result.add(leftArray.get(left));
                    left++;
                } else if (leftArray.get(left).getId().compareTo(rightArray.get(right).getId()) == 0) {
                    if (leftArray.get(left).getLast_name().compareTo(rightArray.get(right).getLast_name()) < 0) {
                        result.add(leftArray.get(left));
                        left++;
                    } else if (leftArray.get(left).getLast_name().compareTo(rightArray.get(right).getLast_name()) == 0) {
                        if (leftArray.get(left).getFirst_name().compareTo(rightArray.get(right).getFirst_name()) < 0) {
                            result.add(leftArray.get(left));
                            left++;
                        } else {
                            result.add(rightArray.get(right));
                            right++;
                        }
                    } else {
                        result.add(rightArray.get(right));
                        right++;
                    }
                } else {
                    result.add(rightArray.get(right));
                    right++;
                }
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
}
