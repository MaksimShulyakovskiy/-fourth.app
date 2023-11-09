package jc01.homework.lesson04.training;

public class Task26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double a = 1;
		double b = 12;
		double c = 6;
		
		double sum = 0;
		
		if ((a > b) & (b > c)) {
			sum = a + c;
		}
		
		else if ((a > c) & (c > b)) {
			sum = a + b;
		}
		
		else if ((b > a) & (a > c)) {
			sum = b + c;
		}
		
		else if ((b > c) & (c > a)) {
			sum = b + a;
		}
		
		else if ((c > a) & (a > b)) {
			sum = c + b;
		}
		
		else if ((c > b) & (b > a)) {
			sum = c + a;
		}
		
		System.out.println("Сумма наибольшего и наименьшего = " + sum);
	}

}
