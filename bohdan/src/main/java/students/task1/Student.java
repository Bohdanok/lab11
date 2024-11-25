package students.task1;
import java.util.List;
import lombok.Getter;
import lombok.Singular;
import lombok.experimental.SuperBuilder;

@Getter @SuperBuilder
public class Student extends Human{
    private String firstName;
    private String secondName;
    @Singular
    private List<Integer> grades;
    private String group;
    private int age;
    private double height;

    // Package-private constructor to restrict instantiation to StudentBuilder
    Student() {}

    // Other methods remain the same
}
