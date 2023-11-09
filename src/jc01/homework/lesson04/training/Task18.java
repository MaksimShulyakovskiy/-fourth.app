package jc01.homework.lesson04.training;

public class Task18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double a = 5;
		double b = 5;
		double c = 5;
		
		int count = 0;
		
		if ((a < 0) || (b < 0) || (c < 0)) {
			if (a < 0) {
				count++;
			}
			if (b < 0) {
				count++;
			}
			if (c < 0) {
				count++;
			}
			System.out.println("Число отрицательных чисел = " + count);
		}
		
		else {
			System.out.println("Отрицательные числа отсутсвуют");
		}
	}
}