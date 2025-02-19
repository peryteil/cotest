import java.util.Scanner;

public class Solution7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();

        int i = a.length();

        for (int l=0;l<i; l++){
            System.out.println(a.charAt(l));
        }
    }
}
