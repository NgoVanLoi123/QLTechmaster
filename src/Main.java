import entity.ClassTechMaster;
import entity.Student;
import entity.TechMasterCenter;
import handle.ClassTechMasterHandle;
import handle.TechMasterCenterHandle;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        TechMasterCenterHandle techMasterCenterHandle=new TechMasterCenterHandle();
        TechMasterCenter techMasterCenter =techMasterCenterHandle.inputTechMasterCenter(sc);
        System.out.println(techMasterCenter.toString());
        ClassTechMaster classTechMaster = techMasterCenter.getClassTechMasters().get(0);
        ClassTechMasterHandle classTechMasterHandle =new ClassTechMasterHandle();
        classTechMasterHandle.addStudentToClass(classTechMaster, sc);
        System.out.println(techMasterCenter);
        classTechMasterHandle.updateStudentEducation(classTechMaster,sc);
        System.out.println("Danh sách học viên sau khi cập nhật:");
        System.out.println(techMasterCenter);

        classTechMasterHandle.removeStudentFromClass(classTechMaster, sc);
        System.out.println("Danh sách học viên sau khi xóa là:");
        System.out.println(techMasterCenter);
    }
}