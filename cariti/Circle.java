package cariti;

public class Circle {
    double radius;
    String color;


    public double getRadius() {
        return 8;
    }

    public String getColor() {
        return "Red";
    }
    public double getArea(){
        return ((getRadius()*getRadius())*3.14) ;
    }

    public String toString() {
        return "Color: " + getColor() + "/n" + "Area: " + getArea();
    }
}
