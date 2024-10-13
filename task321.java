import java.util.Scanner;
public class task321 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double summ = 0;
        double znak = 1.0;
        for (int i = 0; i <= n; i += 1) {
            summ += znak / (2 * i + 1);
            znak *= -1;
        }
        System.out.println(4 * summ);
    }
}
