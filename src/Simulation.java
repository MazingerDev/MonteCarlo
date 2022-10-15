import  java.lang.Math;
import java.util.ArrayList;
import java.util.Random;

public class Simulation {

    private Random random = new Random();


    private ArrayList<Integer> simulation = new ArrayList<Integer>();
    private ArrayList<Integer> randomList = new ArrayList<Integer>();

    public ArrayList<Integer> simulation(int timesOfSimulatoin,ArrayList<Integer> interval, ArrayList<Double> demand)
    {
        for(int n=0 ; n<timesOfSimulatoin; n++)
        {
            Integer ran = random.nextInt(100);
            randomList.add(ran);

        }

        for(int n= 0; n< timesOfSimulatoin;n++)
        {
            for (int i = 0; i < interval.size() - 1; i++) {
                if (interval.get(i) < randomList.get(n) && interval.get(i + 1) > randomList.get(n)) {
                    double tmp = demand.get(i);
                    simulation.add((int) tmp);

                }
            }
        }
        return simulation;
    }


    public ArrayList<Integer> getRandomList() {
        return randomList;
    }


}
