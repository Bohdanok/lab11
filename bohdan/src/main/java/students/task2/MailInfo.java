package students.task2;

import students.task2.mailcode.MailCode;

public class MailInfo {
    private Client client;
    // private int mailCode;
    private MailCode mailCode;


    private String generate() {
        // switch (mailCode) {
        //     case 1:
        //         return "BHJKIO!";
        //         // break;
        //     case 2:
        //         return "You won 1,000,000!";
        //     default:
        //         return "test push";
        return mailCode.generate(client);
        }
        // if (mailCode == 1) {
        //     return "BHJKIO!";
        // } else if (mailCode == 2) {
        //     return "You won 1,000,000!";
        // }
        // return "test push";
    }