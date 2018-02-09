/* Juan-Diego Castano
   Mr Rosen
   Tuesday,Febuary 5, 2018
   This program will output test marks of three students on two diffrent tests.
*/

import java.awt.*;
import hsa.Console;

public class TestMarks
{
    Console c = new Console ();           // The output console, and class constructor

    public void titles ()   // This is the output
    {
	c.print (' ', 16);
	c.print ("Student", 15);
	c.print ("Test 1", 13);
	c.print ("Test 2", 13);
	c.println ("Test Average");
	c.println ("");

    }


    public void displayMarks ()
    {
	// This is the first line with a name and marks
	c.print (' ', 16); // this puts 16 spaces with the left margen and the name
	c.print ("Donald", 15);
	c.print (45);
	c.print (80, 13);
	c.println ((80 + 45) / 2.0, 16, 2); // This calculates the average of the two tests

	// This is the first line with a name and marks
	c.print (' ', 16); // this puts 16 spaces with the left margen and the name
	c.print ("Mickey");
	c.print (33, 11);
	c.print (39, 13);
	c.println ((33 + 39) / 2.0, 16, 2); // This calculates the average of the two tests

	//This is the third line with name and marks
	c.print (' ', 16); // this puts 16 spaces with the left margen and the name
	c.print ("Bugs");
	c.print (79, 13);
	c.print (92, 13);
	c.print ((78 + 92) / 2.0, 16, 2); // This calculates the average of the two tests

    }


    public static void main (String[] args)
    {
	TestMarks t = new TestMarks ();
	t.titles ();
	t.displayMarks ();

    }


    // Place your program here.  'c' is the output console
} // main method



