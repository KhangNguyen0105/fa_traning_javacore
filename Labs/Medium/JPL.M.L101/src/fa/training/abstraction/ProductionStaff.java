package fa.training.abstraction;

import java.util.Scanner;

public class ProductionStaff extends Employee {
    private static final int UNIT_PRICE = 20;
    private double amountOfProduct;

    @Override
    public double calcSalary() {
        return amountOfProduct * UNIT_PRICE;
    }

    @Override
    protected void inputData(Scanner scanner) {
        /*
         * Call inputData method from parent class.
         */
        super.inputData(scanner);
        System.out.print("Enter amount of product: ");
        amountOfProduct = Double.parseDouble(scanner.nextLine());
        System.out.println("-------------------------------------");
    }

    @Override
    protected void display() {
        // Call method of parent class.
        super.display();
        System.out.print("\t" + amountOfProduct + "\t" + this.calcSalary() + "\n");
    }

}
