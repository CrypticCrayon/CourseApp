/*
 Shanaz Mohamed
 Course App - This project is a student information system that 
 helps manage course enrollment
 */
package mohames4;

/**
 * Student class inherits from Person class. Represents students information.
 * Helps the CourseApp class do the student information processing
 *
 * @author Labyrinth
 */
public class Student extends Person {

    private String major;
    private double gpa;

    public void setMajor(String major) {
        this.major = major;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
    
    public String getMajor() {
        return major;
    }

    public double getGpa() {
        return gpa;
    }

    @Override
    public String toString() {
        return super.toString() + "\t \t" + major + "\t" + gpa ;
    }

}
