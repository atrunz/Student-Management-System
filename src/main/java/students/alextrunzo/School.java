package students.alextrunzo;

import java.util.ArrayList;

public class School {
    private ArrayList<Student> students;
    private ArrayList<Instructor> instructors;


    public School(ArrayList<Student> students, ArrayList<Instructor> instructors){
        this.students = students;
        this.instructors = instructors;
    }

    public void addStudent(Student student){
        students.add(student);
    }

    public void addInstructor(Instructor instructor){
        instructors.add(instructor);
    }

    public void printSchool(){
        System.out.println("Instructors:");
        for(Instructor instructor : instructors){
            instructor.getSummary();
        }
        System.out.println("Students:");
        for(Student student : students){
            student.getSummary();
        }
    }

}
