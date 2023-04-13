package entity;

import java.util.ArrayList;

public class TechMasterCenter {
    private String manage;
    private String teacher;
    private ArrayList<ClassTechMaster>classTechMasters;

    public String getManage() {
        return manage;
    }

    public void setManage(String manage) {
        this.manage = manage;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public ArrayList<ClassTechMaster> getClassTechMasters() {
        return classTechMasters;
    }

    public void setClassTechMasters(ArrayList<ClassTechMaster> classTechMasters) {
        this.classTechMasters = classTechMasters;
    }

    public TechMasterCenter(String manage, String teacher, ArrayList<ClassTechMaster> classTechMasters) {
        this.manage = manage;
        this.teacher = teacher;
        this.classTechMasters = classTechMasters;
    }

    @Override
    public String toString() {
        return "TechMasterCenter{" +
                "manage='" + manage + '\'' +
                ", teacher='" + teacher + '\'' +
                ", classTechMasters=" + classTechMasters +
                '}';
    }
}
