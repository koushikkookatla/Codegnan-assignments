import java.util.Scanner;
import static java.lang.System.out;
class AssignmentProgram8{
	public static void main(String[] args){
		var sc=new Scanner(System.in);
		out.print("enter a number: ");
		var num=sc.nextInt();
		var sum=0;
		var temp=num;
		var len=String.valueOf(num).length();
		var rev=0;
		out.println("length of the number:"+len);
		while(temp>0){
			var digit =temp%10;
			sum=sum+digit;
			rev=(rev*10)+digit;
			temp=temp/10;
		}
		out.println("Sum of digits: "+sum);
		out.println("reverse of num:"+rev);
	}
}