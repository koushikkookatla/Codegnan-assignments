import java.util.Scanner;

class Program2{
	public static void main(String[] args){
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter your name");
		String name=scanner.nextLine();
		//String name=scanner.next();

		System.out.println("Enter your Age");
		int age=scanner.nextInt();
		
		System.out.println();
		System.out.println("\n Your name is :" + name);
		System.out.println("Your age is :"+ age);
		
	}
}