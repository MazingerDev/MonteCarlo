import  java.lang.Math;
import java.util.ArrayList;
import java.util.Random;

public class Simulation {

    private Random random = new Random();
    private double average ;

    private ArrayList<Integer> simulation = new ArrayList<Integer>();
    private ArrayList<Integer> randomList = new ArrayList<Integer>();

    public ArrayList<Integer> simulation(int timesOfSimulatoin,ArrayList<Integer> interval, ArrayList<Double> demand)
    {
        setRandomList(randomList,timesOfSimulatoin);


        for(int n= 0; n< timesOfSimulatoin;n++)
        {
            for (int i = 0; i < interval.size() - 1; i++) {
                if (interval.get(i) < randomList.get(n) && interval.get(i + 1) > randomList.get(n)) {
                    double tmp = demand.get(i);
                    simulation.add((int) tmp);

                }
            }
        }
        setAverage(average,simulation,timesOfSimulatoin);
        return simulation;
    }


    public ArrayList<Integer> getRandomList() {
        return randomList;
    }

    private void setRandomList(ArrayList<Integer> randomList,int timesOfSimulatoin)
    {
        for(int n=0 ; n<timesOfSimulatoin; n++)
        {
            Integer ran = random.nextInt(100);
            randomList.add(ran);

        }
        this.randomList = randomList;
    }

    public double getAverage() {
        return average;
    }

    private void setAverage(double average,ArrayList<Integer> simulation , int timesOfSimulatoin) {
        average =0;
        for(int n : simulation)
            average +=n;
        average /=timesOfSimulatoin;
        this.average = average;
    }
}
