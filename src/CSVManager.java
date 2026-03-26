import java.io.*;
import java.util.ArrayList;

public class CSVManager {
    public void read(String filePath, ArrayList<Applicant> array) {
        String line;
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath))) {
            bufferedReader.readLine();
            while ((line = bufferedReader.readLine()) != null) {
                String[] data = line.split(",");
                array.add(new Applicant(Integer.parseInt(data[0]), data[1], data[2], Integer.parseInt(data[3])));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void write(String filePath, ArrayList<Applicant> array) {
        File file = new File(filePath);
        file.getParentFile().mkdirs();
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filePath))) {
            bufferedWriter.write(String.join(",", "id", "first_name", "last_name", "score"));
            bufferedWriter.newLine();
            for (Applicant i : array) {
                bufferedWriter.write(String.join(",", String.valueOf(i.getId()), i.getFirst_name(), i.getLast_name(), String.valueOf(i.getScore())));
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
