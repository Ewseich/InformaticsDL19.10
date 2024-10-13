import java.util.Scanner;
public class task320 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int end = sc.nextInt();
        double summ = 0;
        for (int i = 1; i <= end; i++) {
            summ += 1.0 / (i * i);
        }
        System.out.println(summ);
    }
}
