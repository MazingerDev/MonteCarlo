
import java.util.ArrayList;

public class CumulativeProbaility {


    private ArrayList<Double> res = new ArrayList<Double>();
    private double sum =0;


    public void cumulativeProbaility(ArrayList<Double> probailty ) {
        sum += probailty.get(probailty.size() -1);
        sum = Math.round(sum*100.0)/100.0;
        res.add((sum));
    }
    public ArrayList<Double> getCumulativeProbaility()
    {
        return res;
    }


}
