import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        ArrayList<Applicant> arr = new ArrayList<>();
        arr.add(new Applicant("1","Adele","Stawicki",95));
        arr.add(new Applicant("2","Annette","Troccoli",94));
        arr.add(new Applicant("3","Rebbecca","Kaina",84));
        arr.add(new Applicant("4","Lindsey","Bednorz",83));
        arr.add(new Applicant("5","Maricruz","Galluccio",89));
        arr.add(new Applicant("6","Maureen","Stakelin",94));
        arr.add(new Applicant("7","Shawna","Schinke",95));
        arr.add(new Applicant("8","Emmett","Rily",81));
        arr.add(new Applicant("9","Eleonor","Pentz",80));
        arr.add(new Applicant("10","Pamula","Sterker",85));
        Algorithm algorithm = new Algorithm();
        algorithm.selectionSort(arr);
    }
}
