package students.alextrunzo;

public class Student extends Person{
    int gradeLevel;
    double gpa;


    public Student(int id, String firstName, String lastName, String email, int gradeLevel, double gpa) {
       super(id, firstName, lastName, email);
       this.gradeLevel = gradeLevel;
        this.gpa = gpa;
    }
    @Override
    public void getSummary() {
        super.getSummary();
        System.out.println(gradeLevel + gpa);
    }

    public boolean isOnHonorRoll(){
        if (gpa > 3.5){
            return true;
        }else{
            return false;
        }
    }
}
