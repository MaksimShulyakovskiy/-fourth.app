package jc01.homework.lesson04.training;

public class Task13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double x1 = 3;
		double y1 = 5;
		
		double x2 = 4;
		double y2 = 5;
		
		double A = Math.sqrt(Math.pow((x1), 2) + Math.pow((y1), 2));
		double B = Math.sqrt(Math.pow((x2), 2) + Math.pow((y2), 2));
		
		if (A > B) {
			System.out.println("Точка B ближе к началу координат");
		}
		
		else {
			System.out.println("Точка A ближе к началу координат");

		}
	}

}
