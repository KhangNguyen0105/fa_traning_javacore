package fa.training.main;

import java.io.IOException;

import java.util.List;
import java.util.Scanner;
import java.util.Map.Entry;

import fa.training.services.CourseService;
import fa.training.utils.Constant;
import fa.traning.models.Course;

public class CourseManagement {
    private static List<Course> listNewCourse;
    private static List<Course> listCourse;

    public static void main(String[] args) {
        String choice, status, studentID, courseID;
        Scanner scanner = null;
        List<Course> courseByStudent;
        CourseService courseService = new CourseService();
        try {
            scanner = new Scanner(System.in);
            do {
                System.out.println("---------------------MENU--------------------");
                System.out.println("1. Create new Course");
                System.out.println("2. Save to File");
                System.out.println("3. Sort by Id");
                System.out.println("4. Find by Student");
                System.out.println("5. Remove course");
                System.out.println("6. Course Statistic");
                System.out.println("7. Exit");
                System.out.print("Select: ");

                choice = scanner.nextLine();
                choice = choice.trim();
                switch (choice) {
                    // Create new Course
                    case Constant.INPUT:
                        if (listNewCourse != null)
                            listNewCourse.clear();

                        listNewCourse = courseService.createCourse(scanner);
                        System.out.println("Input done!");
                        break;
                    
                    // Save to file
                    case Constant.SAVE:
                        try {
                            if (listNewCourse == null)
                                throw new IOException();

                            status = courseService.save(listNewCourse);
                            System.out.println("Save: " + status);
                        } catch (Exception e) {
                            System.out.println("Save Fail!");
                        }
                        break;

                    // Sort from file
                    case Constant.SORT:
                        if (listCourse != null)
                            listCourse.clear();

                        try {
                            listCourse = courseService.getAll();
                            if (listCourse == null)
                                throw new IOException();
                                
                            courseService.sortAndDisplay(listCourse);
                        } catch (IOException e) {
                            System.out.println("No data");
                        }
                        break;
                    
                    // Search all the courses that a student has taken
                    case Constant.SEARCH:
                        try {
                            System.out.print("Enter student id: ");
                            studentID = scanner.nextLine();
                            courseByStudent = courseService.getByStudent(studentID);

                            if (courseByStudent == null)
                                throw new IOException();

                            System.out.println("---List of Students---");
                            for (Course course : courseByStudent)
                                System.out.println(course.getId() + "\t"
                                            + course.getTitle() + "\t"
                                            + course.getCredit()
                                            + "\t" + course.getEnrollment());
                        } catch (IOException e) {
                            System.out.println("No Data!");
                        }
                        break;

                    // Remove a course from list courses
                    case Constant.REMOVE:
                        System.out.print("Enter course id to remove: ");
                        courseID = scanner.nextLine();

                        try {
                            status = courseService.remove(courseID);
                            System.out.println("Remove: " + status);
                        } catch (Exception e) {
                            System.out.println("Remove Fail!");
                        }
                        break;

                    // Course statistic
                    case Constant.STATS:
                        if (listCourse != null)
                            listCourse.clear();
                        
                        try {
                            listCourse = courseService.getAll();
                            if (listCourse == null)
                                throw new IOException();

                            for (Course course : listCourse) {
                                System.out.println("---" + course.getId() + "----");
                                for (Entry<String, Integer> entry : course.getStatistic().entrySet())
                                    System.out.println(entry.getKey() + " " + entry.getValue());
                            }
                        } catch (IOException e) {
                            System.out.println("No data");
                        }
                        break;
                    default:
                        choice = Constant.EXIT;
                        break;
                }
            } while (!choice.equalsIgnoreCase(Constant.EXIT));
            
        } catch (Exception e) {
            
        } finally {
            if (scanner != null)
                scanner.close();
        }
    }
}
