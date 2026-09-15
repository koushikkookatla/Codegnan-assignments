import java.util.Scanner;
import static java.lang.System.out;
class AssignmentProgram4{
	public static void main(String[] args){
		var sc=new Scanner(System.in);
		out.print("enter a year: ");
		var year=sc.nextInt();
		if (year%100==0){
			if (year%400==0){
				out.print(year+" is a leap year");
			}
			else{
				out.print(year+" is not a leap year");
			}
		}else if (year%4 == 0){
			out.print(year+" is a leap year");
		}else{
			out.print(year+" is not a leap year");

		}
	}
}