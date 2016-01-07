/*
 Shanaz Mohamed
 Course App - This project is a student information system that 
 helps manage course enrollment
 */
package mohames4;

/**
 * Helps to represent the properties and methods of Person object. This class
 * acts as the superclass for Instructor and Student classes. Helps process
 * person information processing on CourseApp class
 *
 */
public abstract class Person implements Comparable<Person> {

    private String personId;
    private String lastName;
    private String firstName;

    public void setPersonId(String personId) {
        this.personId = personId;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
    public String getPersonId() {
        return personId;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    /**
     * Orders the Person objects according to the order of their lastNames, and
     * if the lastNames are the same then use the order of their firstNames
     * @param p - gets person object p
     * @return i - returns the right order of the objects
     */
    @Override
    public int compareTo(Person p) {
        //return this.lastName.compareTo(p.getLastName()); - if just to sort by last name
        
        int i = this.lastName.compareTo(p.getLastName());

        if (i == 0) {
            i = this.firstName.compareTo(p.getFirstName());
        }
        return i;

    }

    @Override
    public String toString() {

        return personId + "\t" + lastName + " " + firstName;
    }

}
