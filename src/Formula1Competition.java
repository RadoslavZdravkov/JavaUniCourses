public class Formula1Competition implements Competition
{
    private double winnersTime;
    public Participant[] schedule;

    public double getWinnersTime() {
        return winnersTime;
    }
    public void setWinnersTime(double winnersTime) {
        this.winnersTime = winnersTime;
    }
    public Participant[] getSchedule()
    {
        return new Participant[0];
    }
    @Override
    public void initializeSchedule(int n) {
        this.schedule=new Participant[n];
    }
}
