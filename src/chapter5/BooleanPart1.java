package chapter5;

// Boolean1 - Boolean9

public class BooleanPart1 {

	// Boolean1°. Дано целое число A. Проверить истинность высказывания: «Число
	// A является положительным».
	static void task1(int a) {
		System.out.println("Task1");
		if (a > 0) {
			System.out.println("Число А = " + a + " - положительное");
		}
		if (a < 0) {
			System.out.println("Число А = " + a + " - отрицательное");
		}
		if (a == 0) {
			System.out.println("Число А = " + a);
		}
	}

	// Boolean2. Дано целое число A. Проверить истинность высказывания: «Число A
	// является нечетным».
	static void task2(int a) {
		System.out.println("Task2");
		if (a % 2 == 0) {
			System.out.println("Число четное");
		} else {
			System.out.println("Число нечетное");
		}
	}

	// Boolean3. Дано целое число A. Проверить истинность высказывания: «Число A
	// является четным».
	static void task3(int a) {
		System.out.println("Task3");
		if (a % 2 != 0) {
			System.out.println("Число нечетное");
		} else {
			System.out.println("Число четное");
		}
	}

	// Boolean4. Даны два целых числа: A, B. Проверить истинность высказывания:
	// «Справедливы неравенства A > 2 и B ≤ 3».
	static boolean task4(int a, int b) {
		System.out.println("Task4");
		boolean bool = false;
		if (a > 2 && b <= 3) {
			bool = true;
		}
		return bool;
	}

	// Boolean5. Даны два целых числа: A, B. Проверить истинность высказывания:
	// «Справедливы неравенства A ≥ 0 или B < –2».
	static boolean task5(int a, int b) {
		System.out.println("Task5");
		boolean bool = false;
		if (a >= 0 && b < -2) {
			bool = true;
		}
		return bool;
	}

	// Boolean9. Даны два целых числа: A, B. Проверить истинность высказывания:
	// «Хотя бы одно из чисел A и B нечетное».
	static boolean task9(int a, int b) {
		System.out.println("Task9");
		boolean bool = false;
		if ((a % 2 != 0) || (b % 2 != 0)) {
			bool = true;
		}
		return bool;
	}

	// Boolean10. Даны два целых числа: A, B. Проверить истинность
	// высказывания: «Ровно одно из чисел A и B нечетное».
	static boolean task10(int a, int b) {
		boolean bool = false;
		if (a % 2 == 0 || b % 2 == 0) {
			bool = true;
		}
		if (a % 2 == 0 && b % 2 == 0) {
			bool = false;
		}

		return bool;
	}

	// Boolean11. Даны два целых числа: A, B. Проверить истинность высказывания:
	// «Числа A и B имеют одинаковую четность».
	static boolean task11(int a, int b){
		boolean bool = false;
		
		if (a%2 == 0 && b%2 == 0) {
			bool = true;
		}
		if (a%2 == 1 && b%2 == 1) {
			bool = true;
		}
		return bool;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// int a = -1;
		// int b = 2;
		// int c = 3;
		// task1(a);
		// task2(a);
		// task3(a);

		// System.out.println(task4(a, b));
		// System.out.println(task5(a, b));
		// System.out.println("A = " + a + " " + "B = " + b);
		// System.out.print("«Хотя бы одно из чисел A и B нечетное». - it is " +
		// task9(a, b));
		int a = 10;
		int b = 10;
		System.out.println();
		System.out.println(task10(a, b));

	}

}
