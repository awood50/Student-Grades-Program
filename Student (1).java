
/**
 * A class to demonstrate the equals() and the
 * compareTo() methods.
 * 
 * @author 1337-2.0
 * @version 2/23/17
 */
public class Student
{
    private String lastName;
    private String firstName;
    private int ID;
    private double gpa;
    private int creditHours;

    
    public Student()
    {
        lastName = new String("unknown");
        firstName = new String("unknown");
        ID = 0;
        gpa = 0.0;
        creditHours = 0;
    }

    public Student(String inLast, String inFirst, int inID, double inGPA, int inCredits)
    {
        lastName = new String(inLast);
        firstName = new String(inFirst);
        ID = inID;
        gpa = inGPA > 0? inGPA:0;
        creditHours = inCredits>0?inCredits:0;
    }
    
    public String toString()
    {
        return "\nStudent Name: " + this.lastName + ", " + firstName + "\tID: " + this.ID + "\tGPA: " + this.gpa
        + "\tCredits: " + creditHours;
    }
    
    //The equals() method must return a boolean.
    //When you write this code, you determine what fields to
    //use to determine if two Student objects should be considered equal.
    //Notice the parameter is a reference to another Student
    //Write the compareTo() method based on the fields
    
    public boolean equals(Student other)
    {
        return this.ID == other.ID;
    }
    
    //The compareTo() method must return an int.
    //When you write this code, you determine what fields to
    //use to determine the ordering of two Student objects.
    //Notice the parameter is a reference to another Student
    //Write the compareTo() method based on the fields name
    
    public int compareTo(Student other)
    {
     if(this.lastName.equals(other.lastName))
     {
         return this.firstName.compareTo(other.firstName);
     }
     else
     {
         return this.lastName.compareTo(other.lastName);
     }
    }
    
    public void setGPA(double inG)
    {
        gpa = inG>=0? inG:gpa;
    }

    public void setCredits(double inCredits)
    {
        gpa = inCredits >= 0? inCredits:inCredits;
    }
}
