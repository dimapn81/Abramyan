package chapter6;

// if3 - if24

import java.util.Arrays;

public class IfPartOne {

	// If3. Дано целое число. Если оно является положительным, то прибавить
	// к нему 1; если отрицательным, то вычесть из него 2; если нулевым, то
	// заменить его на 10. Вывести полученное число.
	static int task3(int a) {
		if (a > 0) {
			a++;
		}
		if (a < 0) {
			a = a - 2;
		}
		if (a == 0) {
			a = 10;
		}
		return a;
	}

	// If4°. Даны три целых числа. Найти количество положительных чисел в
	// исходном наборе.
	static int task4(int a) {
		int count = 0;
		if (a > 0) {
			count++;
		}
		return count;
	}

	// If5. Даны три целых числа. Найти количество положительных и количество
	// отрицательных чисел в исходном наборе.
	static int task5(int a) {
		int count = 0;
		if (a < 0) {
			count++;
		}
		return count;
	}

	// If6°. Даны два числа. Вывести большее из них.
	static int task6(int a, int b) {
		if (a > b) {
			return a;
		} else {
			return b;
		}
	}

	// If7. Даны два числа. Вывести порядковый номер меньшего из них.
	static int task7(int a, int b) {
		if (a < b) {
			return 1;
		} else {
			return 2;
		}
	}

	// If8°. Даны два числа. Вывести вначале большее, а затем меньшее из них.
	static void task8(int a, int b) {
		if (a > b) {
			System.out.println(a + " " + b);
		} else {
			System.out.println(b + " " + a);
		}
	}

	// If9. Даны две переменные вещественного типа: A, B. Перераспределить
	// значения данных переменных так, чтобы в A оказалось меньшее из значений,
	// а в B — большее. Вывести новые значения переменных A и B.
	static void task9(int a, int b) {
		int t;
		if (a > b) {
			t = a;
			a = b;
			b = t;
			System.out.println(a + " " + b);
		}

		else {
			System.out.println(a + " " + b);
		}

	}

	// If10. Даны две переменные целого типа: A и B. Если их значения не равны,
	// то присвоить каждой переменной сумму этих значений, а если равны, то
	// присвоить переменным нулевые значения. Вывести новые значения переменных
	// A и B.
	static void task10(int a, int b) {
		if (a != b) {
			a = a + b;
			b = a;
			System.out.println(a + " " + b);
		} else {
			a = b = 0;
			System.out.println(a + " " + b);
		}
	}

	// If11. Даны две переменные целого типа: A и B. Если их значения не равны,
	// то присвоить каждой переменной большее из этих значений, а если равны, то
	// присвоить переменным нулевые значения. Вывести новые значения переменных
	// A и B.
	static void task11(int a, int b) {
		if (a != b) {
			int max = Math.max(a, b);
			a = b = max;
			System.out.println(a + " " + b);
		} else {
			a = b = 0;
			System.out.println(a + " " + b);
		}
	}

	// If12°. Даны три числа. Найти наименьшее из них.
	static int minimum(int a, int b, int c) {
		int min = Math.min(Math.min(a, b), c);
		return min;
	}

	// If13. Даны три числа. Найти среднее из них (то есть число, расположенное
	// между наименьшим и наибольшим).
	static int maximum(int a, int b, int c) {
		int max = Math.max(Math.max(a, b), c);
		return max;
	}

	static int task13(int a, int b, int c) {

		int[] ar = { a, b, c };
		Arrays.sort(ar);
		// for (int i = 0; i <= ar.length - 1; i++){
		// System.out.println(ar[i]);

		// }

		return ar[1];
	}

	// If14. Даны три числа. Вывести вначале наименьшее, а затем наибольшее из
	// данных чисел.
	static void task14(int a, int b, int c) {
		System.out.println(minimum(a, b, c));
		System.out.println(maximum(a, b, c));
	}

	// If15. Даны три числа. Найти сумму двух наибольших из них.
	static int task15(int a, int b, int c) {
		int sum = 0;
		int[] ar = { a, b, c };
		Arrays.sort(ar);
		sum = ar[1] + ar[2];
		return sum;
	}

	// If16. Даны три переменные вещественного типа: A, B, C. Если их значения
	// упорядочены по возрастанию, то удвоить их; в противном случае заменить
	// значение каждой переменной на противоположное. Вывести новые значения
	// переменных A, B, C.
	static void task16(int a, int b, int c) {
		if (a < b && b < c) {
			a = 2 * a;
			b = 2 * b;
			c = 2 * c;
		} else {
			a = -a;
			b = -b;
			c = -c;
		}
		System.out.println(a + " " + b + " " + c);
	}

