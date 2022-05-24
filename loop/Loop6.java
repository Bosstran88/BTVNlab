package loop;
import java.util.Scanner;

public class Loop6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int Area = 1;
        for (int i = 1 ; i <= n;i++){
            Area *= i;
        }
        System.out.print(Area);
    }
}
