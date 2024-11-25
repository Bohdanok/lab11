package students.task2;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
@ToString @AllArgsConstructor @NoArgsConstructor @Getter
public class Client {
    static private int counter = 0;
    private int id = counter++;
    private String name;
    private LocalDate date;
    private String gender;

}
