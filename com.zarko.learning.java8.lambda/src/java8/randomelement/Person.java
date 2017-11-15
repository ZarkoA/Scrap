package java8.randomelement;

public class Person {

    String firstName;
    String lastName;

    public Person(String fName, String lName){
        firstName = fName;
        lastName = lName;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }
}
