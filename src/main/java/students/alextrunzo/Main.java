package students.alextrunzo;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Person> persons = new ArrayList<>();
        Person bob = new Instructor(1,"bob", "bobby", "bobf@gmail.com", "Science");

        persons.add(bob);

        persons.getFirst().getSummary();
    }
}
