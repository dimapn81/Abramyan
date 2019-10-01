/**
 * 
 */
package chapter3begin;


/**
 * @author vector
 *
 */
public class BeginPart3 {
	
	/*Begin25. Найти значение функции y = 3·x6 – 6·x2 – 7 при данном значении x.
	 */
	static int begin25 (int x){
		int y =  3 * (int) Math.pow(x, 6) - 6 *  (int) Math.pow(x, 2) - 7;
		return y;
	}
	
	/*Begin29. Дано значение угла α в градусах (0 < α < 360). Определить значение
	 *	этого же угла в радианах, учитывая, что 180° = π радианов. В качестве значения π использовать 3.14.
	 */
	static double begin29 (int n){
		return  Math.toRadians(n);
	}
	/*Begin29. Дано значение угла α в радианах (0 < α < 2·π). Определить значение
	этого же угла в градусах, учитывая, что 180° = π радианов. В качестве зна-
	чения π использовать 3.14
	*/
	static double begin29 (double d){
		return  Math.toDegrees(d);
	}
	public static void main(String[] args) throws Exception {
		
		
		//Begin25
		int x = 2;
		System.out.println(begin25(x));
		
		//Begin25
		int n = 45;
		System.out.println("Угол = " + n + '\u00B0');
		System.out.format("Значение угла в радианах = %.2f%n", begin29(n));
		
		double d = 1.5;
		System.out.println("Угол = "+ d + " радиан");
		System.out.format("Значения угла в градусах = %.2f%n", begin29(d));
		
	}
}
