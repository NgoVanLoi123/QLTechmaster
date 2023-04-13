package entity;

import java.util.ArrayList;

public class ClassTechMaster {
    private String nameSubject;
    private ArrayList<Student> students;

    public String getNameSubject() {
        return nameSubject;
    }

    public void setNameSubject(String nameSubject) {
        this.nameSubject = nameSubject;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public ClassTechMaster(String nameSubject, ArrayList<Student> students) {
        this.nameSubject = nameSubject;
        this.students = students;
    }

    @Override
    public String toString() {
        return "ClassTechMaster{" +
                "nameSubject='" + nameSubject + '\'' +
                ", students=" + students +
                '}';
    }
    public void addStudent(Student student) {
        this.students.add(student);
    }
}
