package students.alextrunzo;

public abstract class Person {
    int id;
    String firstName;
    String lastName;
    String email;

    public Person(int id, String firstName, String lastName, String email) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public void getSummary(){
        System.out.println(id + firstName + lastName + email);
    }
}
