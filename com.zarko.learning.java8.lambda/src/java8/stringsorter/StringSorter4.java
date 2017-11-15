package java8.stringsorter;

import java.util.Arrays;

public class StringSorter4
{
    public static void doTests() {

        String[] testStrings = {"one", "two", "three", "four"};
        System.out.print("Original: ");

        ArrayUtils.printArray(testStrings);
        Arrays.sort(testStrings, (s1, s2) -> s1.length() - s2.length());
        System.out.println("After sorting by length: ");

        ArrayUtils.printArray(testStrings);
        Arrays.sort(testStrings, (s1, s2) -> s1.charAt(s1.length() -1 ) - s2.charAt(s2.length() -1));
        System.out.print("After sorting by last leter: ");
        ArrayUtils.printArray(testStrings);
    }
}
