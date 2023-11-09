package jc01.homework.lesson04.training;

public class Task22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double x = 3;
		double y = 5;
		
		double z;
		
		if (y > x) {
			z = y;
			y = x;
			x = z;
		}
		System.out.println("Значение x = " + x);
		System.out.println("Значение y = " + y);

	}

}
