import java.util.Scanner;

/**
 * Created by Dr-Br on 9.1.2017 г..
 */
public class Diamond {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        System.out.println(repeatStr(".", n) + repeatStr("*", 3 * n) + repeatStr(".", n));
        int leftRight = n - 1;
        int middle = 3 * n ;

        for (int i = 0; i < n - 1; i++) {
            System.out.println(repeatStr(".", leftRight) + "*" + repeatStr(".", middle) + "*" + repeatStr(".", leftRight));
            leftRight--;
            middle += 2;
        }System.out.println(repeatStr("*", 5 * n));
            leftRight++;
            middle -= 2;
        for (int i = 1; i <= 2 * n; i++) {
            System.out.println(repeatStr(".", leftRight) + "*" + repeatStr(".", middle) + "*" + repeatStr(".", leftRight));
            leftRight++;
            middle -= 2;
        }System.out.println(repeatStr(".", leftRight) + "*" + repeatStr("*", middle) + "*" + repeatStr(".", leftRight));
    }

    static String repeatStr(String strToRepeat, int count) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; i++) {
            sb.append(strToRepeat);
        }
        return sb.toString();
    }
}