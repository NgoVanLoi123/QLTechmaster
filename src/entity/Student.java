package entity;

public class Student {
    private int id;
    private static int autoId;
    private String name;
    private int age;
    private String education;

    public Student(String name, int age, String education) {
        this.id =++autoId;
        this.name = name;
        this.age = age;
        this.education = education;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", education='" + education + '\'' +
                '}';
    }
}
