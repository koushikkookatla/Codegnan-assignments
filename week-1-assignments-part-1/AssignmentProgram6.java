import java.util.Scanner;
import static java.lang.System.out;
class AssignmentProgram6{
	public static void main(String[] args){
		var sc=new Scanner(System.in);
		out.print("enter first number: ");
		var num1=sc.nextInt();
		out.print("enter second number: ");
		var num2=sc.nextInt();
		out.print("enter the operation to be done,\n 1 for addition \n 2 for substraction \n 3 for multiplicatio \n 4 for division. ");
		var op=sc.nextInt();
		if (op==1){
			out.print("Addition : "+(num1+num2));
		}else if (op==2){
			out.print("Substraction : "+(num1-num2));
		}else if (op==3){
			out.print("Multiplication : "+(num1*num2));
		}else if (op==4){
			out.print("Division : "+(num1/num2));
		}else{
			out.print("Enter a valid option");
		}
		
		
	}
}