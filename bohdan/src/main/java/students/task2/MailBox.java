package students.task2;


import java.util.List;

import com.mailjet.client.errors.MailjetException;

public class MailBox {
    private List<MailInfo> infos;

    public void addMailInfo(MailInfo mailInfo) {
        infos.add(mailInfo);
    }

    public void sendAll() {
        MailSender mailSender = new MailSender();
        for (MailInfo mailInfo : infos) {
            try {
                mailSender.sendMail(mailInfo);
            } catch (MailjetException e) {
                e.printStackTrace();
            }
        }
    }

}