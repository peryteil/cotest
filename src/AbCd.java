import java.util.Scanner;

public class AbCd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String newA = "";
        for (int i=0; i<a.length(); i++) {
            if(Character.isUpperCase(a.charAt(i))){
                newA += Character.toString(a.charAt(i)).toLowerCase();
            } else {
                newA += Character.toString(a.charAt(i)).toUpperCase();
            }
        }

        System.out.print(newA);

    }
}