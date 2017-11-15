package test.randomelement;

import java8.randomelement.Person;
import java8.randomelement.RandomUtils;

import java.awt.*;


class RandomUtilsTest {
    private static String[] names = {"Joe", "John", "Jane"};
    private static String name = RandomUtils.randomElement(names);

    private static Color[] colors = {Color.RED, Color.GREEN, Color.BLUE};
    private static Color color = RandomUtils.randomElement(colors);

    private static Person[] people = {
            new Person("Larry", "Page"),
            new Person("Larry", "Ellison"),
            new Person("Larry", "Bird"),
            new Person("Larry", "King")
    };
    private static Person person = RandomUtils.randomElement(people);

    private static Integer[] nums = {1, 2, 3, 4};
    private static Integer num = RandomUtils.randomElement(nums);

    public static void main(String[] args){
        System.out.println(name);
        System.out.println(color);
        System.out.println(person.getFirstName() + " " + person.getLastName());
        System.out.println(num.toString());
    }
}