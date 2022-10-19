import java.util.ArrayList;

public class Interval  {


    private ArrayList<Integer> result = new ArrayList<Integer>();
    private ArrayList<String> interval = new ArrayList<String>();


    public ArrayList<Integer> getInterval()
    {

        return result;
    }

    public void setInterval(ArrayList<Double> cumulative)
    {

        double firstIndex = cumulative.get(0) *100;
        if((int) firstIndex !=1 )
        {
            result.add(1);

        }
        for (Double aDouble : cumulative) {
            result.add((int) (aDouble * 100)+1);
        }

        for(int index =0 ; index < result.size()-1; index++)
        {
           interval.add(String.valueOf(result.get(index))+" to " +String.valueOf(result.get(index+1)-1));

        }
    }

    public ArrayList<String> getIntervalList()
    {
        return interval;
    }











}
