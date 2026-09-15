import java.util.Scanner;
import static java.lang.System.out;
class AssignmentProgram10{
	public static void main(String[] args){
		var sc=new Scanner(System.in);
		var bal=5000;
		var opt=0;
		var temp=0;
		while(opt!=4){
			out.println("1.check balance \n2.Deposit money \n3.Withdraw money \n4.exit .");
			opt=sc.nextInt();
			if(opt == 1){
				out.print("you balance is :"+bal);
			}else if(opt == 2){
				out.print("Enter amount to deposit : ");
				temp=sc.nextInt();
				if(temp<0){
					out.print("enter a valid amount");
				}else{
					bal+=temp;
					out.print("the available balance is "+bal);

				}
			}else if(opt == 3){
				out.print("Enter amount to withdraw : ");
				temp=sc.nextInt();
				if(temp<0 && (temp>bal)){
					out.print("enter a valid amount");
				}else{
					bal-=temp;
					out.print("the available balance is "+bal);
				}
			}else if(opt == 4){
				out.print(" ** Thank you ** ");
				
				
			}else{
				out.print("enter the valid option");
			}
			out.println();
		}
			
	}
}