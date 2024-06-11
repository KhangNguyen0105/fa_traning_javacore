package fa.training.entities;

import java.util.Date;
import java.util.List;

public class ExperienceCandidate extends Candidate {
    private double experience;
    private List<String> skills;

    public ExperienceCandidate() {
        super();
    }

    public ExperienceCandidate(String firstName, String lastName, Date birthdate, String address, String phone, String email, double experience, List<String> skills) {
        super(firstName, lastName, birthdate, address, phone, email);
        this.experience = experience;
        this.skills = skills;
    }

    public void setExperience(double experience) {
        this.experience = experience;
    }

    public void setSkills(List<String> skills) {
        this.skills = skills;
    }

    public double getExperience() {
        return experience;
    }

    public List<String> getSkills() {
        return skills;
    }

    @Override
    public String toString() {
        return super.toString() + ", " + experience + ", " + String.join(";", skills);
    }
}
