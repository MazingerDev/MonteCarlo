import java.util.ArrayList;

public class ProbailityOfOccurrence {

    private ArrayList<Double> res = new ArrayList<Double>();

    public void probailityOfOccurrence(double demand, double frequency)
    {
        res.add(demand/frequency);
    }

    public ArrayList<Double> getProbailityOfOccurrence() {
        return res;
    }
}
