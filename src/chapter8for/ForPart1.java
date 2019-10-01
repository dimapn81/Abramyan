package chapter8for;

public class ForPart1 {

	// For1. Даны целые числа K и N (N > 0). Вывести N раз число K.
	static void task1(int n, int k) {

		if (n > 0) {
			for (int i = 0; i < n; i++) {
				System.out.print(k + " ");
			}
		} else {
			System.out.println(n + " <= 0");
		}
	}

	// For2. Даны два целых числа A и B (A < B). Вывести в порядке возрастания
	// все целые числа, расположенные между A и B (включая сами числа A и B),
	// а также количество N этих чисел.
	static void task2(int a, int b) {

		for (int i = a; i <= b; i++) {
			System.out.print(i + " ");
		}
	}

	// For3. Даны два целых числа A и B (A < B). Вывести в порядке убывания все
	// целые числа, расположенные между A и B (не включая числа A и B), а также
	// количество N этих чисел.
	static void task3(int a, int b) {
		int count = 0;
		for (int i = b - 1; i > a; i--) {
			System.out.print(i + " ");
			count = count + 1;
		}
		System.out.println(" ");
		System.out.println("count - " + count);
	}

	// For4. Дано вещественное число — цена 1 кг конфет. Вывести стоимость 1,
	// 2, …, 10 кг конфет.
	static void task4(float price) {

		for (int i = 1; i <= 10; i++) {
			System.out.print(i + " кг. конфет стоит = ");
			System.out.format("%.2f%n", i * price);
		}
	}

	// For5°. Дано вещественное число — цена 1 кг конфет. Вывести стоимость 0.1,
	// 0.2, …, 1 кг конфет.
	static void task5(float price) {

		for (int i = 1; i <= 10; i++) {
			System.out.format("%.1f", (i * 0.1f));
			System.out.print(" кг. конфет стоит = ");
			System.out.format("%.2f%n", (i * price * 0.1f));
		}
	}

	// For6. Дано вещественное число — цена 1 кг конфет. Вывести стоимость 1.2,
	// 1.4, …, 2 кг конфет.
	static void task6(float price) {

		for (int i = 2; i <= 10; i = i + 2) {
			System.out.format("%.1f", ((i * 0.1f) + 1));
			System.out.print(" кг. конфет стоит = ");
			System.out.format("%.2f%n", (((i * 0.1f) + 1) * price));
		}
	}

	// For7. Даны два целых числа A и B (A < B). Найти сумму всех целых чисел от
	// A до B включительно.

	static int task7(int a, int b) {
		int sum = 0;

		for (int i = a; i <= b; i++) {
			sum = sum + i;
		}
		return sum;
	}

	// For8. Даны два целых числа A и B (A < B). Найти произведение всех целых
	// чисел от A до B включительно.
	static int task8(int a, int b) {
		int multiplication = 1;

		for (int i = a; i <= b; i++) {
			multiplication = multiplication * i;
		}
		return multiplication;
	}

	// For9. Даны два целых числа A и B (A < B). Найти сумму квадратов всех
	// целых чисел от A до B включительно.
	static int task9(int a, int b) {
		int sum = 0;

		for (int i = a; i <= b; i++) {
			sum = sum + (i * i);
		}
		return sum;
	}

	// For10. Дано целое число N (> 0). Найти сумму 1 + 1/2 + 1/3 + … + 1/N
	// (вещественное число).
	static double task10(int n) {
		double sum = 0;

		for (int i = 1; i <= n; i++) {
			sum = sum + (1 / (double) i);
		}
		return sum;
	}

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// int k = (int) (Math.random() * 10 - 5);
		// int n = (int) (Math.random() * 10);
		int k = 11;
		int n = 3;

		// task1
		System.out.println("Task1");
		System.out.println(n + " " + k);
		task1(n, k);
		System.out.println(" ");

		// task2
		int a = 2;
		int b = 4;
		System.out.println(" ");
		System.out.println("Task2");
		System.out.println(a + " " + b);
		task2(a, b);
		System.out.println(" ");

		// task3
		System.out.println(" ");
		System.out.println("Task3");
		System.out.println(a + " " + b);
		task3(a, b);
		System.out.println(" ");

		// task4
		float price = 12.35f;
		System.out.println(" ");
		System.out.println("Task4");
		task4(price);
		System.out.println(" ");

		// task5
		System.out.println(" ");
		System.out.println("Task5");
		task5(price);
		System.out.println(" ");

		// task6
		System.out.println(" ");
		System.out.println("Task6");
		task6(price);
		System.out.println(" ");

		// task7
		System.out.println(" ");
		System.out.println("Task7");
		System.out.println(a + " " + b);
		System.out.println(task7(a, b));
		System.out.println(" ");

		// task8
		System.out.println(" ");
		System.out.println("Task8");
		System.out.println(a + " " + b);
		System.out.println(task8(a, b));
		System.out.println(" ");

		// task9
		System.out.println(" ");
		System.out.println("Task9");
		System.out.println(a + " " + b);
		System.out.println(task9(a, b));
		System.out.println(" ");

		// task10
		System.out.println(" ");
		System.out.println("Task10");
		System.out.println(n);
		System.out.format("%.2f%n", task10(n));
		System.out.println(" ");

		
	}

}