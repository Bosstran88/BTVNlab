package loop;
import java.util.Scanner;

public class Loop8 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        for (int i = 0 ;i < 5 ; i ++){
            for (int j = 0;j < 5;j ++){
                System.out.print(i * 5 + j + " ");
            }
            System.out.println();
        }
    }
}
