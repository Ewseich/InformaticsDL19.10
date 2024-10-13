import java.util.Scanner;
public class task112206 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int summPow2 = 0;
        for (int i = a; i <= b; i++) {
            summPow2 += i * i;
        }
        System.out.println(summPow2);
    }
}