package cariti;

public class Car{
    public void accelerate(){
        System.out.println("Car is accelerating !");
    }
    public class LuxuryCar extends Car{
        public void service(){
            System.out.println("LuxuryCar is in service !");
        }
    }
}

