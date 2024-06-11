package fa.training.entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class FresherCandidate extends Candidate {
    private Date graduationDate;
    private String graduationRank;
    private String education;

    public FresherCandidate() {
        super();
    }

    public FresherCandidate(String firstName, String lastName, Date birthdate, String address, String phone, String email, Date graduationDate, String graduationRank, String education) {
        super(firstName, lastName, birthdate, address, phone, email);
        this.graduationDate = graduationDate;
        this.graduationRank = graduationRank;
        this.education = education;
    }

    public Date getGraduationDate() {
        return graduationDate;
    }
    
    public String getGraduationRank() {
        return graduationRank;
    }

    public String getEducation() {
        return education;
    }

    public void setGraduationDate(Date graduationDate) {
        this.graduationDate = graduationDate;
    }

    public void setGraduationRank(String graduationRank) {
        this.graduationRank = graduationRank;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("MM-yyyy");
        return super.toString() + ", " + sdf.format(graduationDate) + ", " + graduationRank + ", " + education;
    }
}