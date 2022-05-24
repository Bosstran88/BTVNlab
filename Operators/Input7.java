package Operators;
import java.util.Scanner;
public class Input7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a =sc.nextInt();
        if (a == 0){
            System.out.println(a + " is equal to 0");
        }else if (a > 0){
            System.out.println(a + " is positive number");
        }else {
            System.out.println(a + " is negative number");
        }
    }
}
