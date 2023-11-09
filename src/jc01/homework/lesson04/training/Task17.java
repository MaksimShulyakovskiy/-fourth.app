package jc01.homework.lesson04.training;

public class Task17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 5;
		int b = 6;
		
		if (a == b) {
			a = 0;
			b = a;
			System.out.println("a = " + a);
			System.out.println("b = " + b);
		}
		
		else {
			if (a > b) {
				b = a;
				System.out.println("a = " + a);
				System.out.println("b = " + b);
			}
			else {
				a = b;
				System.out.println("a = " + a);
				System.out.println("b = " + b);
			}
		}
	}

}