	// If17. Даны три переменные вещественного типа: A, B, C. Если их значения
	// упорядочены по возрастанию или убыванию, то удвоить их; в противном
	// случае заменить значение каждой переменной на противоположное. Вывести
	// новые значения переменных A, B, C.
	static void task17(int a, int b, int c) {
		if ((a < b && b < c) || (a > b && b > c)) {
			a = 2 * a;
			b = 2 * b;
			c = 2 * c;
		} else {
			a = -a;
			b = -b;
			c = -c;
		}
		System.out.println(a + " " + b + " " + c);
	}

	// If18. Даны три целых числа, одно из которых отлично от двух других,
	// равных между собой. Определить порядковый номер числа, отличного от
	// остальных.
	static int task18(int a, int b, int c) {
		int number = 0;
		if (a == b) {
			number = 3;
		}
		if (a == c) {
			number = 2;
		}
		if (b == c) {
			number = 1;
		}
		return number;
	}

	// If19. Даны четыре целых числа, одно из которых отлично от трех других,
	// равных между собой. Определить порядковый номер числа, отличного от
	// остальных.
	static int task19(int a, int b, int c, int d) {
		int number = 0;
		if (b == c && c == d) {
			number = 1;
		}
		if (a == c && c == d) {
			number = 2;
		}
		if (a == b && b == d) {
			number = 3;
		}
		if (a == b && b == c) {
			number = 4;
		}
		return number;
	}

	// If20. На числовой оси расположены три точки: A, B, C. Определить, какая
	// из двух последних точек (B или C) расположена ближе к A, и вывести эту
	// точку и ее расстояние от точки A.
	static void task20(int a, int b, int c) {
		int l1 = Math.abs(b - a);
		int l2 = Math.abs(c - a);

		if (l1 < l2) {
			System.out.println("точка b " + b);
			System.out.println("растояние - " + l1);
		} else {
			System.out.println("точка c " + c);
			System.out.println("растояние - " + l2);
		}

	}

	// If21. Даны целочисленные координаты точки на плоскости. Если точка
	// совпадает с началом координат, то вывести 0. Если точка не совпадает с
	// началом координат, но лежит на оси OX или OY, то вывести соответственно 1
	// или 2. Если точка не лежит на координатных осях, то вывести 3.
	static int task21(int x, int y) {
		int result;
		if (x == 0 && y == 0) {
			result = 0;
		} else {
			if (x == 0) {
				result = 2;
			} else {
				if (y == 0) {
					result = 1;
				} else {
					result = 3;
				}
			}
		}
		return result;
	}

	// If22°. Даны координаты точки, не лежащей на координатных осях OX и OY.
	// Определить номер координатной четверти, в которой находится данная
	// точка.
	static int task22(int x, int y) {
		int result = 0;
		if (x == 0 || y == 0) {
			System.out.println("Точка лежит на одной из осей");
		} else {
			if (x > 0 && y > 0) {
				result = 1;
				return result;
			}
			if (x < 0 && y > 0) {
				result = 2;
				return result;
			}
			if (x < 0 && y < 0) {
				result = 3;
				return result;
			}
			if (x > 0 && y < 0) {
				result = 4;
				return result;
			}
		}
		return result;
	}

	static void task23(int x1, int y1, int x2, int y2, int x3, int y3) {
		int x4, y4;
		if (y1 == y2 && x2 == x3) {
			x4 = x1;
			y4 = y3;
			System.out.println(x4 + " " + y4);
		} else {
			if (x1 == x2 && y2 == y3) {
				x4 = x3;
				y4 = y1;
				System.out.println(x4 + " " + y4);
			} else {
				if (x3 == x2 && y2 == y1) {
					x4 = x1;
					y4 = y3;
					System.out.println(x4 + " " + y4);
				} else {
					if (x1 == x2 && y2 == y3) {
						x4 = x3;
						y4 = y1;
						System.out.println(x4 + " " + y4);
					} else {
						System.out.println("входные даные не соответсвуют условиям задачи");
					}
				}
			}
		}
	}

