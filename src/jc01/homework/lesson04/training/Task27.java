package jc01.homework.lesson04.training;

public class Task27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double a = 52;
		double b = 12;
		double c = 18;
		double d = 32;
		
		double max = 0;
		
		if ((a < b) & (c < d)) {
			if (a > c) {
				max = a;
			}
			else {
				max = c;
			}
			
		}
		
		else if ((a < b) & (d < c)) {
			if (a > d) {
				max = a;
			}
			else {
				max = d;
			}
		}
		
		if ((b < a) & (c < d)) {
			if (b > c) {
				max = b;
			}
			else {
				max = c;
			}
			
		}
		
		else if ((b < a) & (d < c)) {
			if (b > d) {
				max = b;
			}
			else {
				max = d;
			}
		}		
		
		System.out.println(max);
	}
}
