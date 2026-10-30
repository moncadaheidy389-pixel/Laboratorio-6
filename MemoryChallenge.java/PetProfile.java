public class PetProfile {
    private String name;
    private int visits;

    public PetProfile(String name) {
        this.name = name;
        this.visits = 0;
    }

    public void registerVisit() {
        visits++;
    }

    public String getName() {
        return name;
    }

    public int getVisits() {
        return visits;
    }
}

