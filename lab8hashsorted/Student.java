package lab8hashsorted;

import java.util.Scanner;


    public class Student{
        private int id;
        private String firstName;
        private String lastName;
        private double mark;

        public Student(){
        }

        public Student(int id, String firstName,String lastName, double mark){
            this.id= id;
            this.firstName = firstName;
            this.lastName = lastName;
            this.mark = mark;
        }

        public void scanInfo() {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter ID:");
            this.id = scanner.nextInt();
            System.out.print("Enter first name:");
            this.firstName = scanner.nextLine();
            System.out.print("Enter last name:");
            this.lastName= scanner.nextLine();
            System.out.println("Enter mark:");
            this.mark = scanner.nextDouble();
        }

        public int getId(){
            return id;
        }
        public String getFirst(){
            return firstName;
        }
        public String getLast(){
            return lastName;
        }
        public double getMark(){
            return mark;
        }
        public void printInfo(){
            System.out.printf("%3d|%8s%8s|%5f\n", getId(),getFirst(),getLast(), getMark());
        }
    }

