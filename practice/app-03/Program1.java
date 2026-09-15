import java.util.Scanner;
import static java.lang.System.out;
class Program1{
	public static void main(String[] args){
		var sc=new Scanner(System.in);
		out.print("enter a number");
		var num=sc.nextInt();
		var condition1 = num > 0;
		var condition2 = num < 0;
		var remainder = num %2;
		//var output="";
		if(condition1 || condition2){
			if (condition1){
				out.print("it is a  positive number ");
			}
			else {
				out.print("it is a  negative number ");
			}if (remainder == 0){
				out.print("and an even number");
			}
			else {
				out.print("and an odd number");
			}
			
		}
		else{
			out.print("it is a zero ,please provide an non zero number");
		}
		/*
		if(condition1 || condition2){
			output = (condition1) ? "it is a  positive number" : "it is a  negative number"		;	((short circuit operators))
			output += (remainder == 0) ? "and an even number" : "and an odd number"
		}
		else{
			out.print("it is a zero ,please provide an non zero number");
		}
		
		out.print(output);
		
		
		
		
		*/
			
		/* if(status1 || status2){
			if (status1){
				out.print("it is a  positive number");
			}
			else {
				out.print("it is a  positive number");
			}if (num%2 ==0){
				out.print("and an even number");
			}
			else {
				out.print("and an odd number");
			}
			
		}
		else if (status3){
			out.print("it is a zero ,please provide an non zero number");
		}
			
		*/
		
		/*if (num ==0 ){
			System.out.print("please provide a number other than 0");
		}
		else if ( num < 0){
			System.out.print("please provide a number that is non negative");
		
		else if ( num > 0 && (num/2 == 0)) {
			
			System.out.print("it is a positive number and an even number");
		}
		else if ( num > 0 && (num/2 != 0)) {
			
			System.out.print("it is a positive number and an odd number");
		}
*/
			

		
	}
}