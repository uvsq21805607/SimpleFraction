
import java.awt.*;
import java.util.*;


public class fraction{

	private int num;
	private int denum;

	public fraction(int num, int denum){

		this.num = num;
		this.denum = denum;
		
		
	}
	
	public fraction multiplication(fraction A){

		int a = this.num * A.num;
		int b = this.denum * A.denum;

		return new fraction(a,b);
	}



	
@Override

	public String toString(){

		return num + " / " + denum;
	}

}