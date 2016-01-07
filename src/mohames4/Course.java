/*
 Shanaz Mohamed
 Course App - This project is a student information system that 
              helps manage course enrollment
 */

package mohames4;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Course class helps the CourseApp  do course information processing. 
 * Represents course information for course objects 
 * @author Labyrinth
 */
public class Course {

    private String courseId;
    private String courseName;
    private String courseCode;
    private Instructor instructor;
    final ArrayList<Student> roster = new ArrayList<>();

    public String getCourseId() {
        return courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public Instructor getInstructor() {
        return instructor;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }
    
    /**
     * This method adds a student object to the roster and sorts the array list 
     * @param s - takes student object parameter 
     */

    public void addStudent(Student s) {
        roster.add(s);
        Collections.sort(roster);

    }
    
    /**
     * This method removes a student from the course list based on the personId
     * @param personId - takes personId parameter for the student object
     */
    
    public void removeStudent(String personId) {
        Student matchingStudent = null;
        for (Student s : roster) {
            if (personId.equalsIgnoreCase(s.getPersonId())) {
                matchingStudent = s;
            }
        }
        roster.remove(matchingStudent);

        //roster.remove(s); 
        //using this will result concurrent modification exception so we create a variable to return it outside the loop
    }

   
    @Override
    public String toString() {

        String info = ("Course Info\n=============\n"
                + "Course ID: " + courseId
                + "\nCourse Name: " + courseName
                + "\nCourse Code: " + courseCode
                + "\n\nInstructor\n==========\n" + instructor.toString()
                + "\nStudent Roster\n==============\n");

            for (Student s : roster) {
                info = info + s.toString() + "\n";
            }

        return info;
    }

}
