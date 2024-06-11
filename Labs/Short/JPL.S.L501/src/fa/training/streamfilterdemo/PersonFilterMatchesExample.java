package fa.training.streamfilterdemo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import fa.training.model.Person;

/**
 * Examples of how to use filter with matched patterns
 */
public class PersonFilterMatchesExample {
    /**
     * Filter with matched patterns.
     */
    public void filterWithMatchPattern() {
        System.out.println("filterWithMatchPattern() !!!");

        List<Person> personlList = new ArrayList<>();
        Person person1 = new Person("Peter", 25, "peter13@gmail.com");
        Person person2 = new Person("Paul", 30, "paul1987@gmail.com");
        Person person3 = new Person("Tom", 70, "tom1234@gmail.com");
        Person person4 = new Person("Lion", 45, "lioncrone@gmail.com");
        personlList.add(person1);
        personlList.add(person2);
        personlList.add(person3);
        personlList.add(person4);

        List<Person> result = personlList.stream()
                            .filter(person -> person.getEmail().matches(".*gmail\\.com"))
                            .collect(Collectors.toList());
        result.forEach(p -> System.out.println(p.getName()));                            
    }
}
