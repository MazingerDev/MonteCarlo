import java.util.ArrayList;

public class Interval  {


    private ArrayList<Integer> result = new ArrayList<Integer>();


    public ArrayList<Integer> getInterval()
    {

        return result;
    }

    public void setInterval(ArrayList<Double> cumulative)
    {
        result.add(1);
        for (Double aDouble : cumulative) {
            result.add((int) (aDouble * 100));
        }
    }










}
