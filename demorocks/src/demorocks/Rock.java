
package demorocks;


public class Rock {
    private int numSample = 0;
    String desc = "";
    private double weight = 0;
    public Rock(int num, double weight){
        this.numSample = num;
        this.weight = weight;
        this.desc = "Unclassified";
    }
    public int getNumSample(){
        return numSample;
    }
   public String getDesc(){
       return desc;
   }
    public double getWeight(){
        return weight;
    }
    
    
}
