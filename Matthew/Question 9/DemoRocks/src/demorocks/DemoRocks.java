
package demorocks;

/**
 * @author Matthew Lukowski
 */
public class DemoRocks {

    public static void main(String[] args) {
 IgneousRock x = new IgneousRock(3,29);
 SedimentaryRock y = new SedimentaryRock(2,12);
 MetamorphicRock z = new MetamorphicRock(1,40); 
        System.out.println(x.getDesc());System.out.println(x.getNumSamples());System.out.println(x.getWeight());
        System.out.println(y.getDesc());System.out.println(y.getNumSamples());System.out.println(y.getWeight());
        System.out.println(z.getDesc());System.out.println(z.getNumSamples());System.out.println(z.getWeight());

    }
    
}
