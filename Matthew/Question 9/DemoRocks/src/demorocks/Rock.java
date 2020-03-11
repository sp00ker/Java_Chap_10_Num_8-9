
package demorocks;

//superclass for rock types
public class Rock {
     private int numSamples = 0;
     String desc = "";
     private double weight = 0;
    public Rock(int num, double weight){
        this.numSamples = num;
        this.weight = weight;
        this.desc = "Unclassified";
        
    }

    public int getNumSamples() {
        return numSamples;
    }

    public String getDesc() {
        return desc;
    }

    public double getWeight() {
        return weight;
    }
    
}

