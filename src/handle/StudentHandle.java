package handle;

import entity.Student;

import java.util.Scanner;

public class StudentHandle {
    public Student inputStudent(Scanner sc){
        System.out.println("Nhập name:");
        String name =sc.nextLine();
        System.out.println("Nhập tuổi:");
        int age =Integer.parseInt(sc.nextLine());
        System.out.println("Nhập học lực");
        String education=sc.nextLine();
        Student student =new Student(name,age,education);
        return student;
    }
}
