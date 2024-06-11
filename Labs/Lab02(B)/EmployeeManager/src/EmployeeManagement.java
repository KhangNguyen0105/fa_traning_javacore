import java.util.Date;
import java.util.Scanner;

public class EmployeeManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Tạo mảng chứa 5 nhân viên
        Employee[] employees = new Employee[5];

        // Khởi tạo thông tin cho từng nhân viên
        for (int i = 0; i < employees.length; i++) {
            System.out.println("Enter information for Employee " + (i + 1));
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Date of Birth (dd/MM/yyyy): ");
            String dobString = scanner.nextLine();
            Date dob = parseDate(dobString);
            System.out.print("Position (Director/Deputy Director/Head of Department/Deputy Department): ");
            String position = scanner.nextLine();
            System.out.print("Coefficient Salary: ");
            double coefficientSalary = scanner.nextDouble();
            System.out.print("Basic Salary: ");
            double basicSalary = scanner.nextDouble();

            scanner.nextLine(); // Đọc ký tự Enter còn lại

            employees[i] = new Employee(name, dob, position, coefficientSalary, basicSalary);
        }

        // Hiển thị thông tin của các nhân viên
        System.out.println("Employee Information:");
        for (Employee employee : employees) {
            employee.display();
            System.out.println("Social Insurance: " + employee.socialInsurance());
            System.out.println("Unemployment Insurance: " + employee.unemploymentInsurance());
            System.out.println("Real Salary: " + employee.realSalary());
            System.out.println("--------------------------");
        }

        // Tính tổng lương của các nhân viên
        double totalSalary = calculateTotalSalary(employees);
        System.out.println("Total Salary of Employees: " + totalSalary);

        // Tìm nhân viên có tuổi cao nhất
        Employee oldestEmployee = findOldestEmployee(employees);
        System.out.println("Employee with the highest age:");
        oldestEmployee.display();

        // Tính lương trung bình của danh sách
        double averageSalary = totalSalary / employees.length;
        System.out.println("Average Salary of Employees: " + averageSalary);

        scanner.close();
    }

    public static Date parseDate(String dateString) {
        return new Date();
    }

    public static double calculateTotalSalary(Employee[] employees) {
        double totalSalary = 0;
        for (Employee employee : employees) {
            totalSalary += employee.salary();
        }
        return totalSalary;
    }

    public static Employee findOldestEmployee(Employee[] employees) {
        Employee oldest = employees[0];
        for (int i = 1; i < employees.length; i++) {
            if (calculateAge(employees[i].getDateOfBirth()) > calculateAge(oldest.getDateOfBirth())) {
                oldest = employees[i];
            }
        }
        return oldest;
    }

    public static int calculateAge(Date dateOfBirth) {
        int currentYear = 2023;
        int birthYear = dateOfBirth.getYear() + 1900; // Năm sinh từ Date cần cộng thêm 1900
        return currentYear - birthYear;
    }
}
