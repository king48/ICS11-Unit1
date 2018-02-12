// Juan is good 


import java.awt.*;
import hsa.Console;

public class StarWars
{
    Console c = new Console ();
    public void drawTitle ()
    {
	c.print (' ', 29);
	c.println ("Star Wars Limitied");
    }


    public void displaySalary ()
    {
	// subheadings
	c.println (" ");
	c.print (' ', 5);
	c.print ("Employee", 12);
	c.print ("Hourly Rate", 16);
	c.print ("Total Hours Per Week", 26);
	c.println ("Gross monthly Salary");

	// Luke
	double lukeRate = 59.50;
	double lukeHours = 2;
	c.println (" ");
	c.print (' ', 5);
	c.print ("Luke", 14);
	c.print (lukeRate, 0, 2); // have to put dollar sign
	c.print (lukeHours, 19);
	c.println ((lukeRate * lukeHours) * 4, 29, 2);   // have to put dollar sign

	// R3D2
	double R2D2Rate = 4.25; //ask about capitals in this
	int R2D2Hours = 40;
	c.print (' ', 5);
	c.print ("R2D2", 14);
	c.print ("$" + R2D2Rate); // have to put dollar signs
	c.print (R2D2Hours, 20);
	c.println ((R2D2Rate * R2D2Hours) * 4, 28, 2);

    }


    public static void main (String[] args)
    {
	StarWars t = new StarWars ();
	t.drawTitle ();
	t.displaySalary ();
    }
}
