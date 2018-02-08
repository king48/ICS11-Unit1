/* Juan-Diego Castano
   Mr Rosen
   Tuesday,Febuary 5, 2018
program des. goes here
*/

import java.awt.*;
import hsa.Console;

public class TestMarks
{
    Console c = new Console ();           // The output console, and class constructor
    //  TestMarks t = new TestMarks ();


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


	c.print (' ', 16);
	c.print ("Donald", 15);
	c.print (45);
	c.print (80, 13);
	c.println ((80 + 45) / 2.0, 16, 2);

	c.print (' ', 16);
	c.print ("Mickey", 15);
	c.print (33);
	c.print (39, 13);
	c.println ((33 + 39) / 2.0, 1);
    }





    public static void main (String[] args)
    {
	TestMarks t = new TestMarks ();
	t.displayMarks ();
    }


    // Place your program here.  'c' is the output console
} // main method



