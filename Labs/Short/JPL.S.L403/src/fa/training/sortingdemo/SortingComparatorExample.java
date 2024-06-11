package fa.training.sortingdemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import fa.training.model.Fruit;

/**
 * Examples of how to sort data using Comparator
 */
public class SortingComparatorExample {
    /**
     * Sort data with Comparator
     */
    public void sortElementComparator() {
        System.out.println("sortElementComparator() !!!");

        List<Fruit> fruitList = new ArrayList<>();
        Fruit pineappale = new Fruit("Pineapple", "Pineapple description", 70);
        Fruit apple = new Fruit("Apple", "Apple description", 100);
        Fruit orange = new Fruit("Orange", "Orange description", 80);
        Fruit banana = new Fruit("Banana", "Banana description", 90);
        fruitList.add(pineappale);
        fruitList.add(apple);
        fruitList.add(orange);
        fruitList.add(banana);

        System.out.println("Fruits : " + fruitList);
        // Sort fruits by fruit name
        Comparator<Fruit> fruitNameComparator = new Comparator<Fruit>() {
            @Override
            public int compare(Fruit o1, Fruit o2) {
                String fruitName1 = o1.getFruitName().toUpperCase();
                String fruitName2 = o2.getFruitName().toUpperCase();

                // ascending order
                return fruitName1.compareTo(fruitName2);
            }
        };

        Collections.sort(fruitList, fruitNameComparator);
        System.out.println("\nFruits (Sorted by fruit name) : " + fruitList);

        // Sort fruits by quantity
        Comparator<Fruit> quantityComparator = new Comparator<Fruit>() {
            @Override
            public int compare(Fruit o1, Fruit o2) {
                if (o1.getQuantity() < o2.getQuantity())
                    return -1;
                else if (o1.getQuantity() > o2.getQuantity())
                    return 1;
                else
                    return 0;
            }
        };

        Collections.sort(fruitList, quantityComparator);
        System.out.println("\nFruits (Sorted by quantiy) : " + fruitList);
    }
}
