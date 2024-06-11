package fa.training.abstraction;

import java.util.Scanner;

public class DailyStaff extends Employee {
    private static final int WAGE_DAY = 15;
    private double numberOfWorkday;

    @Override
    public double calcSalary() {
        return numberOfWorkday * WAGE_DAY;
    }

    @Override
    protected void inputData(Scanner scanner) {
        /*
         * Call inputData method from parent class.
         */
        super.inputData(scanner);
        System.out.print("Enter number of workday: ");
        numberOfWorkday = Double.parseDouble(scanner.nextLine());
        System.out.println("-------------------------------------");
    }

    @Override
    protected void display() {
        // Call method of parent class.
        super.display();
        System.out.print("\t" + numberOfWorkday + "\t" + this.calcSalary() + "\n");
    }
}
