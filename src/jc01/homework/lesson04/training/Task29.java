package jc01.homework.lesson04.training;

public class Task29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double x1 = 3;
		double y1 = 4;
		double x2 = 5;
		double y2 = 6;
		double x3 = 7;
		double y3 = 8;
		
		if ((x2 - x1) / (x3 - x1) == (y2 - y1) / (y3 - y1)) {
			System.out.println("Точки лежат на одной прямой");
		}
		
		else {
			System.out.println("Точки не лежат на одной прямой");
		}
	}

}
