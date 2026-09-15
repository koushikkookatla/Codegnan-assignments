import java.util.Scanner;
import static java.lang.System.out;
class AssignmentProgram7{
	public static void main(String[] args){
		var sc=new Scanner(System.in);
		out.print("enter a number: ");
		var num=sc.nextInt();
		if (num>0){
			out.println("The multiplication table of "+num+" is :\n "+ num+"x 1 = "+num*1+"\n"+ num+"x 2 = "+num*2+"\n"+ num+"x 3 = "+num*3+"\n"+ num+"x 4 = "+num*4+"\n"+ num+"x 5 = "+num*5+"\n"+ num+"x 6 = "+num*6+"\n"+ num+"x 7 = "+num*7+"\n"+ num+"x 8 = "+num*8+"\n"+ num+"x 9 = "+num*9+"\n"+ num+"x 10 = "+num*10+"\n");
		} else{
			out.print("enter a valid number");
		}
	}
}