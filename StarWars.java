/*
*/

import java.awt.*;
import hsa.Console;

public class StarWars
{
    Console c = new Console ("Star Wars");
    public void drawTitle ()  // Outputs the title
    {
        c.print (' ', 29);
        c.println ("Star Wars Limitied");
    }


    public void displaySalary ()  // outputs all the data
    {
        // subheadings
        c.println (" ");
        c.print (' ', 5);
        c.print ("Employee", 12);
        c.print ("Hourly Rate", 16);
        c.print ("Total Hours Per Week", 26);
        c.println ("Gross Monthly Salary");

        // Luke
        double lukeRate = 59.50; // How much luke is paid an hour
        double lukeHours = 2; // How many hours Luke horks in a week
        double lukeSalary = (lukeRate * lukeHours) * 4;

        c.println (" ");
        c.print (' ', 5);
        c.print ("Luke", 14);
        c.print ("$");
        c.print (lukeRate, 0, 2);
        c.print (lukeHours, 18);
        c.print (' ', 23);
        c.print ("$");
        c.println (lukeSalary, 0, 2);   // The Gross Monthly Salary of Luke

        // R2D2
        double r2d2Rate = 4.25; // How much R2D2 is paid an hour
        int r2d2Hours = 40; // How many hours R2D2 horks in a week
        double r2d2Salary = (r2d2Rate * r2d2Hours) * 4;

        c.print (' ', 5);
        c.print ("R2D2", 14);
        c.print ("$");
        c.print (r2d2Rate);
        c.print (r2d2Hours, 20);
        c.print (' ', 22);
        c.print ("$");
        c.println (r2d2Salary, 0, 2);  // The Gross Monthly Salary of R2D2

        //CP30
        double c3poRate = 92.00; // How much CP30 is paid an hour
        int c3poHours = 15; // How many hours CP30 horks in a week
        double c3poSalary = (c3poRate * c3poHours) * 4;

        c.print (' ', 5);
        c.print ("C3PO", 14);
        c.print ("$");
        c.print (c3poRate, 0, 2);
        c.print (c3poHours, 19);
        c.print (' ', 22);
        c.print ("$");
        c.print (c3poSalary, 0, 2);  // The Gross Monthly Salary of CP30

    }


    public static void main (String[] args)
    {
        StarWars t = new StarWars ();
        t.drawTitle ();
        t.displaySalary ();
    }
}
