package fa.training.util;

import java.util.Scanner;

public class UserInputUtil {
    public static int inputTypeInt(String value) {
        int intValue = 0;
        do {
            try {
                intValue = Integer.parseInt(value);
            } catch (Exception e) {
                System.out.println("Please input int value!");
            }
            break;
        } while (true);
        return intValue;
    }

    public static float inputTypeFloat(String valule) {
        float floatVlue = 0;
        do {
            try {
                floatVlue = Float.parseFloat(valule);
            } catch (Exception e) {
                System.out.println("Please input float value");
            }
            break;
        } while (true);
        return floatVlue;
    }

    public static double inputTypeDouble(String valule) {
        double doubleVlue = 0;
        do {
            try {
                doubleVlue = Double.parseDouble(valule);
            } catch (Exception e) {
                System.out.println("Please input double value");
            }
            break;
        } while (true);
        return doubleVlue;
    }

    public static String checkBillCode(Scanner scanner) {
        String billCode;

        System.out.println("Enter bill code: ");
        billCode = scanner.nextLine();

        while (!Validator.isValidBillCode(billCode)) {
            System.out.print("Invalid bill code, (example B0000): ");
            billCode = scanner.nextLine();
        }
        return billCode;
    }

    
}
