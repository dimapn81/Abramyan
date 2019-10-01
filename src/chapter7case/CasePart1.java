package chapter7case;

// Case1 - Case11

public class CasePart1 {

	// Case1. Дано целое число в диапазоне 1–7. Вывести строку — название дня
	// недели, соответствующее данному числу (1 — «понедельник», 2 — «вторник» и
	// т. д.).
	static String case1(int n) {
		String day;
		switch (n) {
		case 1:
			day = "понедельник";
			break;
		case 2:
			day = "вторник";
			break;
		case 3:
			day = "среда";
			break;
		case 4:
			day = "четверг";
			break;
		case 5:
			day = "пятница";
			break;
		case 6:
			day = "субота";
			break;
		case 7:
			day = "воскресение";
			break;
		default:
			day = "число больше 7 или менше 1";
			break;
		}
		return day;
	}

	// Case2. Дано целое число K. Вывести строку-описание оценки,
	// соответствующей числу K (1 — «плохо», 2 — «неудовлетворительно», 3 —
	// «удовлетворительно», 4 — «хорошо», 5 — «отлично»). Если K не лежит в
	// диапазоне 1–5, то вывести строку «ошибка».
	static String case2(int n) {
		String score;
		switch (n) {
		case 1:
			score = "плохо";
			break;
		case 2:
			score = "неудовлетворительно";
			break;
		case 3:
			score = "удовлетворительно";
			break;
		case 4:
			score = "хорошо";
			break;
		case 5:
			score = "отлично";
			break;

		default:
			score = "ошибка";
			break;
		}
		return score;
	}

	// Case3. Дан номер месяца — целое число в диапазоне 1–12 (1 — январь, 2 —
	// февраль и т. д.). Вывести название соответствующего времени года («зима»,
	// «весна», «лето», «осень»).
	static String case3(int n) {
		String season;
		switch (n) {
		case 12:
		case 1:
		case 2:
			season = "зима";
			break;
		case 3:
		case 4:
		case 5:
			season = "весна";
			break;
		case 6:
		case 7:
		case 8:
			season = "лето";
			break;
		case 9:
		case 10:
		case 11:
			season = "осень";
			break;

		default:
			season = "ошибка";
			break;
		}
		return season;
	}

	// Case4. Дан номер месяца — целое число в диапазоне 1–12 (1 — январь, 2 —
	// февраль и т. д.). Определить количество дней в этом месяце для
	// невисокосного года.
	static int case4(int n) {
		int numDays = 0;
		switch (n) {
		case 2:
			numDays = 28;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			numDays = 30;
			break;
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			numDays = 31;
			break;

		default:
			System.out.print("ошибка ");
			break;
		}
		return numDays;
	}

	// Case5. Арифметические действия над числами пронумерованы следующим
	// образом: 1 — сложение, 2 — вычитание, 3 — умножение, 4 — деление.
	// Дан номер действия N (целое число в диапазоне 1–4) и вещественные числа A
	// и B (В не равно 0). Выполнить над числами указанное действие и вывести
	// результат.
	static int case5(int a, int b, int operation) {
		int result = 0;

		switch (operation) {
		case 1:
			result = a + b;
			System.out.print(a + " + " + b + " = ");
			break;
		case 2:
			result = a - b;
			System.out.print(a + " - " + b + " = ");
			break;
		case 3:
			result = a * b;
			System.out.print(a + " * " + b + " = ");
			break;
		case 4:
			if (b == 0) {
				System.out.print("деление на ");
			} else {
				result = a / b;
				System.out.print(a + " / " + b + " = ");
				break;
			}
		default:
			System.out.print("ошибка ");
			break;
		}
		return result;
	}

