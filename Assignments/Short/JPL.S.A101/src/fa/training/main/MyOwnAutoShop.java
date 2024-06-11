package fa.training.main;

import fa.training.entities.*;

public class MyOwnAutoShop {
    public static void main(String[] args) {
        Truck truck1 = new Truck(100, 40000, "Red", 1000);
	    Truck truck2 = new Truck(100, 50000, "Red", 2500);
        Sedan sedan1 = new Sedan(100, 20000, "Red", 18);
        Sedan sedan2 = new Sedan(50, 25000, "Blue", 22);
        Ford ford1 = new Ford(100, 30000, "Black", 2022, 1000);
        Ford ford2 = new Ford(150, 35000, "White", 2023, 1200);
        Car[] cars = {sedan1, sedan2, ford1, ford2, truck1, truck2};

        for (Car car : cars) {
            if (car instanceof Sedan) {
                Sedan sedan = (Sedan) car;
                System.out.println("Car type: Sedan");
                System.out.println("Sale Price: " + sedan.getSalePrice());
            } else if (car instanceof Ford) {
                Ford ford = (Ford) car;
                System.out.println("Car type: Ford");
                System.out.println("Sale Price: " + ford.getSalePrice());
            } else if (car instanceof Truck) {
                Truck truck = (Truck) car;
                System.out.println("Car type: Truck");
                System.out.println("Sale Price: " + truck.getSalePrice());
            }
            System.out.println("-----------------------------");
        }
	}
}
