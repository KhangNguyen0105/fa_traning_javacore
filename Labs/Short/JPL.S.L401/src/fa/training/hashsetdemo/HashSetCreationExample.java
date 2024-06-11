package fa.training.hashsetdemo;

import java.util.HashSet;
import java.util.Set;

/*
 * Example of creating a HashSet
 */
public class HashSetCreationExample {
    /*
     * Create a HashSet
     */
    public void createHashSet() {
        System.out.println("createHashSet() !!!");

        Set<String> brands = new HashSet<>();

        brands.add("Wilson");
        brands.add("Nike");
        brands.add("Volvo");
        brands.add("IBM");
        brands.add("IBM");

        int nOfElement = brands.size();
        System.out.format("The set contains %d elements%n", nOfElement);
        System.out.println(brands);
    }
}   
