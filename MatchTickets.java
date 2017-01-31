import java.util.Scanner;

/**
 * Created by Dr-Br on 9.1.2017 г..
 */
public class MatchTickets {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        double budget = Double.parseDouble(console.nextLine());
        String category = console.nextLine();
        int fans = Integer.parseInt(console.nextLine());

        double budgetTransport = 0;
        double priceTicket = 0;

        if (category.equals("VIP")){
            priceTicket = 499.99;
        }else
            priceTicket = 249.99;

        if (fans >= 1 && fans <= 4){

            budgetTransport =  budget * 0.75;
        }else if(fans >= 5 && fans <= 9){
            budgetTransport = budget * 0.6;
        }else if (fans >= 10 && fans <= 24){
            budgetTransport =  budget * 0.5;
        }else if (fans >= 25 && fans <= 49){
            budgetTransport = budget * 0.4;
        }else{
            budgetTransport = budget * 0.25;
        }
        double ticketsTotal = fans * priceTicket;


        if ((budget - (budgetTransport + ticketsTotal)) > 0){
            System.out.printf("Yes! You have %.2f leva left.", (budget - (budgetTransport + ticketsTotal)));
        }else{
            System.out.printf("Not enough money! You need %.2f leva.", Math.abs((budget - (budgetTransport + ticketsTotal))));
        }
    }
}
