package test;

import java8.lambdas.Utils;

public class standalone {

    public static void main(String[] args) {
        String s = "Test";

        //SomeClass::staticMethod
        String result1 = Utils.transform(s, Utils::makeExciting);
        System.out.println(result1);

        //SomeObject::instanceMethod
        String prefix = "Blah";
        String result2 = Utils.transform(s, prefix::concat);
        System.out.println(result2);

        //SomeClass::instanceMethod
        String result3 = Utils.transform(s, String::toUpperCase);
        System.out.println(result3);
    }
}
