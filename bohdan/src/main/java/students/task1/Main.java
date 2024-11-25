package students.task1;
import java.util.List;

public class Main {

    private static final List<Integer> GRADES = List.of(1, 4, 8, 8);

    public static void main(String[] args) {
        Student student = Student.builder()
                .firstName("John")
                .secondName("Doe")
                .grades(GRADES.subList(0, GRADES.size() - 1))
                .grade(GRADES.get(GRADES.size() - 1))
                .group("A1")
                .gender(Gender.MALE)
                .weight(1488)
                .age(20)
                .height(90.0)
                .build();

        System.out.println(student);

        Student bohdan = new StudentBuilder()
                    .setFirstName("John")
                    .setSecondName("Doe")
                    .setGrades(List.of(90, 85, 78))
                    .setGroup("A1")
                    .setAge(20)
                    .setHeight(180.5)
                    .build();
        System.out.println(bohdan);
        
    }
}