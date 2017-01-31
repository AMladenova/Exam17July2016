import java.util.Scanner;
/**
 * Created by Dr-Br on 8.1.2017 г..
 */
public class Harvest {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int vineyard = Integer.parseInt(console.nextLine());
        double grapesPerSqM = Double.parseDouble(console.nextLine());
        int littersNecessary = Integer.parseInt(console.nextLine());
        int workers = Integer.parseInt(console.nextLine());

        double grapesTotal = (grapesPerSqM * vineyard);
        double littersTotal = (grapesTotal * 0.4 ) / 2.5;

         if (Math.floor((grapesTotal * 0.4 ) / 2.5) >= littersNecessary){
             System.out.println("Good harvest this year! Total wine: " + (int) Math.floor(littersTotal) + " liters.");
             System.out.print((int) Math.ceil(littersTotal - littersNecessary) + " liters left -> " + (int) Math.ceil(((((grapesTotal * 0.4 ) / 2.5) - littersNecessary)/ workers )) + " liters per person." );
         } else {
             System.out.println("It will be a tough winter! More " +  (int) Math.floor(littersNecessary - littersTotal) + " liters wine needed.");

         }
    }
}

