package chapter8for;

public class ForPart3 {

	// For21. Дано целое число N (> 0). Используя один цикл, найти сумму
	// 1 + 1/(1!) + 1/(2!) + 1/(3!) + … + 1/(N!)
	// (выражение N! — N–факториал — обозначает произведение всех целых
	// чисел от 1 до N: N! = 1·2·…·N). Полученное число является приближенным
	// значением константы e = exp(1).

	static double task21(int n) {
		double factorial = 1;
		double sum = 0;
		double div = 1;
		for (int i = 1; i <= n; i++) {
			factorial = factorial * i;
			div = 1 / factorial;
			sum = sum + div;
		}
		return sum + 1;
	}

	// For22. Дано вещественное число X и целое число N (> 0). Найти значение
	// выражения 1 + X + X^2/(2!) + … + X^N/(N!) (N! = 1·2·…·N).
	// Полученное число является приближенным значением функции exp в точке X.
	static double task22(double x, int n) {
		double factorial = 1;
		double sum = 0;
		double div = 1;
		double pow = 1;
		for (int i = 1; i <= n; i++) {
			pow = pow * x;
			factorial = factorial * i;
			div = pow / factorial;
			sum = sum + div;
		}
		return sum + 1;
	}

	public static void main(String[] args) {
		// task21
		int n = 3;
		System.out.println(" ");
		System.out.println("Task21");
		System.out.println(n);
		System.out.format("%.2f%n", task21(n));
		System.out.println(" ");

		// task21
		double x = 4;
		
		System.out.println(" ");
		System.out.println("Task21");
		System.out.println(n);
		System.out.format("%.2f%n", task22(x, n));
		System.out.println(" ");

	}

}
