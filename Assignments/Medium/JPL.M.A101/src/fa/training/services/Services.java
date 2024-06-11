package fa.training.services;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import fa.training.entities.Candidate;
import fa.training.entities.ExperienceCandidate;
import fa.training.entities.FresherCandidate;

public class Services {
    private static final SimpleDateFormat BIRTHDATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd");
    private static final SimpleDateFormat GRADUATION_DATE_FORMAT = new SimpleDateFormat("MM-yyyy");

    public static void writeCandidatesToFile(List<Candidate> candidates, String filename) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            for (Candidate candidate : candidates) {
                writer.write(candidate.toString());
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Candidate> readCandidatesFromFile(String filename) {
        List<Candidate> candidates = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(", ");

                String firstName = parts[0];
                String lastName = parts[1];
                Date birthdate = parseBirthdate(parts[2]);
                String address = parts[3];
                String phone = parts[4];
                String email = parts[5];

                // Candidate
                if (parts.length == 6) {
                    candidates.add(new Candidate(firstName, lastName, birthdate, address, phone, email));

                // Experience Candidate
                } else if (parts.length == 8) {
                    double experience = Double.parseDouble(parts[6]);
                    List<String> skills = Arrays.asList(parts[7].split(";"));
                    candidates.add(new ExperienceCandidate(firstName, lastName, birthdate, address, phone, email, experience, skills));

                // FresherCandidate
                } else if (parts.length == 9) {
                    Date graduationDate = parseGraduationDate(parts[6]);
                    String graduationRank = parts[7];
                    String education = parts[8];
                    candidates.add(new FresherCandidate(firstName, lastName, birthdate, address, phone, email, graduationDate, graduationRank, education));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return candidates;
    }

    private static Date parseBirthdate(String dateStr) {
        try {
            return BIRTHDATE_FORMAT.parse(dateStr);
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
    }

    private static Date parseGraduationDate(String dateStr) {
        try {
            return GRADUATION_DATE_FORMAT.parse(dateStr);
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void displayCandidates(List<Candidate> candidates) {
        System.out.println("----------------------------------------------------------------------------------------------------------------------------");
        System.out.printf("| %-15s | %-15s | %-15s | %-20s | %-15s | %-30s | %-15s | %-20s | %-20s |\n", "First Name", "Last Name", "Birthdate", "Address", "Phone", "Email", "Graduation Date", "Graduation Rank", "Education");
        System.out.println("----------------------------------------------------------------------------------------------------------------------------");

        // Print each candidate's information
        for (Candidate candidate : candidates) {
            if (candidate instanceof ExperienceCandidate) {
                ExperienceCandidate experienceCandidate = (ExperienceCandidate) candidate;
                System.out.printf("| %-15s | %-15s | %-15s | %-20s | %-15s | %-30s | %-15s | %-20s | %-20s |\n",
                        experienceCandidate.getFirstName(), experienceCandidate.getLastName(), experienceCandidate.getBirthdate(), experienceCandidate.getAddress(),
                        experienceCandidate.getPhone(), experienceCandidate.getEmail(), "N/A", "N/A", "N/A");
            } else if (candidate instanceof FresherCandidate) {
                FresherCandidate fresherCandidate = (FresherCandidate) candidate;
                SimpleDateFormat sdf = new SimpleDateFormat("MM-yyyy");
                System.out.printf("| %-15s | %-15s | %-15s | %-20s | %-15s | %-30s | %-15s | %-20s | %-20s |\n",
                        fresherCandidate.getFirstName(), fresherCandidate.getLastName(), fresherCandidate.getBirthdate(), fresherCandidate.getAddress(),
                        fresherCandidate.getPhone(), fresherCandidate.getEmail(), sdf.format(fresherCandidate.getGraduationDate()),
                        fresherCandidate.getGraduationRank(), fresherCandidate.getEducation());
            } else {
                System.out.println("Unknown candidate type");
            }
        }

        System.out.println("----------------------------------------------------------------------------------------------------------------------------");
    }

    public static Date createDate(int year, int month, int day) {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String dateString = String.format("%04d-%02d-%02d", year, month, day);
            return sdf.parse(dateString);
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
    }
}
