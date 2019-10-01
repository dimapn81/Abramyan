package chapter13Array;

public class ArrayPart2 {

	// Создание и заполение массива псевдослучайными числами > 0.
	public static int[] randomArray(int n) {
		int[] randomArray = new int[n];
		for (int i = 0; i < randomArray.length; i++) {
			randomArray[i] = (int) (Math.random() * 100 + 1);
		}
		return randomArray;
	}

	// вывод массива
	static void printArray(int ar[]) {
		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i] + ", ");
		}
		System.out.println();
	}

	// Создадим массив с арифметической прогресией для теста task24
	static int[] arithmeticProgressionArray(int n) {
		int d = 4; // разность арифметической прогресии
		int a = 3; // первый член массива
		int[] array = new int[n];
		array[0] = a;
		for (int i = 1; i < array.length; i++) {
			array[i] = a + d * i;
		}
		return array;
		// printArray(array);
	}

	// Array18. Дан массив A ненулевых целых чисел размера 10. Вывести значение
	// первого из тех его элементов AK, которые удовлетворяют неравенству
	// AK < A10. Если таких элементов нет, то вывести 0.
	static void task18(int n) {
		int[] a = randomArray(n);
		printArray(a);
		boolean b = false;
		for (int i = 0; i < a.length; i++) {
			if (a[i] < a[9]) {
				System.out.print(a[i] + ", ");
				b = true;
			}
		}
		if (b == false) {
			System.out.println(0);
		}
	}

	// Array19. Дан целочисленный массив A размера 10. Вывести порядковый номер
	// последнего из тех его элементов AK, которые удовлетворяют двойному
	// неравенству A1 < AK < A10. Если таких элементов нет, то вывести 0.
	static void task19(int n) {
		int[] a = randomArray(n);
		printArray(a);
		boolean b = false;
		int number = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[0] < a[i] && a[i] < a[9]) {
				// System.out.print(a[i] + ", ");
				b = true;
				number = i;

			}
		}
		if (b == false) {
			System.out.println(0);
		} else {
			// первый элемент 1, последний 10
			System.out.println(number + 1);
			// System.out.println(a[number]);
		}
	}

	// Array20. Дан массив размера N и целые числа K и L (1 ≤ K ≤ L ≤ N). Найти
	// сумму элементов массива с номерами от K до L включительно.
	static int task20(int a[], int k, int l) {
		int sum = 0;
		for (int i = k - 1; i <= l - 1; i++) {
			sum = sum + a[i];
		}
		return sum;
	}

	// Array21. Дан массив размера N и целые числа K и L (1 ≤ K ≤ L ≤ N). Найти
	// среднее арифметическое элементов массива с номерами от K до L
	// включительно.
	static double task21(int a[], int k, int l) {
		double average = 0;
		int sum = 0;
		for (int i = k - 1; i <= l - 1; i++) {
			sum = sum + a[i];
		}
		average = (double) sum / (l - k + 1);
		return average;
	}

	// Array22. Дан массив размера N и целые числа K и L (1 < K ≤ L ≤ N). Найти
	// сумму всех элементов массива, кроме элементов с номерами от K до L
	// включительно.
	static int task22(int a[], int k, int l) {
		int sum1 = 0;
		int sum2 = 0;
		int result = 0;
		for (int i = 0; i < a.length; i++) {
			sum1 = sum1 + a[i];
		}
		// System.out.println(sum1);
		for (int i = k - 1; i <= l - 1; i++) {
			sum2 = sum2 + a[i];
		}
		// System.out.println(sum2);
		result = sum1 - sum2;
		return result;
	}

	// Array23. Дан массив размера N и целые числа K и L (1 < K ≤ L ≤ N). Найти
	// среднее арифметическое всех элементов массива, кроме элементов с номерами
	// от K до L включительно.
	static double task23(int a[], int k, int l) {
		double average = 0;
		int sum = 0;
		int sumAll = 0;
		for (int i = 0; i < a.length; i++) {
			sumAll = sumAll + a[i];
		}
		// System.out.println(sumAll);
		// System.out.println(task20(a, k, l));
		sum = sumAll - task20(a, k, l);
		// System.out.println(sum);
		average = (double) sum / (a.length - (l - k + 1));
		return average;
	}

	// Array24. Дан целочисленный массив размера N, не содержащий одинаковых
	// чисел. Проверить, образуют ли его элементы арифметическую прогрессию
	// (см. задание Array3). Если образуют, то вывести разность прогрессии, если
	// нет — вывести 0.

	static int task24(int a[]) {
		int result = 0;
		if ((a[1] - a[0]) == (a[2] - a[1])) {
			result = a[1] - a[0];
		}
		return result;
	}

	public static void main(String[] args) {
		int n = 10;
		// task18
		System.out.println("task18");
		task18(n);
		System.out.println();

		// task19
		System.out.println();
		System.out.println("task19");
		task19(n);

		// task20
		int[] a = randomArray(n);
		int k = 4;
		int l = 7;
		System.out.println();
		System.out.println("task20");
		printArray(a);
		System.out.println(task20(a, k, l));

		// task21
		// int[] a = randomArray(n);
		// int k = 4;
		// int l = 7;
		System.out.println();
		System.out.println("task21");
		printArray(a);
		System.out.println(task21(a, k, l));

		// task22
		// int[] a = randomArray(n);
		// int k = 4;
		// int l = 7;
		System.out.println();
		System.out.println("task22");
		printArray(a);
		System.out.println(task22(a, k, l));

		// task23
		// int[] a = randomArray(n);
		// int k = 4;
		// int l = 7;
		System.out.println();
		System.out.println("task23");
		printArray(a);
		System.out.println(task23(a, k, l));

		// task24
		System.out.println();
		System.out.println("task24");

		// тест с массивом с арифметической прогресией 
		//созданого методом arithmeticProgressionArray(n)
		System.out.println("тест с массивом с арифметической прогресией");
		printArray(arithmeticProgressionArray(n));
		System.out.println(task24(arithmeticProgressionArray(n)));

		System.out.println();

		// проверка рандомного масива созданого методом randomArray(n)
		System.out.println("проверка рандомного масива созданого методом randomArray(n)");
		printArray(randomArray(n));
		System.out.println(task24(randomArray(n)));
		
		//ArrayPart1.randomArray(n);
		

	}
}
