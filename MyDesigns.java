// The "MyDesigns" class.

// Juan-Diego Castano
// Mr Rosen
// Tuesday,Febuary 5, 2018
//

import java.awt.*;  // gives access to java command libraies
import hsa.Console; // gives access to Console class file

public class MyDesigns
{
    Console c;           // The output console

    public void drawTitle ()  // Draw title method
    {                         // Creates a new instance 
	c.print (' ', 36);
	c.println ("Designs");
	c.println ();
    }


    public void drawParallelogram ()  //
    {

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


    public void drawDiamond ()  //
    {

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
	c.println ();
    }


    public MyDesigns ()
    {
	c = new Console ();
    }


    public static void main (String[] args)
    {
	MyDesigns d;
	d = new MyDesigns ();
	d.drawTitle ();
	d.drawDiamond ();
	d.drawParallelogram ();
    } // main method
} // MyDesigns class
