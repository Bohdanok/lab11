package students.task1;
import java.util.List;

public class StudentBuilder {
    private String firstName;
    private String secondName;
    private List<Integer> grades;
    private String group;
    private int age;
    private double height;

    public StudentBuilder setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public StudentBuilder setSecondName(String secondName) {
        this.secondName = secondName;
        return this;
    }

    public StudentBuilder setGrades(List<Integer> grades) {
        this.grades = grades;
        return this;
    }

    public StudentBuilder setGroup(String group) {
        this.group = group;
        return this;
    }

    public StudentBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public StudentBuilder setHeight(double height) {
        this.height = height;
        return this;
    }

    public Student build() {
        Student student = new Student();
        student.setFirstName(this.firstName);
        student.setSecondName(this.secondName);
        student.setGrades(this.grades);
        student.setGroup(this.group);
        student.setAge(this.age);
        student.setHeight(this.height);
        return student;
    }
}
