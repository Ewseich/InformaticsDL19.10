import java.util.Scanner;
public class task340 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int del = 1;
        for (int i = 1; i <= start; i++) {
            if (start % i == 0) {
                del = i;
                System.out.print(del + " ");
            }
        }
    }
}
