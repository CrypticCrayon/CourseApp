/*
 Shanaz Mohamed
 Course App - This project is a student information system that 
              helps manage course enrollment
 */

package mohames4;

/**
 * Instructor class inherits from Person class.
 * Represents instructor information.
 * Helps the CourseApp class do the instructor information processing
 * @author Labyrinth
 */
public class Instructor extends Person{
    
    private String title;
    private String department;

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
    
    public String getTitle() {
        return title;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return  super.toString()+ "\t"+ title + "\t" + department + '\n';
    }
    
}
