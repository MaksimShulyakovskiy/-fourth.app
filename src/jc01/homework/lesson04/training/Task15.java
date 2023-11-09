package jc01.homework.lesson04.training;

public class Task15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double a = 5;
		double b = 4;

		if (a < b) {
			double a1 = (a + b) / 2;
			double b1 = 2 * a * b;
			System.out.println("a = " + a1);
			System.out.println("b = " + b1);
		}
		
		else {
			double b1 = (a + b) / 2;
			double a1 = 2 * a * b;
			System.out.println("b = " + b1);
			System.out.println("a = " + a1);
		}
	}

}
