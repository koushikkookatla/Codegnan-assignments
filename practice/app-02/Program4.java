
import static java.lang.System.out;

import java.util.Scanner;

class Program4{
	public static void main(String[] args){
		var sc=new Scanner(System.in);
		out.println("Enter two numbers :");
		var a=sc.nextInt();
		var b=sc.nextInt();
		var c=0;
		out.print("""
		Enter + ,for addition,
		Enter -,for substraction,
		Enter *,for multiplication,
		Enter /, for division : 
		""");
		var op=sc.next();
		if (op.equals("+")){
			c=a+b;
			out.print("the sum of a & b is :"+c);
		}
		else if(op.equals("-")) {
			c=a-b;
			out.print("the difference between a & b is :"+c);
		}
		else if(op.equals("*")) {
			c=a*b;
			out.print("the multiplication of a & b is :"+c);
		}
		else if(op.equals("/")) {
			c=a/b;
			out.print("the division between a & b is :"+c);
		}
	}
}