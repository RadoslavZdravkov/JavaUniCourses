import java.util.Scanner;

public class CreateEvent
{
    private String typeOfEvent;

    public String getTypeOfEvent() {
        return typeOfEvent;
    }
    public void setTypeOfEvent(String typeOfEvent) {
        this.typeOfEvent = typeOfEvent;
    }

    public Competition getEvent(String competitionType)throws EventException
    {
        if(competitionType==null)
        {
            return null;
        }
        else if(competitionType.equalsIgnoreCase("Football"))
        {
            return new FootballCompetition();
        }
        else if(competitionType.equalsIgnoreCase("HorseCompetition"))
        {
            return new HorseCompetition();
        }
        else if(competitionType.equalsIgnoreCase("Formula1"))
        {
            return new Formula1Competition();
        }
        else throw new EventException();
    }

    public void fillSchedule(Competition ob, Participant[]schedule, Scanner sc)
    {
        for (Participant p:schedule) {
            ob.initializeSchedule(schedule.length);
            System.out.println("Enter participant id: ");
            p.setId(sc.nextInt());
            System.out.println("Enter participant name: ");
            p.setName(sc.nextLine());
            System.out.println("Enter participant age: ");
            p.setAge(sc.nextInt());
            System.out.println("Enter participant chance to win: ");
            p.setChanceToWin(sc.nextDouble());
            System.out.println("Enter participant bet for win: ");
            p.setBetForWin(sc.nextDouble());
        }
    }

    static void bets(Competition ob, int id, double bet)
    {
        Participant[] currentSchedule=ob.getSchedule();
        double sum=0;
        for(Participant p:currentSchedule)
        {
            if(p.getId()==id)
            {
                sum+=bet+p.getBetForWin();
                sum/=p.getBetForWin();
                p.setChanceToWin(p.getChanceToWin()-sum);
                if(p.getChanceToWin()<1.1)
                {
                    p.setChanceToWin(1.1);
                }
            }
        }
    }
}
