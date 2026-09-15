import java.util.Scanner;
import static java.lang.System.out;
class AssignmentProgram9{
	public static void main(String[] args){
		var sc=new Scanner(System.in);
		out.print("enter a number: ");
		var num=sc.nextInt();
		for (int i=0;i<=num;i++){
			if(i%3!=0){
				out.print(i+" ");
			}
		}	
	}
}