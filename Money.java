import java.util.Scanner;

/**
 * Created by Dr-Br on 10.1.2017 г..
 */
public class Money {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int bitcoins = Integer.parseInt(console.nextLine());
        double yuans = Double.parseDouble(console.nextLine());
        double commission = Double.parseDouble(console.nextLine());

        double bitcoinsInLeva = bitcoins * 1168.0;
        double yuansToDollars = yuans * 0.15;
        double dollarsToLeva = yuansToDollars * 1.76;

        double levs =  bitcoinsInLeva + dollarsToLeva;
        double euros = levs / 1.95;
        euros -= commission/100 * euros;

        System.out.println(euros);
    }
}
