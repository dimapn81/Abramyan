/**
 * 
 */
package chapter3begin;

/**
 * @author vector
 *
 */
public class BeginPart1 {

	
	 //Begin1. Дана сторона квадрата a. Найти его периметр P = 4·a.	
	static int begin1(int a) {
		int p = 4 * a;
		return p;
	}

	
	//Begin2. Дана сторона квадрата a. Найти его площадь S = a2.
	static int begin2(int a) {
		int s = (int) Math.pow(a, 2);
		return s;
	}

	/**
	 * Begin3. Даны стороны прямоугольника a и b. Найти его площадь S = a·b и
	 * периметр P = 2·(a + b).
	 * 
	 * @param Сторона
	 *            a и сторона b
	 * @return Площадь
	 * @return Периметр
	 */
	static int begin3_1(int a, int b) {
		int s = a * b;
		return s;
	}

	static int begin3_2(int a, int b) {
		int p = 2 * (a + b);
		return p;
	}

	/**
	 * Begin4. Дан диаметр окружности d. Найти ее длину L = π·d. В качестве
	 * значения π использовать 3.14.
	 * 
	 * @param диаметр
	 * @return длина
	 */
	static double begin4(int d) {
		double l = Math.PI * d;
		return l;
	}

	/*
	 * Begin5. Дана длина ребра куба a. Найти объем куба V = a3 и площадь его
	 * поверхности S = 6·a2.
	 */

	static int begin5_1(int a) {
		int v = (int) Math.pow(a, 3);
		return v;
	}

	static int begin5_2(int a) {
		int s = 6 * (int) Math.pow(a, 2);
		return s;
	}

	/*
	 * Begin6. Даны длины ребер a, b, c прямоугольного параллелепипеда. Найти
	 * его объем V = a·b·c и площадь поверхности S = 2·(a·b + b·c + a·c).
	 */
	static int begin6_1(int a, int b, int c) {
		int v = a * b * c;
		return v;
	}

	static int begin6_2(int a, int b, int c) {
		int s = 2 * (a * b + b * c + a * c);
		return s;
	}

	/*
	 * Begin7°. Найти длину окружности L и площадь круга S заданного радиуса R:
	 * L = 2·π·R, S = π·R2. В качестве значения π использовать 3.14.
	 */
	static double begin7_1(int r) {
		double l = 2 * Math.PI * r;
		return l;
	}

	static double begin7_2(int r) {
		double s = Math.PI * Math.pow(r, 2);
		return s;
	}

	/*
	 * Begin8. Даны два числа a и b. Найти их среднее арифметическое: (a + b)/2.
	 */
	static double begin8(int a, int b) {
		double average = (double) (a + b) / 2;
		return average;
	}

	/*
	 * Begin9. Даны два неотрицательных числа a и b. Найти их среднее
	 * геометрическое, то есть квадратный корень из их произведения: a ⋅b .
	 */
	static double begin9(int a, int b) {
		double geometricMean = (double) Math.sqrt(a * b);
		return geometricMean;
	}

	/*
	 * Begin10. Даны два ненулевых числа. Найти сумму(sum), разность(dif),
	 * произведение(mul) и частное(div) их квадратов.
	 */
	static double sum = 0;
	static double dif = 0;
	static double mul = 0;
	static double div = 0;

	static void begin10(int a, int b) {
		double a2 = (double) Math.pow(a, 2);
		double b2 = (double) Math.pow(b, 2);
		sum = a2 + b2;
		dif = a2 - b2;
		mul = a2 * b2;
		div = a2 / b2;
	}
	

	public static void main(String[] args) throws Exception {

		// Begin1
		System.out.println("Begin1");
		int a = 2;
		System.out.println("Периметр квадрата = " + begin1(a));

		// Begin2
		System.out.println("Begin2");
		System.out.println("Площадь квадрата = " + begin2(a));

		// Begin3
		System.out.println("Begin3");
		int b = 3;
		System.out.println("Площадь прямоугольника = " + begin3_1(a, b));
		System.out.println("Периметр прямоугольника = " + begin3_2(a, b));

		// Begin4
		System.out.println("Begin4");
		int d = 2;
		System.out.printf("Длина окружности = %.2f%n", begin4(d));

		// Begin5
		System.out.println("Begin5");
		System.out.println("Обьем куба = " + begin5_1(a));
		System.out.println("Площадь поверхости куба = " + begin5_2(a));

		// Begin6
		System.out.println("Begin6");
		int c = 4;
		System.out.println("Обьем параллелепипеда = " + begin6_1(a, b, c));
		System.out.println("Площадь поверхости параллелепипеда = " + begin6_2(a, b, c));

		// Begin7
		System.out.println("Begin7");
		int r = 4;
		System.out.printf("Длина окружности =  %.2f%n", begin7_1(r));
		System.out.printf("Площадь круга =  %.2f%n", begin7_2(r));

		// Begin8
		System.out.println("Begin8");
		System.out.printf("Среднее =  %.2f%n", begin8(a, b));

		// Begin9
		System.out.println("Begin9");
		System.out.printf("Среднее геометрическое =  %.2f%n", begin9(a, b));

		// Begin10
		System.out.println("Begin10");
		begin10(a, b);
		System.out.printf("сумма их квадратов =  %.2f%n", sum);
		System.out.printf("разность их квадратов =  %.2f%n", dif);
		System.out.printf("произведение их квадратов =  %.2f%n", mul);
		System.out.printf("частное их квадратов =  %.2f%n", div);

		

	}

}
