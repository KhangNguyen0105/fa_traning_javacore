package fa.training.abstraction;

import java.util.Scanner;

public class Manager extends Employee {
    private double wage;
    private double basicSalary;

    @Override
    public double calcSalary() {
        return wage * basicSalary;
    }

    @Override
    protected void inputData(Scanner scanner) {
        /*
         * Call inputData method from parent class.
         */
        super.inputData(scanner);
        System.out.print("Enter basic salary: ");
        basicSalary = Double.parseDouble(scanner.nextLine());
        System.out.println("-------------------------------------");
    }

    @Override
    protected void display() {
        // Call method of parent class.
        super.display();
        System.out.print("\t" + wage + "\t" + basicSalary + "\t" + this.calcSalary() + "\n");
    }
}
