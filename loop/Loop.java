package loop;
import java.util.Scanner;

public class Loop {
    public static  void main(String[] args){
        Scanner cs = new Scanner(System.in);
        int n = cs.nextInt();
        for (int i = 0 ; i <= n ;i++ ){
            System.out.print(i + " ");
        }
    }
}
