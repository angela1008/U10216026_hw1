import java.util.Scanner;


public class TestFunction extends OverrideMethod{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		Function1 f1 = new Function1();
		Function2 f2 = new Function2();
		Function3 f3 = new Function3();
		Function4 f4 = new Function4();
		Function5 f5 = new Function5();
		Function6 f6 = new Function6();
		Function7 f7 = new Function7();
		
		System.out.println("Please enter a number for x:");
		double num1 = input.nextDouble();
		System.out.println("x*x = " + f1.fc1(num1));
		System.out.println("Please enter a number for x:");
		double num2 = input.nextDouble();
		System.out.println("sin(x) = " + f2.fc2(num2));
		System.out.println("Please enter a number for x:");
		double num3 = input.nextDouble();
		System.out.println("cos(x) = " + f3.fc3(num3));
		System.out.println("Please enter a number for x:");
		double num4 = input.nextDouble();
		System.out.println("tan(x) = " + f4.fc4(num4));
		System.out.println("Please enter a number for x:");
		double num5 = input.nextDouble();
		System.out.println("cos(x)+5*sin(x) = " + f5.fc5(num5));
		System.out.println("Please enter a number for x:");
		double num6 = input.nextDouble();
		System.out.println("5*cos(x)+sin(x) = " + f6.fc6(num6));
		System.out.println("Please enter a number for x:");
		double num7 = input.nextDouble();
		System.out.println("log(x)+x*x = " + f7.fc7(num7));
		
	}
}
