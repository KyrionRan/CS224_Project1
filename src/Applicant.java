public class Applicant {
    private String id;
    private String first_name;
    private String last_name;
    private int score;

    public Applicant(String id, String first_name, String last_name, int score) {
        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.score = score;
    }

    public Applicant(Applicant app) {
        this.id = app.getId();
        this.first_name = app.getFirst_name();
        this.last_name = app.getLast_name();
        this.score = app.getScore();
    }

    public void copy(Applicant app) {
        this.id = app.getId();
        this.first_name = app.getFirst_name();
        this.last_name = app.getLast_name();
        this.score = app.getScore();
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

    public int getScore() {
        return this.score;
    }
}
