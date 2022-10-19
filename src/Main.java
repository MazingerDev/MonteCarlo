import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        Demand demand = new Demand();
        Frequency frequency = new Frequency();
        ProbailityOfOccurrence probaility = new ProbailityOfOccurrence();
        CumulativeProbaility cumulative = new CumulativeProbaility();
        Interval interval = new Interval();
        Simulation simulation = new Simulation();
        CommandLineTable table = new CommandLineTable();
        CommandLineTable table1 = new CommandLineTable();

        table.clearConsole();
        System.out.print("Enter the table size : ");

        int timesOfInputs = input.nextInt();

        System.out.println("Enter the table (class frequency)");
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


        table.clearConsole();

        table.setShowVerticalLines(true);

        table.setHeaders("Class", "Frequency","Probability of occurrence","Cumulative","Interval of random numbers");
        for(int counter=0 ; counter<timesOfInputs; counter++)
        {
            table.addRow(String.valueOf(demand.getDemandPerFrequency().get(counter)), String.valueOf(frequency.getFrequencyPerDemand(counter)), String.valueOf(probaility.getProbailityOfOccurrence().get(counter)), String.valueOf(cumulative.getCumulativeProbaility().get(counter)),interval.getIntervalList().get(counter));

        }
        table.print();

        System.out.print("Enter the number of simulation time : ");
        int timesOfSimulation = input.nextInt();

        table1.setShowVerticalLines(true);
        table1.setHeaders("Simulation time","Random numbers","Simulation values");

        for(int counter =0 ; counter<timesOfSimulation; counter++)
        {
            int sim = simulation.simulation(timesOfSimulation,interval.getInterval(),demand.getDemandPerFrequency()).get(counter);
            table1.addRow(String.valueOf(counter+1), String.valueOf(simulation.getRandomList().get(counter)),String.valueOf(sim));
        }
        table1.print();
        System.out.println("\n"+"Simulation average : "+ simulation.getAverage(timesOfSimulation));



    }
}
