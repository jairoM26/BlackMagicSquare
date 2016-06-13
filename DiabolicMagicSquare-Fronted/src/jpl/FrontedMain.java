package jpl;

import org.jpl7.JPL;
import org.jpl7.Query;
import org.jpl7.Term;

import FrontedGUI.principalWindow;

public class FrontedMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Query q1 = new Query("consult('/home/jairo-m/workspace2/DiabolicMagicSquare-Fronted/src/jpl/prologMagic.pl')");
		System.out.println("consult('/home/jairo-m/workspace2/DiabolicMagicSquare-Fronted/src/jpl/prologMagic.pl')" + " " + (q1.hasSolution() ? "successfull" : "failed"));

		principalWindow pw = new principalWindow();
	}
}
