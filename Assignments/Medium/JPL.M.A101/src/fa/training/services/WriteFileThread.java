package fa.training.services;

import java.util.List;

import fa.training.entities.Candidate;

public class WriteFileThread extends Thread {
    private List<Candidate> candidates;
    private String fileName;

    public WriteFileThread(List<Candidate> candidates, String fileName) {
        this.candidates = candidates;
        this.fileName = fileName;
    }

    @Override
    public void run() {
        Services.writeCandidatesToFile(candidates, fileName);
    }
}
