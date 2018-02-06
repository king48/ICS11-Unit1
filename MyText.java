// The "MyText" class.
// Juan-Diego Castano 
// Mr rosen 
// Tuesday,Febuary 5, 2018
// This program will look exactly like what is given to us on the sheet for the first   
import java.awt.*;
import hsa.Console;
// The "My Text" class

public class MyText
{
    Console c;           // The output console
    public MyText ()
    {
	c = new Console ();
    }
    
    public void output () // output  
    {
	c.print (' ', 36);
	c.println ("Designs");

	c.print (' ', 39);
	c.println ("D");

	c.print (' ', 38);
	c.println ("III");

	c.print (' ', 37);
	c.println ("AAAAA");

	c.print (' ', 36);
	c.println ("MMMMMMM");

	c.print (' ', 37);
	c.println ("OOOOO");

	c.print (' ', 38);
	c.println ("NNN");

	c.print (' ', 39);
	c.println ("D");

	c.println (" ");

	c.print (' ', 33);
	c.println ("PARALLELO");

	c.print (' ', 34);
	c.print ("A");
	c.print (' ', 7);
	c.println ("G");

	c.print (' ', 35);
	c.print ("R");
	c.print (' ', 7);
	c.println ("R");

	c.print (' ', 36);
	c.print ("A");
	c.print (' ', 7);
	c.println ("A");

	c.print (' ', 37);
	c.println ("LLELOGRAM");
    }


    public static void main (String[] args)
    {
	MyText t = new MyText ();
	t.output ();

    } // main method
} // MyText class
