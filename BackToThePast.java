import java.util.Scanner;

/**
 * Created by Dr-Br on 8.1.2017 г..
 */
public class BackToThePast {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        double heritage = Double.parseDouble(console.nextLine());
        int yearLast = Integer.parseInt(console.nextLine());

        int yearsOld = 17;

        for (int i = 1800; i <=  yearLast; i++) {
            yearsOld++;

            if (i % 2 == 0) {
                heritage -= 12000;
            } else {
                heritage -= (12000 + (yearsOld * 50));
            }
        }
        if (heritage >= 0) {
            System.out.printf("Yes! He will live a carefree life and will have %.2f dollars left.", heritage);
        } else System.out.printf("He will need %.2f dollars to survive.", Math.abs(heritage));
    }
}