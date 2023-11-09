package jc01.homework.lesson04.training;

public class Task12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double a = -4;
		double b = -2;
		double c = 3;
		
		if (a >= 0) {
			a = Math.pow(a, 2);
			System.out.println("a = " + a);
		}
		
		else {
			a = Math.pow(a, 4);
			System.out.println("a = " + a);
		}
		
		if (b >= 0) {
			b = Math.pow(b, 2);
			System.out.println("b = " + b);
		}
		
		else {
			b = Math.pow(b, 4);
			System.out.println("b = " + b);
		}
		
		if (c >= 0) {
			c = Math.pow(c, 2);
			System.out.println("c = " + c);
		}
		
		else {
			c = Math.pow(c, 4);
			System.out.println("c = " + c);
		}		
	}

}
