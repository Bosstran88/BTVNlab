package Operators;
import java.util.Scanner;

public class Input3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int width = sc.nextInt();
        System.out.println("Area = " + length * width);
    }
}
