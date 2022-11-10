public class FootballCompetition implements Competition
{
    private double fastestGoal;
    public Participant[] schedule;

    public double getFastestGoal() {
        return fastestGoal;
    }
    public void setFastestGoal(double fastestGoal) {
        this.fastestGoal = fastestGoal;
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
