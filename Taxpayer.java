public abstract class Taxpayer extends TaxManager{
    private String id;

    public String getId(){
        return id;
    }

    public double pay() {
        return 0;
    }

    public class Company extends Taxpayer{
        public double pay(){

            return 1000;
        }
    }
    public class Freeland extends Taxpayer{
        public double pay(){
            return 10;
        }
    }
    public class Employee extends Taxpayer{
        public double pay(){
            return 100;
        }
    }
}
