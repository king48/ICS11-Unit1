// The "MyText2" class.
// Juan-Diego Castano
// Mr Rosen
// Tuesday,Febuary 5, 2018
// This program will look exactly like what is given to us on the sheet for the first
import java.awt.*;
import hsa.Console;
// The "My Text" class

public class MyText2
{
    Console c;           // The output console
    public MyText ()
    {
	c = new Console ();
    }


    public void output ()  // output
    {
	c.println (250, 0);
	c.println (250, 25);
    }


    public static void main (String[] args)
    {
	MyText t = new MyText2 ();
	t.output ();

    } // main method
} // MyText class
