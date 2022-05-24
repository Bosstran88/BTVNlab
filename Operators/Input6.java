package Operators;
import java.util.Scanner;

public class Input6 {
    public static void main(String[] args){
        Scanner exchange = new Scanner(System.in);
        int a = exchange.nextInt();
        int b = exchange.nextInt();
        int c = a;
        a = b;
        b = c;
        System.out.println("aFter wrapping, a = " + a + ", b = "+ b);
    }
}
