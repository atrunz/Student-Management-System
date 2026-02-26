package students.alextrunzo;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Person> persons = new ArrayList<>();
        ArrayList<Instructor> instructors = new ArrayList<>();
        ArrayList<Student> students = new ArrayList<>();

        Instructor Bob = new Instructor(1,"bob", "bobby", "bob@gmail.com", "Science");
        Instructor Jim = new Instructor(2,"jim", "bobby", "jim@gmail.com", "Computer Science");
        Student kid1 = new Student(3,"kid1", "bobby", "kid1@gmail.com", 1, 1.0);
        Student kid2 = new Student(4,"kid2", "bobby", "kid2@gmail.com", 2, 2.0);
        Student kid3 = new Student(5,"kid3", "bobby", "kid3@gmail.com", 3, 3.0);
        Student kid4 = new Student(6,"kid4", "bobby", "kid4@gmail.com", 4, 4.0);


        Bob.addStudent(kid1);
        Bob.addStudent(kid2);

        Jim.addStudent(kid3);
        Jim.addStudent(kid4);



        persons.add(Bob);
        persons.add(Jim);
        persons.add(kid1);
        persons.add(kid2);
        persons.add(kid3);
        persons.add(kid4);


        instructors.add(Bob);
        instructors.add(Jim);
        students.add(kid1);
        students.add(kid2);
        students.add(kid3);
        students.add(kid4);

        School motCharter = new School(students, instructors);


        for (Person person : persons) {
            person.getSummary();
        }

        System.out.println("School Print");
        motCharter.printSchool();

        System.out.println("Bob Roster");
        Bob.printRoster();


        System.out.println("Jim Roster");
        Jim.printRoster();

        Bob.createAnnouncement("All systems tested. Class Dismissed.");





    }
}
