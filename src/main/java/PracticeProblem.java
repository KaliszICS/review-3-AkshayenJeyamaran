import java.util.Scanner;

public class PracticeProblem {

	public static void main(String args[]) {
		q1();
		q2();
		q3();
		q4();
		q5();
		q6();
		q7();
	}

	public static void q1() {
	Scanner s = new Scanner(System.in);
	System.out.print("In: ");
	String b = s.nextLine();
	System.out.println(b.charAt(0));

		
	}

	public static void q2() {
	Scanner s = new Scanner(System.in);
	System.out.print("In: ");
	boolean b = s.nextBoolean();
	System.out.println(!b);

		
	}

	public static void q3() {
	Scanner s = new Scanner(System.in);
	System.out.print("In: ");
	int b = s.nextInt();
	System.out.println(b>5);
		
	}

	public static void q4() {
	Scanner s = new Scanner(System.in);
	System.out.print("In: ");
	int b = s.nextInt();
	System.out.println(-2 <= b && b <= 2);
		
	}

	public static void q5() {
	Scanner s = new Scanner(System.in);
	System.out.print("In: ");
	String b = s.nextLine();
	System.out.println(b.equals ("Hello World"));
		
	}

	public static void q6() {
	Scanner s = new Scanner(System.in);
	System.out.print("In: ");
	int a = s.nextInt();
	System.out.print("In: ");
	int b = s.nextInt();
	System.out.println(a<=b);
		
	}

	public static void q7() {
	Scanner s = new Scanner(System.in);
	System.out.print("In: ");
	double a = s.nextDouble();
	System.out.print("In: ");
	double b = s.nextDouble();
	System.out.println(a>b);
		
	}

}
