package handle;

import entity.ClassTechMaster;
import entity.Student;
import entity.TechMasterCenter;

import java.util.ArrayList;
import java.util.Scanner;

public class ClassTechMasterHandle {
    public ClassTechMaster inputTechMasterCenter(Scanner sc){
        System.out.println("Nhập tên môn học:");
        String nameSubject =sc.nextLine();
        StudentHandle studentHandle =new StudentHandle();
        ArrayList<Student> studentArrayList =new ArrayList<>();
        System.out.println("Nhập số bạn học viên:");
        int n=Integer.parseInt(sc.nextLine());
        for(int i=0;i<n;i++){
            System.out.println("Nhập học viên thứ "+(i+1));
            Student student=studentHandle.inputStudent(sc);
            studentArrayList.add(student);
        }
        ClassTechMaster classTechMaster =new ClassTechMaster(nameSubject,studentArrayList);
        return classTechMaster;

    }
    public void addStudentToClass(ClassTechMaster classTechMaster, Scanner sc) {
        StudentHandle studentHandle = new StudentHandle();
        System.out.println("Nhập thông tin học viên muốn thêm vào lớp học:");
        Student student = studentHandle.inputStudent(sc);
        classTechMaster.addStudent(student);
        System.out.println("Đã thêm học viên vào lớp học!");
    }
    public void updateStudentEducation(ClassTechMaster classTechMaster, Scanner sc) {
        System.out.println("Nhập id cần cập nhật:");
        int id =Integer.parseInt(sc.nextLine());
        System.out.println("Cập nhật học lực:");
        String newEducation =sc.nextLine();
        ArrayList<Student> students = classTechMaster.getStudents();
        for (Student student : students) {
            if (student.getId() == id) {
                student.setEducation(newEducation);
                System.out.println("Cập nhật thành công thông tin học viên có Id " + id);
                return;
            }
        }

        System.out.println("Không tìm thấy học viên có Id " + id);
    }
    public void removeStudentFromClass(ClassTechMaster classTechMaster, Scanner sc) {
        System.out.println("Nhập id của học viên muốn xóa:");
        int id = Integer.parseInt(sc.nextLine());
        ArrayList<Student> students = classTechMaster.getStudents();
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId() == id) {
                students.remove(i);
                System.out.println("Đã xóa học viên có id " + id + " khỏi lớp học.");
                return;
            }
        }
        System.out.println("Không tìm thấy học viên có id " + id);
    }


}
