import java.util.Scanner;
public class task8 {
    public static String checkDigits(char[] s, int[] digits, int i) {
        if (i < 0) {
            return "Yes";
        }
        boolean flag=false;
        for (int digit : digits) {
            if (s[i] ==  (digit + '0')) {
                flag=true;
                break;
            }
        }
        if (flag==false){
            return "No";
        }
        return checkDigits(s, digits, i - 1); // Continue checking
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int[] digits = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        char[] arr = s.toCharArray();
        System.out.println(checkDigits(arr, digits, arr.length - 1));
    }
}
