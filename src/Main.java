import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Demand demand = new Demand();
        Frequency frequency = new Frequency();
        ProbailityOfOccurrence probaility = new ProbailityOfOccurrence();
        CumulativeProbaility cumulative = new CumulativeProbaility();
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
        System.out.println(probaility.getProbailityOfOccurrence());
        System.out.println(cumulative.getCumulativeProbaility());
        




    }
}