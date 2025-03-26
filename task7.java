import java.util.Scanner;

public class task7 {
    public static void reverse(int n, int arr[]){
        if (n==0){
            return;
        }
        System.out.print((arr[n-1]) + " ");
        reverse(n-1, arr);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        reverse(n, arr);
    }
}
