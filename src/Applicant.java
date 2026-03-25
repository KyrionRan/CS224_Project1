public class Applicant implements Comparable<Applicant> {
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

    @Override
    public int compareTo(Applicant other) {
        if (this.score != other.score) {
            return Integer.compare(this.score, other.score);
        }
        if (!this.id.equals(other.id)) {
            return other.id.compareTo(this.id);
        }
        if (!this.last_name.equals(other.last_name)) {
            return other.last_name.compareTo(this.last_name);
        }
        return other.first_name.compareTo(this.first_name);
    }
}
