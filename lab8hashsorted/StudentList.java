package lab8hashsorted;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Scanner;

public class StudentList {
    private LinkedList<Student> list;
    private int length;

    public StudentList(){
        list = new LinkedList<Student>();

        list.add(new Student(1,"Tran","Hoang",13));
        list.add(new Student(2,"Nguyen","Trung",12));
        list.add(new Student(3,"Mac","Kien",16));
        list.add(new Student(4,"Huynh","Thuc",20));
        list.add(new Student(5,"Ta","Hoa",15));
        list.add(new Student(6,"Trieu","Hau",14));
        list.add(new Student(7,"Nong","Thu",11));
        list.add(new Student(8,"Hoang","Cao",18));
        list.add(new Student(9,"Hooang","Hai",19));
        list.add(new Student(10,"Tam","Tang",13));
    }
    public void show(){
        list.forEach(student -> System.out.println(student));
    }
    public LinkedList<Student> findByName(String name){
        boolean found = false;
        LinkedList<Student> matches = new LinkedList<>();
        for (Student s:list){
            String fullName = new String(s.getFirst() + " "+ s.getLast());
            if (fullName.matches((".*") + name.toLowerCase() + (".*"))){
                matches.add(s);
                found = true;
            }
        }
        if (found == false){
            System.out.println("Not found");
        }
        return matches;
    }
    public Student findById(int id){
        for (Student s: list){
            if (s.getId() ==id){
                return s;
            }
        }
        return null;
    }
    public void add(Student s){
        list.add(s);
    }
    public void remove(int id){
        boolean found = false;
        for (Student s:list){
            if (s.getId() ==id){
                int choice;
                System.out.println("Are you sure deleting this student? (1.yes 2.No");
                choice = new Scanner(System.in).nextInt();
                if (choice == 1)
                    list.remove(s);
                found= true;
            }
        }
        if (found == false){
            System.out.println("Can not find student with id " + id);
        }
    }

    public void sortByMark(){
        Collections.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return new Double(o1.getMark()).compareTo(o2.getMark());
            }
        });
    }
    public void showList(){
        for (Student s: list){
            s.printInfo();
        }
    }
    public void showList(LinkedList<Student> lists){
        for (Student s: lists){
            s.printInfo();
        }
    }

}


