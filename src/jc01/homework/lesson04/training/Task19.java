package jc01.homework.lesson04.training;

public class Task19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double a = 2;
		double b = -3;
		double c = 4;
		
		int count = 0;
		
		if ((a > 0) || (b > 0) || (c > 0)) {
			if (a > 0) {
				count++;
			}
			if (b > 0) {
				count++;
			}
			if (c > 0) {
				count++;
			}
			System.out.println("Число положительных чисел = " + count);
		}
		
		else {
			System.out.println("Положительные числа отсутсвуют");
		}
	}

}
