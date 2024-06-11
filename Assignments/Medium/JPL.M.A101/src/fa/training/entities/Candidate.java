package fa.training.entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Candidate {
    private String firstName;
    private String lastName;
    private Date birthdate;
    private String address;
    private String phone;
    private String email;

    public Candidate() {

    }

    public Candidate(String firstName, String lastName, Date birthdate, String address, String phone, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthdate = birthdate;
        this.address = address;
        this.phone = phone;
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public String getEmail() {
        return email;
    }
    
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhone() {
        return phone;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        return firstName + " " + lastName + ", " + sdf.format(birthdate) + ", " + address + ", " + phone + ", " + email;
    }
}
