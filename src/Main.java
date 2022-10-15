import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Demand demand = new Demand();
        Frequency frequency = new Frequency();
        ProbailityOfOccurrence probaility = new ProbailityOfOccurrence();
        CumulativeProbaility cumulative = new CumulativeProbaility();
        Interval interval = new Interval();
        Simulation simulation = new Simulation();
        int timesOfInputs = input.nextInt();

        for(int counter =0;counter<timesOfInputs;counter++)
        {
            double currentDemand = input.nextDouble();
            double currentFrequency = input.nextDouble();
            demand.setDemandPerFrequency(currentDemand);
            frequency.setFrequencyPerDemand(currentFrequency);
        }

        for( int counter = 0 ; counter <timesOfInputs; counter++)
        {
            probaility.probailityOfOccurrence(frequency.getFrequencyPerDemand(counter), frequency.getFrequency());
            cumulative.cumulativeProbaility(probaility.getProbailityOfOccurrence());
        }
        interval.setInterval(cumulative.getCumulativeProbaility());
        System.out.println(probaility.getProbailityOfOccurrence());
        System.out.println(cumulative.getCumulativeProbaility());
        System.out.println(interval.getInterval());
        System.out.println(simulation.simulation(10,interval.getInterval(),demand.getDemandPerFrequency()));
        System.out.println(simulation.getRandomList());





    }
}