package jc01.homework.lesson04.training;

public class Task08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double a = 5;
		double b = 3;
		
		if (Math.pow(a, 2) > Math.pow(b, 2)) {
			System.out.println("Наименьший из квадратов b = " + Math.pow(b, 2));
		}
		
		else if (Math.pow(b, 2) > Math.pow(a, 2)) {
			System.out.println("Наименьший из квадратов a = " + Math.pow(a, 2));
		}
		
		else {
			System.out.println("квадраты a и b равны");
		}
	}

}
