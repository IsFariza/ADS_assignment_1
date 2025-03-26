import java.util.Scanner;

public class task3 {
    public static String check_prime(int n, int i){

        if (i==n){
            return "prime";
        }
        if (n%i==0){
            return "composite";
        }
        return check_prime(n, i+1);
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        System.out.print(check_prime(n, 2));
    }
}
