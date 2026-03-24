public class Applicant {
    private String id;
    private String first_name;
    private String last_name;
    private String score;

    public Applicant(String id, String first_name, String last_name, String score) {
        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.score = score;
    }

    public String getId() {
        return this.id;
    }

    public String getFirst_name() {
        return this.first_name;
    }

    public String getLast_name() {
        return this.last_name;
    }

    public String getScore() {
        return this.score;
    }
}
