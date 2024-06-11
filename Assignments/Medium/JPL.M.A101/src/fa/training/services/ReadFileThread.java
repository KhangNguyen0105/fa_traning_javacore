package fa.training.services;

import java.util.List;

import fa.training.entities.Candidate;

public class ReadFileThread extends Thread {
    private final String filename;
    private List<Candidate> candidates;

    public ReadFileThread(String filename) {
        this.filename = filename;
    }

    @Override
    public void run() {
        this.candidates = Services.readCandidatesFromFile(filename);
    }

    public List<Candidate> getCandidates() {
        return candidates;
    }
}
