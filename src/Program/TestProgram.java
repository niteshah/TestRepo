package Program;

import java.util.Scanner;


public class TestProgram {
	public static void main(String[] args) {

		int a = 0;
		int b = 0;
		System.out.println(m1("12345"));
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
	}

	public static boolean m1(String input) {
		try
		{
			Integer.parseInt(input);
		}
		catch(NumberFormatException ex)
		{
			return false;
		}
		return true;
	}
}
