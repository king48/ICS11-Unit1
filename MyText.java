// The "MyText" class.
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


    public void output ()
    {
	c.println ("Text in Java");
	c.println ("is called a string");
    }


    public static void main (String[] args)
    {
	MyText t = new MyText ();
	t.output ();

    } // main method
} // MyText class
