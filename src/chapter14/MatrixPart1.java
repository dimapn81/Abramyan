package chapter14;

public class MatrixPart1 {

	static void printMatrix(int matrix[][]) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.printf("%4d", matrix[i][j]);
			}
			System.out.println();
		}
	}
	
	static void printLittleMatrix(int matrix[][]) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.printf("%6d", matrix[i][j]);
			}
			System.out.println();
		}
	}


	static int[][] matrix1(int iRow, int matrix[][]) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (i == iRow) {
					matrix[i][j] = j * 10 * iRow;
				} else {
					matrix[i][j] = j;
				}
			}
		}
		return matrix;
	}

	static int[][] matrix2(int jColumn, int matrix[][]) {

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (j == jColumn) {
					matrix[i][j] = i * jColumn * 5;
				} else {
					matrix[i][j] = i;
				}
			}
		}

		return matrix;
	}

	// Заполняем массив array случайным числами
	static int[] randomArray(int m) {
		int[] arrayM = new int[m];
		for (int i = 0; i < arrayM.length; i++) {
			arrayM[i] = (int) (Math.random() * 9);
		}
		return arrayM;
	}

	static void printArray(int array[], String a) {
		System.out.print("array" + a + " - ");
		for (int i = 0; i < array.length; i++) {
			System.out.printf("%3d", array[i]);
		}
		System.out.println();
	}

	static int[][] matrix3(int array[], int matrix[][]) {

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = array[i];
			}
		}
		return matrix;
	}

	static int[][] matrix4(int array[], int matrix[][]) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = array[j];
			}
		}
		return matrix;
	}

	static int[][] matrix5(int d, int array[], int litleMatrix[][]) {
		int sum = 0;
		for (int i = 0; i < litleMatrix.length; i++) {
			litleMatrix[i][0] = array[i];
			sum = 0;
			for (int j = 0; j < litleMatrix[i].length; j++) {
				litleMatrix[i][j] = sum + d + array[i];
				sum = litleMatrix[i][j];
			}
		}
		return litleMatrix;
	}

	static int[][] matrix6(int q, int array[], int litleMatrix[][]) {
		int multy = 1;
		for (int i = 0; i < litleMatrix[0].length; i++) {
			multy = 1;
			litleMatrix[0][i] = array[i];
			for (int j = 0; j < litleMatrix.length; j++) {
				litleMatrix[j][i] = array[i] * multy * q;
				multy = litleMatrix[j][i];
			}
		}
		return litleMatrix;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int m = 10;
		int n = 8;
		int[][] matrix = new int[m][n];

		// Matrix1. Даны целые положительные числа M и N. Сформировать
		// целочисленную матрицу размера M × N, у которой все элементы I-й
		// строки имеют значение 10·I (I = 1, …, M).
		System.out.println("Matrix1");
		int iRow = 2;
		matrix1(iRow, matrix);
		printMatrix(matrix);

		// Matrix2. Даны целые положительные числа M и N. Сформировать
		// целочисленную матрицу размера M × N, у которой все элементы J-го
		// столбца имеют значение 5·J (J = 1, …, N).
		System.out.println("Matrix2");
		int jColumn = 5;
		matrix2(jColumn, matrix);
		printMatrix(matrix);

		// Matrix3. Даны целые положительные числа M, N и набор из M чисел.
		// Сформировать матрицу размера M × N, у которой в каждом столбце
		// содержатся все числа из исходного набора (в том же порядке).
		System.out.println("Matrix3");

		int arrayM[] = randomArray(m);
		matrix3(arrayM, matrix);
		printArray(arrayM, "M");
		printMatrix(matrix);

		// Matrix4. Даны целые положительные числа M, N и набор из N чисел.
		// Сформировать матрицу размера M × N, у которой в каждой строке
		// содержатся все
		// числа из исходного набора (в том же порядке).
		System.out.println("Matrix4");
		int arrayN[] = randomArray(n);
		matrix4(arrayN, matrix);
		printArray(arrayN, "N");
		printMatrix(matrix);

		// Для следующий заданий создадим матрицу 4х5.
		m = 4;
		n = 5;
		int[][] littleMatrix = new int[m][n];

		// Matrix5. Даны целые положительные числа M, N, число D и набор из M
		// чисел. Сформировать матрицу размера M × N, у которой первый столбец
		// совпадает с исходным набором чисел, а элементы каждого следующего
		// столбца равны сумме соответствующего элемента предыдущего столбца и
		// числа D (в результате каждая строка матрицы будет содержать элементы
		// арифметической прогрессии).
		System.out.println("Matrix5");
		int d = 3;
		int arrayMForTask5[] = randomArray(m);
		matrix5(d, arrayMForTask5, littleMatrix);
		printArray(arrayMForTask5, "M");
		printMatrix(littleMatrix);

		// Matrix6. Даны целые положительные числа M, N, число Q и набор из N
		// чисел. Сформировать матрицу размера M × N, у которой первая строка
		// совпадает с исходным набором чисел, а элементы каждой следующей
		// строки равны соответствующему элементу предыдущей строки, умноженному
		// на Q (в результате каждый столбец матрицы будет содержать элементы
		// геометрической прогрессии).
		System.out.println("Matrix6");
		int q = 2;
		int arrayNForTask6[] = randomArray(n);
		matrix6(q, arrayNForTask6, littleMatrix);

		printArray(arrayNForTask6, "N");
		printLittleMatrix(littleMatrix);
	}
}
