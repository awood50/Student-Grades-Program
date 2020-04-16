import java.io.*;
import java.util.*;

/**
 * This is a driver class used to
 * test the methods of the Student class
 * in learning about equals() and compareTo()
 * 
 * @author 1337-2.0 
 * @version 2/23/17
 */

public class Driver
{
    
    public static void main(String[] args) throws IOException
    {
           
        Student s1; //reference variable will hold the address of a Student object
        Student s2; //reference variable will hold the address of a Student object
        Student s3; //reference variable will hold the address of a Student object
        Student max;
        Student min;
        
        //write the code to create the three Student objects using the constructor that accepts all the values
        
        s1 = new Student();
        s2 = new Student();
        s3 = new Student();
        max = new Student();
        min = new Student();
        
              
        
        //write the code to determine if s1 and s3 should be considered equal.  Be sure to test
        //scenarios where they are equal and where they are not equal.  Also, print resuts
        
        if(s1.equals(s3))
        {
         System.out.print("s1 and s3 are equal");   
        }
        else
        {
            System.out.print("s1 and s3 are not equal");
        }
        
        //Write the code to determine the greatest Student object using the compareTo() method
        if(s1.compareTo(s2)>0)
        {
            max = s1;
        }
        else
        {
            max = s2;
        }
        
        if(s3.compareTo(max)>0)
        {
            max = s3;
        }
        System.out.print("\nThe max is: " + max);
        
        //Write the code to determine the least Student object using the compareTo() method
         if(s1.compareTo(s2)<0)
        {
            min = s1;
        }
        else
        {
            min = s2;
        }
        
        if(s3.compareTo(min)<0)
        {
            min = s3;
        }
        System.out.print("\nThe min is " + min);
    } //end of main()
}
