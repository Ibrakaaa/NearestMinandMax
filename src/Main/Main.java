import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a, b, n, total = 1, i, total1, total2;


        Scanner input = new Scanner(System.in);
        System.out.print("");
        a = input.nextInt();
        System.out.print("");
        b = input.nextInt();
        System.out.print("");
        n = input.nextInt();


        for (i = 1; i <= n; i++) {
            if (a >= 0 && a <= 50) {
                if (b >= 0 && b <= 50) {
                    if (n >= 1 && n <= 15) {
                        total = total * n;
                        total1 = total * b;
                        total2 = total1 + a;

                        System.out.print(total2 + " ");

                    }
                }
            }
        }


    }
}






