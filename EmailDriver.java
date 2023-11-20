package TP_MOD_10_1301213389_MUHAMMADFATIHYUMNA;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;

public class EmailDriver {
    public static void main(String[] args) {
        // Buat ArrayList dari Email
        ArrayList<Email> emailList = new ArrayList<>();

        // Isi ArrayList dengan minimal 3 buah object Email
        emailList.add(new Email(1, "fatihyumna@student.telkom.university.ac.id", "Meeting Agenda", "Please find attached the agenda for the meeting.", LocalDate.now(), true));
        emailList.add(new Email(2, "m.fatihyumna20@gmail.com", "Project Update", "Here is the latest update on our project progress.", LocalDate.now(), false));
        emailList.add(new Email(3, "m.fatihyumna25@gmail.com", "Vacation Plans", "Let's discuss our vacation plans for next month.", LocalDate.now(), true));

        // Output ArrayList dengan menggunakan iterator
        System.out.println("All Emails:");
        Iterator<Email> iterator = emailList.iterator();
        while (iterator.hasNext()) {
            iterator.next().display();
        }

        // Output ArrayList dengan hanya mengambil email yang di-starred saja (nilainya true)
        System.out.println("Starred Emails:");
        for (Email email : emailList) {
            if (email.isStarred()) {
                email.display();
            }
        }
    }
}
