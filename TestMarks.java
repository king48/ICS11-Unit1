/* Juan-Diego Castano
   Mr Rosen
   Tuesday,Febuary 5, 2018

*/

import java.awt.*;
import hsa.Console;

public class TestMarks
{
    public TestMarks ()
    {
	Console c;           // The output console
    }


    public void Titles ()  // This is the output
    {
	c.print ("Student", 20);
	c.print ("Test 1", 43);
	//c.print ("Test 2", );
	// c.print ("Test 3", );
	//   c.print ("Test Average", );
    }


    /*
	public void line1 ()  // This is the output
	{
	    //  c.print ("Donald", );
	    //c.print (45, );
	    //  c.print (80, );
	    //   c.print ((45 + 80) / 2);

	}


	public void line2 ()  // This is the output
	{

	}


	public void line3 ()  // This is the output
	{

	}

    */
    public TestMarks ()
    {
	c = new Console ();
    }


    public static void main (String[] args)
    {
	TestMarks t;
	t = new TestMarks ();
	t.Titles ();


	// Place your program here.  'c' is the output console
    } // main method
} // TestMakrs class
