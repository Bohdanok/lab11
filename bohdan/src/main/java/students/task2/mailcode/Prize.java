package students.task2.mailcode;

import students.task2.Client;

public class Prize implements MailCode{
    @Override
    public String generate(Client client) {
        return "You won 12345678987654$!!";
    } 
}
