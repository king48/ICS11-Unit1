// Juan-Diego Castano
// Mr Rosen
// Tuesday,Febuary 5, 2018

import java.awt.*;
import hsa.Console;

public class MyTextExercise3
{
    Console c;           // The output console
    public MyTextExercise3 ()
    {
	c = new Console ("Testing Arithmetic Operatiors");
    }


    public void output ()  // output
    {
	int num1;
	int num2;
	int answer;
	// assigning statements
	num1 = 78;
	num2 = 254;
	answer = num1 - num2;

	c.println (num1 + "-" + num2 + "=" + answer);
    }


    public static void main (String[] args)
    {
	MyTextExercise3 t = new MyTextExercise3 ();
	t.output ();

    } // main method
} // MyText class
