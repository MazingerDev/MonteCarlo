import java.util.ArrayList;

public class Demand {
    private ArrayList<Double> demandPerFrequency = new ArrayList<Double>();
    private double demand = 0;

    public void setDemandPerFrequency(double demandPerFrequency) {
        this.demandPerFrequency.add(demandPerFrequency);
        demand += demandPerFrequency;
    }
    public ArrayList<Double> getDemandPerFrequency()
    {
        return demandPerFrequency;
    }


}
