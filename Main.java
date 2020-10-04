
import java.awt.*;
import java.util.*;


public class Main {


	public static void main(String[] args){

//AFFICHAGE SIMPLE D'UNE FRACTION :

		fraction M = new fraction(9, 4);
		
		System.out.println(" fraction 1 = " + M.toString() + "\n");

// MULTIPLICATION DE DEUX FRACTIONS : 

		fraction L = new fraction(1,9);

		fraction c = L.multiplication(M);

		 System.out.println(" Multiplication : \n ");

		 System.out.println( M.toString() + " * " + L.toString() + "\n");

		 System.out.println(" Resultat de la multiplication = \n " + c.toString()+ "\n");


	} 
}

