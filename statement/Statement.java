package statement;
import java.util.Scanner;

public class Statement {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a > 0 && b > 0){
            System.out.println("This point lies the First quadrant");
        } else if (a < 0 && b > 0) {
            System.out.println("This point lies the Second quadrant");
        }else if (a < 0 && b < 0){
            System.out.println("This point lies the Third quadrant");
        }else {
            System.out.println("This point lies the Fourth quadrant");
        }
    }
}
