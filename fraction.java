
import java.awt.*;
import java.util.*;


public class fraction{

	private String op1;
	private String op2;
	private String res;

	public fraction(String op1, String op2, String res){

		this.op1 = op1;
		this.op2 = op2;
		this.res = res;
	}

	@Override

	public String toString(){

		return op1 + " +  " + op2 + " = " + res;
	}

}