	// Case6. Единицы длины пронумерованы следующим образом:
	// 1 — дециметр,
	// 2 — километр,
	// 3 — метр,
	// 4 — миллиметр,
	// 5 — сантиметр.
	// Дан номер единицы длины (целое число в диапазоне 1–5) и длина отрезка в
	// этих единицах (вещественное число). Найти длину отрезка в метрах.
	static double case6(int n, double x) {
		double result = 0;
		switch (n) {
		case 1:
			result = x * 0.1;
			break;
		case 2:
			result = x * 1000;
			break;
		case 3:
			result = x * 1;
			break;
		case 4:
			result = x * 0.001;
			break;
		case 5:
			result = x * 0.01;
			break;
		default:
			System.out.println("Ошибка");
			break;
		}
		return result;
	}

	// Case7. Единицы массы пронумерованы следующим образом:
	// 1 — килограмм,
	// 2 — миллиграмм,
	// 3 — грамм,
	// 4 — тонна,
	// 5 — центнер.
	// Дан номер единицы массы (целое число в диапазоне 1–5) и масса тела в этих
	// единицах (вещественное число). Найти массу тела в килограммах.
	static double case7(int n, double x) {
		double result = 0;
		switch (n) {
		case 1:
			result = x * 1;
			break;
		case 2:
			result = x * 0.000001;
			break;
		case 3:
			result = x * 0.001;
			break;
		case 4:
			result = x * 1000;
			break;
		case 5:
			result = x * 100;
			break;
		default:
			System.out.println("Ошибка");
			break;
		}
		return result;
	}

	// Case8. Даны два целых числа: D (день) и M (месяц), определяющие
	// правильную дату невисокосного года. Вывести значения D и M для даты,
	// предшествующей указанной.
	static void case8(int d, int m) {

		if (d < 1 || d > 31 || m < 1 || m > 12) {
			System.out.println("ошибка");
		} else {
			switch (m) {
			case 1: {
				if (d == 1) {
					m = 12;
					d = 31;
					break;
				} else {
					d = d - 1;
					m = 12;
					break;
				}
			}
			case 2: {
				if (d == 1) {
					m = m - 1;
					d = 31;
					break;
				} else {
					d = d - 1;
					m = m - 1;
					break;
				}
			}
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12: {
				if (d == 1) {
					m = m - 1;
					d = 28;
					break;
				} else {
					d = d - 1;
					m = m - 1;
					break;
				}
			}
			case 4:
			case 6:
			case 9:
			case 11: {
				if (d == 1) {
					m = m - 1;
					d = 30;
					break;
				} else {
					d = d - 1;
					m = m - 1;
					break;
				}
			}
			}
			System.out.println("D - " + d + " M - " + m);
		}

	}

