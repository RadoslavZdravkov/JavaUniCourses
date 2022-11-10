public class HorseCompetition implements Competition
{
    private String breed;
    public Participant[] schedule;

    public String getBreed() {
        return breed;
    }
    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public Participant[] getSchedule() {
        return new Participant[0];
    }
    @Override
    public void initializeSchedule(int n) {
        this.schedule=new Participant[n];
    }
}
