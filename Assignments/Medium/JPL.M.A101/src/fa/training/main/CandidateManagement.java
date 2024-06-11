package fa.training.main;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import fa.training.entities.Candidate;
import fa.training.entities.ExperienceCandidate;
import fa.training.entities.FresherCandidate;
import fa.training.services.DisplayThread;
import fa.training.services.ReadFileThread;
import fa.training.services.Services;
import fa.training.services.WriteFileThread;

public class CandidateManagement {
    public static void main(String[] args) throws Exception {
        List<Candidate> candidates = new ArrayList<>();
        candidates.add(new Candidate("Khang", "Nguyen", Services.createDate(2004, 05, 01), "Quy Nhon, Binh Dinh", "123456789", "khang@gmail.com"));
        candidates.add(new ExperienceCandidate("Another Khang", "Nguyen", Services.createDate(2004, 05, 01), "Tay Son, Binh Dinh", "987654321", "anotherkhang@gmail.com", 2, List.of("Java", "SQL")));
        candidates.add(new FresherCandidate("Lien", "Ho", Services.createDate(2004, 01, 02), "Tay Son", "456789123", "lien@gmail.com", new Date(), "Good", "ABC University"));

        // Create 3 concurrent threads
        WriteFileThread writeFileThread = new WriteFileThread(candidates, "candidates.txt");
        ReadFileThread readFileThread = new ReadFileThread("candidates.txt");
        DisplayThread displayThread = new DisplayThread(candidates);

        writeFileThread.start();
        readFileThread.start();
        displayThread.start();

        // Wait for all threads to finish
        try {
            writeFileThread.join();
            readFileThread.join();
            displayThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("All threads have finished execution.");
    }
}
