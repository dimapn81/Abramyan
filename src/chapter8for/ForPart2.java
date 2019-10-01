package chapter8for;

public class ForPart2 {

	// For11. Дано целое число N (> 0). Найти сумму
	// 2^N+(N+1)^2+(N+2)^2+…+(2·N)^2 (целое число).
	static int task11(int n) {
		int sum = 0;
		for (int i = 0; i <= n; i++) {
			sum = sum + (n + 1) * (n + 1);
		}
		return sum;
	}

	// For12°. Дано целое число N (> 0). Найти произведение
	// 1.1 · 1.2 · 1.3 · … (N сомножителей)
	static double task12(int n) {
		double multi = 1;
		for (int i = 1; i <= n; i++) {
			multi = multi * (1 + (0.1 * i));
		}
		return multi;
	}

	// For13°. Дано целое число N (> 0). Найти значение выражения
	// 1.1 – 1.2 + 1.3 – … (N слагаемых, знаки чередуются).
	// Условный оператор не использовать.
	static double task13(int n) {
		double sum = 0;

		for (int i = 1; i <= n; i = i + 2) {
			sum = sum + (1 + (0.1 * i));
		}
		for (int i = 2; i <= n; i = i + 2) {
			sum = sum - (1 + (0.1 * i));
		}
		return sum;
	}

	// For14. Дано целое число N (> 0). Найти квадрат данного числа, используя
	// для его вычисления следующую формулу: 2N = 1 + 3 + 5 + … + (2·N – 1).
	// После добавления к сумме каждого слагаемого выводить текущее значение
	// суммы (в результате будут выведены квадраты всех целых чисел от 1
	// до N).
	static void task14(int n) {
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum = sum + (2 * i - 1);
			System.out.print(i + "^2 = ");
			System.out.println(sum);
		}
	}

	// For15°. Дано вещественное число A и целое число N (> 0). Найти A в
	// степени N: AN = A·A· … ·A (числа A перемножаются N раз).

	static int task14(int a, int n) {
		int pow = 1;
		for (int i = 1; i <= n; i++) {
			pow = pow * a;
		}
		return pow;
	}

	// For16°. Дано вещественное число A и целое число N (> 0). Используя один
	// цикл, вывести все целые степени числа A от 1 до N.
	static void task16(int a, int n) {
		int pow = 1;
		for (int i = 1; i <= n; i++) {
			pow = pow * a;
			System.out.println(a + "^" + i + " = " + pow);
		}
	}

	// For17. Дано вещественное число A и целое число N (> 0). Используя один
	// цикл, найти сумму 1 + A + A^2 + A^3 + … + A^N.
	static int task17(int a, int n) {
		int sum = 1;
		int pow = 1;
		for (int i = 1; i <= n; i++) {
			pow = pow * a;
			sum = sum + pow;

		}
		return sum;
	}

	// For18. Дано вещественное число A и целое число N (> 0). Используя один
	// цикл, найти значение выражения 1 – A + A2 – A3 + … + (–1)N·AN.
	// Условный оператор не использовать.
	static int task18(int a, int n) {
		int sum = 0;
		int pow = 1;
		for (int i = 1; i <= n; i++) {
			pow = pow * a;
			pow = -1 * pow;
			sum = sum + pow;
		}
		return sum + 1;
	}

	// For19°. Дано целое число N (> 0). Найти произведение
	// N! = 1·2·…·N (N–факториал). Чтобы избежать целочисленного переполнения,
	// вычислять это произведение с помощью вещественной переменной и вывести
	// его как вещественное число.
	static double task19(int n) {
		double factorial = 1;
		for (int i = 1; i <= n; i++) {
			factorial = factorial * i;
		}
		return factorial;
	}

	// For20°. Дано целое число N (> 0). Используя один цикл, найти сумму
	// 1! + 2! + 3! + … + N! (выражение N! — N–факториал — обозначает
	// произведение всех целых чисел от 1 до N: N! = 1·2·…·N). Чтобы избежать
	// целочисленного переполнения, проводить вычисления с помощью вещественных
	// переменных и вывести результат как вещественное число.
	static double task20(int n) {
		double factorial = 1;
		double sum = 0;
		for (int i = 1; i <= n; i++) {
			factorial = factorial * i;
			sum = sum + factorial;
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// int n = (int) (Math.random() * 10);
		int n = 3;

		// task11
		System.out.println(" ");
		System.out.println("Task11");
		System.out.println(n);
		System.out.println(task11(n));
		System.out.println(" ");

		// task12
		System.out.println(" ");
		System.out.println("Task12");
		System.out.println(n);
		System.out.format("%.2f%n", task12(n));
		System.out.println(" ");

		// task13
		n = 5;
		System.out.println(" ");
		System.out.println("Task13");
		System.out.println(n);
		System.out.format("%.2f%n", task13(n));
		System.out.println(" ");

		// task14
		System.out.println(" ");
		System.out.println("Task14");
		System.out.println(n);
		task14(n);
		System.out.println(" ");

		// task15
		int a = 3;
		n = 4;
		System.out.println(" ");
		System.out.println("Task15");
		System.out.println(a + " " + n);
		System.out.println(task14(a, n));
		System.out.println(" ");

		// task16
		System.out.println(" ");
		System.out.println("Task16");
		System.out.println(a + " " + n);
		task16(a, n);
		System.out.println(" ");

		// task17
		System.out.println(" ");
		System.out.println("Task17");
		System.out.println(a + " " + n);
		System.out.println(task17(a, n));
		System.out.println(" ");

		// task18
		System.out.println(" ");
		System.out.println("Task18");
		System.out.println(a + " " + n);
		System.out.println(task18(a, n));
		System.out.println(" ");

		// task19
		n = 4;
		System.out.println(" ");
		System.out.println("Task19");
		System.out.println(n);
		System.out.println(task19(n));
		System.out.println(" ");

		// task20
		System.out.println(" ");
		System.out.println("Task20");
		System.out.println(n);
		System.out.println(task20(n));
		System.out.println(" ");
		
		
		
	}

}