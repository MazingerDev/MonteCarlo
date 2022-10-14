import java.util.ArrayList;

public class Frequency  {

     private ArrayList<Double> frequencyPerDemand = new ArrayList<Double>();
     private double frequency = 0;


     public void setFrequencyPerDemand(double frequencyPerDemand) {
          this.frequencyPerDemand.add(frequencyPerDemand);
          frequency += frequencyPerDemand;
     }
     public double getFrequencyPerDemand(int index)
     {
          return  frequencyPerDemand.get(index);
     }

     public double getFrequency()
     {
          return frequency;
     }
}
