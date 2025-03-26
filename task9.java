import java.util.Scanner;

public class task9 {
    public static int binCoef(int n, int k) {
        if (k == 0 || k == n) {
            return 1;
        }
        return binCoef(n - 1, k - 1) + binCoef(n - 1, k);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        System.out.println(binCoef(n, k));
    }
}

