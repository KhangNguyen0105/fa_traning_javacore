package fa.training.services;

import java.util.List;

import fa.training.entities.Candidate;

public class DisplayThread extends Thread {
    private List<Candidate> candidates;

    public DisplayThread(List<Candidate> candidates) {
        this.candidates = candidates;
    }

    @Override
    public void run() {
        Services.displayCandidates(candidates);
    }
}
