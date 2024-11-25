package students.task2;

import students.task2.mailcode.MailCode;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public class MailInfo {
    @Getter
    private Client client;
    private MailCode mailcode;

    public String generate() {
        return mailcode.generate(client);
    }
}