import java.util.Date;

public class Employee {
    private String name;
    private Date dateOfBirth;
    private String position;
    private double coefficientSalary;
    private double basicSalary;

    public Employee(String name, Date dateOfBirth, String position, double coefficientSalary, double basicSalary) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.position = position;
        this.coefficientSalary = coefficientSalary;
        this.basicSalary = basicSalary;
    }

    public String getName() {
        return name;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public String getPosition() {
        return position;
    }

    public double getCoefficientSalary() {
        return coefficientSalary;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public double salary() {
        double allowanceCoefficient;
        if ("Director".equals(position)) {
            allowanceCoefficient = 1.0;
        } else if ("Deputy Director".equals(position)) {
            allowanceCoefficient = 0.8;
        } else if ("Head of Department".equals(position)) {
            allowanceCoefficient = 0.5;
        } else if ("Deputy Department".equals(position)) {
            allowanceCoefficient = 0.4;
        } else {
            allowanceCoefficient = 0.0;
        }
        return (coefficientSalary + allowanceCoefficient) * basicSalary;
    }

    public double socialInsurance() {
        return salary() * 0.06;
    }

    public double unemploymentInsurance() {
        return salary() * 0.01;
    }

    public double realSalary() {
        return salary() - socialInsurance() - unemploymentInsurance();
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Date of Birth: " + dateOfBirth);
        System.out.println("Position: " + position);
        System.out.println("Coefficient Salary: " + coefficientSalary);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("Salary: " + salary());
        System.out.println("Social Insurance: " + socialInsurance());
        System.out.println("Unemployment Insurance: " + unemploymentInsurance());
        System.out.println("Real Salary: " + realSalary());
    }
}
