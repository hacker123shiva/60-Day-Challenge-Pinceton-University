 

import java.util.Arrays;
import java.util.Comparator;

public class SortUsingJavaArraysUtillClass{
    public static void main(String[] args) {
        // Create an array of objects to be sorted
        Person[] people = {
            new Person("Alice", 25),
            new Person("Bob", 30),
            new Person("Charlie", 22)
        };

        // Define a comparator for sorting by age in ascending order
        Comparator<Person> ageComparator = Comparator.comparingInt(Person::getAge);

        // Sort the array using the comparator
        Arrays.sort(people, ageComparator);

        // Print the sorted array
        for (Person person : people) {
            System.out.println(person);
        }
    }
}

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return name + " (Age: " + age + ")";
    }
}
