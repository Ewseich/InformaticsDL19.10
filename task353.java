import java.util.Scanner;
public class task353 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int end = sc.nextInt();
        int summ = 1;
        for (int i = 1; i <= end; i++) {
            summ += Math.pow(2, i);
        }
        System.out.println(summ);
    }
}
