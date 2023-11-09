package jc01.homework.lesson04.training;

public class Task28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double a = 42;
		double b = 32;
		double c = 18;
		
		double d = 52;
		
		if ((a == d) || (b == d) || (c == d)) {
			if (a == d) {
				System.out.println("Значение a равно значению d");
			}
			
			else if (b == d) {
				System.out.println("Значение b равно значению d");
			}
			
			else if (c == d) {
				System.out.println("Значение c равно значению d");
			}
		}
		
		else {
			double max = 0;
			if ((d - a) > (d - b) & (d - a) > (d - c)) {
				max = d - a;
			}
			else if ((d - b) > (d - a) & (d - b) > (d - c)) {
				max = d - b;
			}
			else if ((d - c) > (d - a) & (d - c) > (d - b)) {
				max = d - c;
			}
			
			System.out.println(max);
		}
	}

}
