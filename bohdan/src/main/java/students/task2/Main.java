package students.task2;

import java.time.LocalDate;

import com.mailjet.client.errors.MailjetException;

import students.task2.mailcode.MailCode;
import students.task2.mailcode.Prize;

public class Main {

    private static final int YEAR_BIRTH = 1991;
    private static final int MONTH_BIRTH = 3;
    private static final int DAY_BIRTH = 14;

    public static void main(String[] args) {

        Client client = new Client("Oles", 
            LocalDate.of(YEAR_BIRTH, MONTH_BIRTH, DAY_BIRTH), 
            Sex.MALE, 
            "olesdobosevysch.gmail.com"
        );

        MailInfo mailInfo = new MailInfo(client, new Prize());

        System.out.println(mailInfo.generate());

        MailSender sender = new MailSender();

        try {
            sender.sendMail(mailInfo);
        } catch (MailjetException e) {
            e.printStackTrace();
        }

    }
}