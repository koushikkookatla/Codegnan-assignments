import java.util.Scanner;
import static java.lang.System.out;
class AssignmentProgram2{
	public static void main(String[] args){
		var sc=new Scanner(System.in);
		out.print("enter three numbers: ");
		var num1=sc.nextInt();
		var num2=sc.nextInt();
		var num3=sc.nextInt();
		var greater=num1;
		if (num1 == num2 && num2 == num3){
			out.print("All numbers are equal");
		}else{
		if (num1>greater){
			greater=num1;
		}
		if (num2>greater){
			greater=num2;
		}	
		if (num3>greater){
			greater=num3;
		}
		
		out.print(greater+ "is the highest value");
		}
	}
}