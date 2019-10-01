package chapter4;

public class IntegerPartOne {

	static int integer11(int a) {
		int a1 = a / 100;
		// System.out.println(a1);
		int a2 = (a % 100) / 10;
		// System.out.println(a2);
		int a3 = a % 10;
		// System.out.println(a3);
		int sum = a1 + a2 + a3;
		return sum;
	}

	static int integer17(int a) {
		// int a1 = a/1000;
		// System.out.println(a1);
		int a2 = (a % 1000) / 100;
		// System.out.println(a2);
		// int a3 = (a%100)/10;
		// System.out.println(a3);
		// int a4 = a%10;
		// System.out.println(a4);

		return a2;
	}
	static int countingCentury(int year) {
	//int cencury = year/100 + 1;
	
	return year/100 + 1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Integer1 . Дано расстояние L в сантиметрах. Используя операцию
		 * деления наце- ло, найти количество полных метров в нем (1 метр = 100
		 * см).
		 */
		int l = 525;
		int count = l / 100;
		System.out.println(count);

		/*
		 * Integer6. Дано двузначное число. Вывести вначале его левую цифру
		 * (десятки), а затем — его правую цифру (единицы). Для нахождения
		 * десятков исполь- зовать операцию деления нацело, для нахождения
		 * единиц — операцию взятия остатка от деления.
		 */
		int a = 25;
		System.out.println("число " + a);
		int a1 = a / 10;
		int a2 = a % 10;

		System.out.println("левая " + a1);
		System.out.println("правая " + a2);

		/*
		 * Integer7. Дано двузначное число. Найти сумму и произведение его цифр.
		 */
		int sum = a1 + a2;
		System.out.println("сумма " + sum);

		/*
		 * Integer8°. Дано двузначное число. Вывести число, полученное при
		 * перестанов- ке цифр исходного числа.
		 */

		int t = a1;
		a1 = a2;
		a2 = t;

		System.out.println("переставленное " + (a1 * 10 + a2));

		/*
		 * Integer11 °. Дано трехзначное число. Найти сумму и произведение его
		 * цифр
		 */

		a = 256;
		System.out.println("число " + a);
		System.out.println("сумма числа " + integer11(a));

		/*
		 * Integer17. Дано целое число, большее 999. Используя одну операцию
		 * деления нацело и одну операцию взятия остатка от деления, найти
		 * цифру, соответ- ствующую разряду сотен в записи этого числа
		 */

		a = 1024;
		System.out.println("число " + a);
		System.out.println("разряд сотен " + integer17(a));

		/*
		 * Integer19. С начала суток прошло N секунд (N — целое). Найти
		 * количество полных минут, прошедших с начала суток
		 */

		int n = 45545;
		System.out.println("прошло " + n + " секунд");
		int m = n / 60;
		System.out.println("прошло " + m + " минут");

		/*
		 * Integer20°. С начала суток прошло N секунд (N — целое). Найти
		 * количество полных часов, прошедших с начала суток
		 */
		int h = n / (60 * 60);
		System.out.println("прошло " + h + " часов");

		/*
		 * Integer21 . С начала суток прошло N секунд (N — целое). Найти
		 * количество се- кунд, прошедших с начала последней минуты.
		 */

		n = 62;
		System.out.println("прошло " + n + " секунд");
		m = n % 60;
		System.out.println("прошло с последней минуты " + m + " секунд");

		/*
		 * Integer22. С начала суток прошло N секунд (N — целое). Найти
		 * количество се- кунд, прошедших с начала последнего часа
		 */

		n = 3669;
		System.out.println("прошло " + n + " секунд");
		m = n % 3600;
		System.out.println("прошло с последнего часа " + m + " секунд");

		/*
		 * Integer23. С начала суток прошло N секунд (N — целое). Найти
		 * количество полных минут, прошедших с начала последнего часа
		 */

		// n = 3678;
		System.out.println("прошло " + n + " секунд");
		m = (n % 3600) / 60;
		System.out.println("прошло с последнего часа " + m + " минут");

		/*
		 * Integer24. Дни недели пронумерованы следующим образом: 0 —
		 * воскресенье, 1 — понедельник, 2 — вторник, … 6 — суббота. Дано целое
		 * число K, лежащее в диапазоне 1–365. Определить номер дня недели для
		 * K-го дня года, если известно, что в этом году 1 января было
		 * понедельником.
		 */

		int k = 9;
		System.out.println(k + " день года");
		int d = (k % 7) + 3;
		System.out.println("номер дня недели " + d);

		/* Integer24. */

		System.out.println(k + " день года");
		d = (k % 7) + 1;
		System.out.println("номер дня недели " + d);

		/* Integer25. */

		System.out.println(k + " день года");
		d = (k % 7) + 5;
		System.out.println("номер дня недели " + d);

		/*
		 * Integer26. Дни недели пронумерованы следующим образом: 1 —
		 * понедельник, 2 — вторник, …, 6 — суббота, 7 — воскресенье. Дано целое
		 * число K, лежащее в диапазоне 1–365. Определить номер дня недели для
		 * K-го дня года, если известно, что в этом году 1 января было
		 * вторником.
		 */
		System.out.println(k + " день года");
		d = (k % 7) + 1;
		System.out.println("номер дня недели " + d);

		/*
		 * Integer29°. Даны целые положительные числа A, B, C. На прямоугольнике
		 * размера A × B размещено максимально возможное количество квадратов со
		 * стороной C (без наложений). Найти количество квадратов, размещенных
		 * на прямоугольнике, а также площадь незанятой части прямоугольника.
		 */

		int aSize = 15;
		int bSize = 12;
		System.out.println("Сторона A - " + aSize);
		System.out.println("Сторона B - " + bSize);
		int cSize = 5;
		int countA = aSize / cSize; // 15/5=3
		int countB = bSize / cSize; // 12/5=2
		int countC = countA * countB; // 3*2
		System.out.println("Количество квадратов CxC - " + countC);
		int squareAB = aSize * bSize;
		int squareCC = countC * (cSize * cSize);
		int difSquare = squareAB - squareCC;
		System.out.println("Площадь незанятой части прямоугольника - " + difSquare);

		/*
		 * Integer30. Дан номер некоторого года (целое положительное число).
		 * Определить соответствующий ему номер столетия, учитывая, что, к
		 * примеру, началом 20 столетия был 1901 год.
		 */
		
		int year = 2015;
		System.out.println(year + " год");
		System.out.println(countingCentury(year) + " столетие");
		
		
	}

}