	// Case9. Даны два целых числа: D (день) и M (месяц), определяющие
	// правильную дату невисокосного года. Вывести значения D и M для даты,
	// следующей за указанной.
	static void case9(int d, int m) {
		if (d < 1 || d > 31 || m < 1 || m > 12) {
			System.out.println("ошибка");
		} else {
			switch (m) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10: {
				if (d == 31) {
					m = m + 1;
					d = 1;
					break;
				} else {
					d = d + 1;
					m = m + 1;
					break;
				}
			}
			case 2: {
				if (d == 28) {
					m = m + 1;
					d = 1;
					break;
				} else {
					d = d + 1;
					m = m + 1;
					break;
				}
			}
			case 4:
			case 6:
			case 9:
			case 11: {
				if (d == 30) {
					m = m + 1;
					d = 1;
					break;
				} else {
					d = d + 1;
					m = m + 1;
					break;
				}
			}
			case 12: {
				if (d == 31) {
					m = 1;
					d = 1;
					break;
				} else {
					d = d + 1;
					m = m + 1;
					break;
				}
			}

			}
			System.out.println("D - " + d + " M - " + m);
		}
	}

	// Case10. Робот может перемещаться в четырех направлениях
	// «С» — север,
	// «З» — запад,
	// «Ю» — юг,
	// «В» — восток
	// и принимать три цифровые команды:
	// 0 — продолжать движение,
	// 1 — поворот налево,
	// –1 — поворот направо.
	// Дан символ C — исходное направление робота и целое число N —
	// посланная ему команда. Вывести направление робота после выполнения
	// полученной команды.
	static char turnLeft(char c) {
		switch (c) {
		case 'С': {
			c = 'З';
			break;
		}
		case 'З': {
			c = 'Ю';
			break;
		}
		case 'Ю': {
			c = 'В';
			break;
		}
		case 'В': {
			c = 'С';
			break;
		}
		}
		return c;
	}

	static char turnRight(char c) {
		switch (c) {
		case 'С': {
			c = 'В';
			break;
		}
		case 'З': {
			c = 'С';
			break;
		}
		case 'Ю': {
			c = 'З';
			break;
		}
		case 'В': {
			c = 'Ю';
			break;
		}
		}
		return c;
	}

	static char case10(char c, int n) {
		switch (n) {
		case 0:
			break;
		case 1: {
			c = turnLeft(c);
			break;
		}
		case -1: {
			c = turnRight(c);
			break;
		}
		}
		return c;
	}

	// Case11. Локатор ориентирован на одну из сторон света
	// «С» — север,
	// «З» — запад,
	// «Ю» — юг,
	// «В» — восток
	// и может принимать три цифровые команды поворота:
	// 1 — поворот налево,
	// –1 — поворот направо,
	// 2 — поворот на 180°.
	// Дан символ C — исходная ориентация локатора и целые числа N1
	// и N2 — две посланные команды. Вывести ориентацию локатора после
	// выполнения этих команд.
	static char case11(char c, int n) {
		switch (n) {
		case 1: {
			c = turnLeft(c);
			break;
		}
		case -1: {
			c = turnRight(c);
			break;
		}
		case 2: {
			c = turnLeft(turnLeft(c));
		}
		}
		return c;
	}

	public static void main(String[] args) {

		// case1
		int n = 4;
		System.out.println("Case1");
		System.out.print(n + " - ");
		System.out.println(case1(n));
		System.out.println(" ");

		// case2
		n = 3;
		System.out.println("Case2");
		System.out.print(n + " - ");
		System.out.println(case2(n));
		System.out.println(" ");

		// case3
		n = 12;
		System.out.println("Case3");
		System.out.print(n + " - ");
		System.out.println(case3(n));
		System.out.println(" ");

		// case4
		n = 15;
		System.out.println("Case4");
		System.out.print(n + " - ");
		System.out.println(case4(n));
		System.out.println(" ");

		// case5
		int a = 5;
		int b = 0;
		int operation = 4;
		System.out.println("Case5");
		System.out.println(a + " " + b);
		System.out.println(case5(a, b, operation));
		System.out.println(" ");

		// case6
		n = 5;
		double x = 48;
		System.out.println("Case6");
		System.out.println(n + "  " + x);
		System.out.format("%.2f%n", case6(n, x));
		System.out.println(" ");

		// case7
		n = 2;
		x = 125;
		System.out.println("Case7");
		System.out.println(n + "  " + x);
		System.out.format("%.6f%n", case7(n, x));
		System.out.println(" ");

		// case8
		int d = 28;
		int m = 2;
		System.out.println("Case8");
		System.out.println("D - " + d + " M - " + m);
		case8(d, m);
		System.out.println(" ");

		// case9
		System.out.println("Case9");
		System.out.println("D - " + d + " M - " + m);
		case9(d, m);
		System.out.println(" ");

		// case10
		char c = 'В';
		n = -1;
		System.out.println("Case10");
		System.out.println("C - " + c + " N - " + n);
		System.out.println(case10(c, n));
		System.out.println(" ");

		// case11
		n = 2;
		System.out.println("Case11");
		System.out.println("C - " + c + " N - " + n);
		System.out.println(case11(c, n));
		System.out.println(" ");

	}

}