	// If24. Для данного вещественного x найти значение следующей функции f,
	// принимающей вещественные значения:
	// f(x) = 2·sin(x), если x > 0,
	// f(x) = 6 – x, если x <= 0.
	static double task24(float x){
		if (x > 0) {
			return 2 * Math.sin(x);
		} else {
			return 6 - x;
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = (int) (Math.random() * 100) - 50;
		int b = (int) (Math.random() * 100) - 50;
		int c = (int) (Math.random() * 100) - 50;

		// task3

		System.out.println("Task3");
		System.out.println(a);
		System.out.println(task3(a));
		System.out.println(" ");

		// task4
		System.out.println("Task4");
		System.out.println(a + " " + b + " " + c);
		System.out.println(task4(a) + task4(b) + task4(c));
		System.out.println(" ");

		// task5
		System.out.println("Task5");
		System.out.println(a + " " + b + " " + c);
		System.out.println("положительных - " + (task4(a) + task4(b) + task4(c)));
		System.out.println("отрицательных - " + (task5(a) + task5(b) + task5(c)));
		System.out.println(" ");

		// task6
		System.out.println("Task6");
		System.out.println(a + " " + b);
		System.out.println(task6(a, b));
		System.out.println(" ");

		// task7
		System.out.println("Task7");
		System.out.println(a + " " + b);
		System.out.println(task7(a, b));
		System.out.println(" ");

		// task8
		System.out.println("Task8");
		System.out.println(a + " " + b);
		task8(a, b);
		System.out.println(" ");

		// task9
		System.out.println("Task9");
		System.out.println(a + " " + b);
		task9(a, b);
		System.out.println(" ");

		// task10
		System.out.println("Task10");
		System.out.println(a + " " + b);
		task10(a, b);
		System.out.println(" ");

		// task11
		System.out.println("Task11");
		System.out.println(a + " " + b);
		task11(a, b);
		System.out.println(" ");

		// task12
		System.out.println("Task12");
		System.out.println(a + " " + b + " " + c);
		System.out.println(minimum(a, b, c));
		System.out.println(" ");

		// task13
		System.out.println("Task13");
		System.out.println(a + " " + b + " " + c);
		System.out.println(task13(a, b, c));
		System.out.println(" ");

		// task14
		System.out.println("Task14");
		System.out.println(a + " " + b + " " + c);
		task14(a, b, c);
		System.out.println(" ");

		// task15
		System.out.println("Task15");
		System.out.println(a + " " + b + " " + c);
		System.out.println(task15(a, b, c));
		System.out.println(" ");

		// task16
		System.out.println("Task16");
		System.out.println(a + " " + b + " " + c);
		task16(a, b, c);
		System.out.println(" ");

		// a = 1;
		// b = 2;
		// c = 3;
		// task17
		System.out.println("Task17");
		System.out.println(a + " " + b + " " + c);
		task16(a, b, c);
		System.out.println(" ");

		// task18
		int a18 = a;
		int b18 = b;
		int c18 = b;
		System.out.println("Task15");
		System.out.println(a18 + " " + b18 + " " + c18);
		System.out.println(task18(a18, b18, c18));
		System.out.println(" ");

		// task19
		int a19 = a;
		int b19 = b;
		int c19 = a;
		int d19 = a;
		System.out.println("Task19");
		System.out.println(a19 + " " + b19 + " " + c19 + " " + d19);
		System.out.println(task19(a19, b19, c19, d19));
		System.out.println(" ");

		// task20
		System.out.println("Task20");
		System.out.println(a + " " + b + " " + c);
		task20(a, b, c);
		System.out.println(" ");

		int x = (int) (Math.random() * 100) - 50;
		int y = (int) (Math.random() * 100) - 50;

		// task21
		System.out.println("Task21");
		System.out.println(x + " " + y);
		System.out.println(task21(x, y));
		System.out.println(" ");

		// task22
		System.out.println("Task22");
		System.out.println(x + " " + y);
		System.out.println(task22(x, y));
		System.out.println(" ");

		// task23
		int x1 = 1;
		int y1 = 1;
		int x2 = 1;
		int y2 = 3;
		int x3 = 5;
		int y3 = 3;
		System.out.println("Task23");
		// System.out.println(x + " " + y);
		task23(x1, y1, x2, y2, x3, y3);
		System.out.println(" ");
		
		//task24
		float x24 = (float) (Math.random() * 100 - 50);
		System.out.println("Task24");
		System.out.format("x = %.2f%n", x24);
		System.out.format("fx = %.2f%n", task24(x24));
		//System.out.println(task24(x24));
		System.out.println(" ");
	}

}