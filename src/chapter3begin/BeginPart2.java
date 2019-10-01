package chapter3begin;

public class BeginPart2 {

	// Begin11. Даны два ненулевых числа. Найти сумму, разность, произведение и
	// частное их модулей.

	static double sum = 0;
	static double dif = 0;
	static double mul = 0;
	static double div = 0;
	
	static void begin11(int a, int b) {
		double aAbs = (double) Math.abs(a);
		double bAbs = (double) Math.abs(b);
		sum = aAbs + bAbs;
		dif = aAbs - bAbs;
		mul = aAbs * bAbs;
		div = aAbs / bAbs;
	}

	public static void main(String[] args) {
		// Begin11
		System.out.println("Begin11");
		int a = 5;
		int b = -10;
		begin11(a, b);
		System.out.printf("сумма их модулей =  %.2f%n", sum);
		System.out.printf("разность их модулей =  %.2f%n", dif);
		System.out.printf("произведение их модулей =  %.2f%n", mul);
		System.out.printf("частное их модулей =  %.2f%n", div);
	}

}
