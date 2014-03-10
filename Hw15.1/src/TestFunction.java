import java.util.Scanner;


public class TestFunction extends OverrideMethod{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a number for x:");
		
		Function1  f1 = new Function1();
		Function2  f2 = new Function2();
		Function3  f3 = new Function3();
		Function4  f4 = new Function4();
		Function5  f5 = new Function5();
		Function6  f6 = new Function6();
		Function7  f7 = new Function7();
		
		System.out.println("輸入數字");
		double num1 = input.nextDouble();
		System.out.println(f1.fc1(num1));
		System.out.println("輸入數字");
		
		double num2 = input.nextDouble();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
	}
}
