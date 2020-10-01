
import java.awt.*;
import java.util.*;
import java.util.Scanner;


public class Main {


	public static void main(String[] args){

		fraction M = new fraction(9, 4);
		fraction L = new fraction(1,9);

		fraction c = L.multiplication(M);

		 System.out.println(" Multiplication : \n ");

		 System.out.println(" Numerateur = " + M.toString() + "\n");

		 System.out.println(" Denominateur = " + L.toString()+ "\n");

		 System.out.println(" Resultat de la multiplication = \n " + c.toString()+ "\n");


	} 
}

