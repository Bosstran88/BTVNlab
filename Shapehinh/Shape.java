package Shapehinh;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Shape {
   public static void main(String[] args){
            Rectangle rectangle = new Rectangle();
            rectangle.getInformation();
            rectangle.display();
   }

}
class Rectangle {
    double length;
    double width;

    public void getInformation(){
            Scanner scanner = new Scanner(System.in);
            length = scanner.nextDouble();
            width = scanner.nextDouble();

    }
    public double getArea(){
        return (length * width);
    }
    public void display(){
        System.out.println("Area: " + getArea());

    }
}


