import java.util.Scanner;
import static java.lang.System.out;
class AssignmentProgram5{
	public static void main(String[] args){
		var sc=new Scanner(System.in);
		out.print("enter a day number: ");
		var num=sc.nextInt();
		if(num ==1){
			out.print("Monday");
		}else if(num ==2){
			out.print("Tuesday");
		}else if(num ==3){
			out.print("Wednesday");
		}else if(num ==4){
			out.print("Thursday");
		}else if(num ==5){
			out.print("Friday");
		}else if(num ==6){
			out.print("Saturday");
		}else if(num ==7){
			out.print("Sunday");
		}else{
			out.print("enter a valid day number");
		}
		
	}
}