import java.util.Scanner;
public class task339 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int del = 1;
        for (int i = start; i >= 2; i--) {
            if (start % i == 0) {
                del = i;
            }
        }
        System.out.println(del);
    }
}
