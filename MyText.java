// The "MyText" class.
// Juan-Diego Castano
// Mr Rosen
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


    public void output ()  // output
    {
	c.println ("This is an interger " + 45);
	c.println ("Two intergers " + 15 + " " + 45);
    }


    public static void main (String[] args)
    {
	MyText t = new MyText ();
	t.output ();

    } // main method
} // MyText class
