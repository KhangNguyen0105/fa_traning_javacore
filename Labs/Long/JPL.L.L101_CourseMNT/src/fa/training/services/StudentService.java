package fa.training.services;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import fa.training.utils.InvalidIdException;
import fa.training.utils.PhoneFormatException;
import fa.training.utils.Validator;
import fa.traning.models.Student;

public class StudentService {
    /**
     * Create new Student
     * 
     * @param scanner
     * @param maxSize
     * @return
     */
    public Set<Student> createStudent(Scanner scanner, int maxSize) {
        String loop = "";
        String id, name, phone, gender, gpa;
        Student student;
        boolean addStatus = false;

        Set<Student> students = new HashSet<Student>();
        do {
            student = new Student();

            // Set the student id
            do {
                System.out.print("Enter student id: ");
                id = scanner.nextLine();
                try {
                    student.setId(id);
                } catch (InvalidIdException e) {
                    continue;
                }
                break;
            } while (true);

            // Set student name
            System.out.print("Enter student name: ");
            name = scanner.nextLine();
            student.setName(name);

            // Set student gender
            System.out.print("Enter gender: ");
            gender = scanner.nextLine();
            student.setGender(gender);
            
            // Set student gpa
            System.out.print("Enter gpa: ");
            gpa = scanner.nextLine();
            student.setGpa(Double.parseDouble(gpa));

            // Set student phone
            do {
                System.out.print("Enter phone: ");
                phone = scanner.nextLine();
                try {
                    student.setPhone(phone);
                } catch (PhoneFormatException e) {
                    continue;
                }
                break;
            } while (true);

            // Add student to the list
            addStatus = students.add(student);
            if (!addStatus)
                System.out.println("<< Student existed in Enroll! >>");

            // Continue to input?
            if (students.size() < maxSize) {
                System.out.print("Do you want continue to input student for this course (Y/N)?: ");
                loop = scanner.nextLine();
            } else
                loop = "N";

            // Reset the set
            if (loop.charAt(0) != 'Y' && loop.charAt(0) != 'y')
                Validator.getIds().clear();

        } while (loop.charAt(0) == 'Y' || loop.charAt(0) == 'y');

        return students;
    }
}
