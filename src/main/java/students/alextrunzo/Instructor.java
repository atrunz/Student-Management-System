package students.alextrunzo;

import java.util.ArrayList;

public class Instructor extends Person{
    private String department;
    private ArrayList<Student> students = new ArrayList<>();

    public Instructor(int id, String firstName, String lastName, String email, String department) {
        super(id, firstName, lastName, email);
        this.department = department;
    }

    @Override
    public void getSummary() {
        System.out.print("[Instructor] ");
        super.getSummary();
        System.out.print(" Department: " + department + "\n");
    }

    public void createAnnouncement(String message){
        System.out.println("The announcement from instructor " + super.getFirstName() +  " is " + "\"" + message + "\"");
    }

    public void addStudent(Student student){

        students.add(student);
    }

    public void printRoster(){
        for (Student student : students){
           student.getSummary();
        }

    }
}
