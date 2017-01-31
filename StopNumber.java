import java.util.Scanner;

/**
 * Created by Dr-Br on 10.1.2017 г..
 */
public class StopNumber {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int n = Integer.parseInt(console.nextLine());
        int m = Integer.parseInt(console.nextLine());
        int s = Integer.parseInt(console.nextLine());

        for (int i = m; i >= n; i--) {
            if(i % 3 == 0 && i % 2 == 0){
                if(i == s) {break;}
                System.out.print(i + " ");
            }
        }
    }
}
