package handle;

import entity.ClassTechMaster;
import entity.TechMasterCenter;

import java.util.ArrayList;
import java.util.Scanner;

public class TechMasterCenterHandle {
    public TechMasterCenter inputTechMasterCenter(Scanner sc){
        System.out.println("Nhập bạn quản lý lớp:");
        String manage =sc.nextLine();
        System.out.println("Nhập giảng viên:");
        String teacher =sc.nextLine();
        System.out.println("Nhập số lớp học:");
        int n=Integer.parseInt(sc.nextLine());
        ArrayList<ClassTechMaster> classTechMasterArrayList =new ArrayList<>();
        ClassTechMasterHandle classTechMasterHandle =new ClassTechMasterHandle();
        for(int i=0;i<n;i++){
            ClassTechMaster classTechMaster =classTechMasterHandle.inputTechMasterCenter(sc);
            classTechMasterArrayList.add(classTechMaster);
        }
        TechMasterCenter techMasterCenter =new TechMasterCenter(manage,teacher,classTechMasterArrayList);
        return techMasterCenter;

    }

}
