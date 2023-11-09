package jc01.homework.lesson04.training;

public class Task30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double a = 6;
		double b = -5;
		double c = 4;
		
		if ((a > b) & (b > c)) {
			a = 2 * a;
			b = 2 * b;
			c = 2 * c;
		}
		
		else {
			if(a < 0) {
				a = Math.abs(a);
			}
			if (b < 0) {
				b = Math.abs(b);
			}
			if (c < 0) {
				c = Math.abs(c);
			}
		}
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}

}
