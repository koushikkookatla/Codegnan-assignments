import java.util.Scanner;

class Program1{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers :");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=0;
		System.out.print("Enter the arithmetic operation to perform");
		char op=sc.next().charAt(0);
		if (op == '+'){
			c=a+b;
			System.out.print("the sum of a & b is :"+c);
		}
		else if(op == '-') {
			c=a-b;
			System.out.print("the difference between a & b is :"+c);
		}
		else if(op =='*') {
			c=a*b;
			System.out.print("the multiplication of a & b is :"+c);
		}
		else if(op == '/') {
			c=a/b;
			System.out.print("the division between a & b is :"+c);
		}
	}
}