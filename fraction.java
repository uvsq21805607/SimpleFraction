
import java.awt.*;
import java.util.*;


public class fraction{

	private int nume;
	private int denom;

	public fraction(int nume, int denom){

		this.nume = nume;
		this.denom = denom;
		
		
	}
	
	@Override

	public String toString(){

		return nume + " / " + denom;
	}


	public fraction multiplication(fraction A){

		int a = this.nume * A.nume;
		int b = this.denom * A.denom;

		return new fraction(a,b);
	}

}