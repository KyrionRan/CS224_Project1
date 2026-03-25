import java.util.ArrayList;

public class Algorithm {
    public void selectionSort(ArrayList<Applicant> arr) {
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
                Applicant temp = new Applicant(arr.get(i));
                arr.get(i).copy(arr.get(max));
                arr.get(max).copy(temp);
            }
        }
    }

    public void insertionSort(ArrayList<Applicant> arr) {
        for (int i = 1; i < arr.size(); i++) {
            Applicant temp = new Applicant(arr.get(i));
            int j = i;
            while (j > 0) {
                if (temp.getScore() > arr.get(j - 1).getScore()) {
                    arr.get(j).copy(arr.get(j - 1));
                    j--;
                } else if (temp.getScore() == arr.get(j - 1).getScore()) {
                    if (temp.getId().compareTo(arr.get(j - 1).getId()) < 0) {
                        arr.get(j).copy(arr.get(j - 1));
                        j--;
                    } else if (temp.getId().compareTo(arr.get(j - 1).getId()) == 0) {
                        if (temp.getLast_name().compareTo(arr.get(j - 1).getLast_name()) < 0) {
                            arr.get(j).copy(arr.get(j - 1));
                            j--;
                        } else if (temp.getLast_name().compareTo(arr.get(j - 1).getLast_name()) == 0) {
                            if (temp.getFirst_name().compareTo(arr.get(j - 1).getFirst_name()) < 0) {
                                arr.get(j).copy(arr.get(j - 1));
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
                arr.get(j).copy(temp);
            }
        }
    }
}
