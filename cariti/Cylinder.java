package cariti;

public class Cylinder extends Circle {

    double Height;

    public double getHeight() {
        return 5;
    }

    public double getVolume() {
        return (2*3.14*super.getRadius()*getHeight());
    }

    @Override
    public double getArea() {
        return (2*3.14*super.getRadius()*(super.getRadius()+getHeight()));
    }

    @Override
    public String toString() {
        return "Volum: " + this.getVolume() + "/n" + "Area: " + this.getArea();
    }

}
