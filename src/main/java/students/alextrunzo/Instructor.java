package students.alextrunzo;

import java.util.ArrayList;

public class Instructor extends Person{
    String department;
    ArrayList<Student> students;

    public Instructor(int id, String firstName, String lastName, String email, String department) {
        super(id, firstName, lastName, email);
        this.department = department;
    }

    @Override
    public void getSummary() {
        super.getSummary();
        System.out.println(department);
    }

    public void createAnnouncement(String message){
        System.out.println("The announcement is " + message);
    }

    public void addStudent(Student student){
        students.add(student);
    }

    public void printRoster(){
        System.out.println(students);
    }
}
