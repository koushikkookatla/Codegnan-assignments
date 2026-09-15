import java.util.Scanner;
import static java.lang.System.out;
class AssignmentProgram3{
	public static void main(String[] args){
		var sc=new Scanner(System.in);
		out.print("enter Students marks: ");
		var Marks=sc.nextInt();
		if (0 <= Marks && Marks <= 100){
			if(90<= Marks && Marks <=100){
				out.print("the student got A grade");
			}else if(80<= Marks && Marks <=89){
				out.print("the student got B grade");
			}else if(70<= Marks && Marks <=79){
				out.print("the student got C grade");
			}else if(60<= Marks && Marks <=69){
				out.print("the student got D grade");
			}else if(Marks <60){
				out.print("the student got F grade");
			}
		}else{
			out.print("Enter valid Marks");
		}
	}
}